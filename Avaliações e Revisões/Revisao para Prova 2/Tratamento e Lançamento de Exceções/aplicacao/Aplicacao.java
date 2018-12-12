package aplicacao;

import circle.*;
import java.util.Scanner;

public class Aplicacao {
	
	public static void main(String[] args) {
			
		double coordenadaX = 0, coordenadaY = 0, raio = 0;
		Circulo novoCirculo = new Circulo(coordenadaX, coordenadaY, raio);
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a Coordenada X: ");
		coordenadaX = s.nextDouble();
		if(coordenadaX < 0) {
			while(coordenadaX < 0) {
				System.out.println("Este atributo não pode ser negativo. O atributo deve ser positivo. \nDigite a Coordenada X: ");
				coordenadaX = s.nextDouble();
				s.nextLine();
			}
		}
		else { 
			novoCirculo.setCoordenadaX(coordenadaX);
			s.nextLine();
		}
		novoCirculo.setCoordenadaX(coordenadaX);
		
		System.out.println("Digite a Coordenada Y: ");
		coordenadaY = s.nextDouble();
		if(coordenadaY < 0) {
			while(coordenadaY < 0) {
				System.out.println("Este atributo não pode ser negativo. O atributo deve ser positivo. \nDigite a Coordenada Y: ");
				coordenadaY = s.nextDouble();
				s.nextLine();
			}
		}
		else {
			novoCirculo.setCoordenadaY(coordenadaY);
			s.nextLine();
		}
		novoCirculo.setCoordenadaY(coordenadaY);
		
		System.out.println("Digite o raio: ");
		raio = s.nextDouble();
		if(raio < 0) {
			while(raio < 0) {
				System.out.println("Este atributo não pode ser negativo. O atributo deve ser positivo. \nDigite o raio: ");
				raio = s.nextDouble();
				s.nextLine();
			}
		}
		else {
			novoCirculo.setRaio(raio);
			s.nextLine();
		}
		novoCirculo.setRaio(raio);
		
		System.out.println("\nCoordenada X: " + novoCirculo.getCoordenadaX() + "\nCoordenada Y: " + novoCirculo.getCoordenadaY() + "\nRaio: " + novoCirculo.getRaio());
		s.close();
	}	
}
