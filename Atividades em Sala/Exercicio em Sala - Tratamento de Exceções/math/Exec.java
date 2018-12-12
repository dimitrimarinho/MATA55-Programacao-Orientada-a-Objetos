package math;

import java.util.Scanner;

public class Exec {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Digite o primeiro número real: ");
		double a = s.nextDouble();
		s.nextLine();

		System.out.println("Digite o segundo número real: ");
		double b = s.nextDouble();
		s.nextLine();

		System.out.println("Digite a operação: ");
		char c = s.nextLine().charAt(0);

		System.out.println("Resultado: " + Matematica.calculoOperacoes(a, b, c));

		System.out.println("Digite um inteiro: ");
		int d = s.nextInt();

		System.out.println("Fatorial: " + Matematica.fatorial(d));

		s.close();

	}

}
