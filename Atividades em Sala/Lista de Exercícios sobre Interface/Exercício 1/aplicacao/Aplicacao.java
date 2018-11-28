package aplicacao;
import tv.*;
public class Aplicacao {
	public static void main(String[] args) {
		ModeloTV001 tv1ModeloTV001 = new ModeloTV001(25);
		ModeloSDX tv2ModeloSDX = new ModeloSDX(42);
		
		System.out.println("Ligando a televisão do modelo " + tv1ModeloTV001.MODELO + "..."); 
		tv1ModeloTV001.ligar();
		System.out.println("Ligando a televisão do modelo " + tv2ModeloSDX.MODELO + "..."); 
		tv2ModeloSDX.ligar();
		
		System.out.println("Aumentando o volume da televisão " + tv1ModeloTV001.MODELO + "..."); 
		tv1ModeloTV001.aumentarVolume();
		System.out.println("Novo volume da televisão " + tv1ModeloTV001.MODELO + " é " + tv1ModeloTV001.getVolume()); 
		System.out.println("Aumentando o volume da televisão " + tv2ModeloSDX.MODELO + "..."); 
		tv2ModeloSDX.aumentarVolume();
		System.out.println("Novo volume da televisão " + tv2ModeloSDX.MODELO + " é " + tv2ModeloSDX.getVolume()); 
		
		System.out.println("Diminuindo o volume da televisão " + tv1ModeloTV001.MODELO + "..."); 
		tv1ModeloTV001.diminuirVolume();
		System.out.println("Novo volume da televisão " + tv1ModeloTV001.MODELO + " é " + tv1ModeloTV001.getVolume()); 
		System.out.println("Diminuindo o volume da televisão " + tv2ModeloSDX.MODELO + "..."); 
		tv2ModeloSDX.diminuirVolume();
		System.out.println("Novo volume da televisão " + tv2ModeloSDX.MODELO + " é " + tv2ModeloSDX.getVolume()); 

		System.out.println("Mudando o canal da televisão " + tv1ModeloTV001.MODELO + "..."); 
		tv1ModeloTV001.mudarCanal(2);
		System.out.println("Novo canal da televisão " + tv1ModeloTV001.MODELO + " é " + tv1ModeloTV001.getCanal()); 
		System.out.println("Mudando o canal da televisão " + tv2ModeloSDX.MODELO + "..."); 
		tv2ModeloSDX.mudarCanal(13);
		System.out.println("Novo canal da televisão " + tv2ModeloSDX.MODELO + " é " + tv2ModeloSDX.getCanal()); 

		System.out.println("Desligando a televisão do modelo " + tv1ModeloTV001.MODELO + "..."); 
		tv1ModeloTV001.desligar();
		System.out.println("Desligando a televisão do modelo " + tv2ModeloSDX.MODELO + "..."); 
		tv2ModeloSDX.desligar();
	
	}
}
