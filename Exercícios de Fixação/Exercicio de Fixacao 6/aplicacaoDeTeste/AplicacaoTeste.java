package aplicacaoDeTeste;

import java.util.Scanner;
import transportes.*;

public class AplicacaoTeste {
	
	public static void main(String[] args) {
		
		System.out.println("Adicionando classes e verificando o conteúdo dos métodos e atributos ...");
		
		Aviao Aviao;
		Aviao TransporteAdicionado = null;
		Balao Balao;
		Balao TransporteAdicionado2 = null;
		Carro Carro;
		Carro TransporteAdicionado3 = null;
		Bicicleta Bicicleta;
		Bicicleta TransporteAdicionado4 = null;
		
		System.out.println("O que deseja adicionar ? Digite '1' para Aviao, '2' para Balao, '3' para Carro ou '4' para Bicicleta");
		Scanner scanner = new Scanner(System.in);
		int resposta;
		resposta = scanner.nextInt();
		@SuppressWarnings("unused")
		String nome, tipo, enter;
		int numeroPassageiros, velocidadeAtual, altitudeAtual, numeroMotores, combustivelAtual, pesoLargada, numeroCilindrada, numeroRaios;
		float anguloCurvatura;
		boolean motorLigado;
		switch(resposta) {
			case 1:
				System.out.println("Digite corretamente e em ordem os atributos para a Classe Aviao");
				enter = scanner.nextLine();
				nome = scanner.nextLine();
				numeroPassageiros = scanner.nextInt();
				velocidadeAtual = scanner.nextInt();
				anguloCurvatura = scanner.nextFloat();
				altitudeAtual = scanner.nextInt();
				numeroMotores = scanner.nextInt();
				combustivelAtual = scanner.nextInt();
				motorLigado = scanner.nextBoolean();
				TransporteAdicionado = new Aviao(nome, numeroPassageiros, velocidadeAtual, anguloCurvatura, altitudeAtual, numeroMotores, combustivelAtual, motorLigado);
			break;
			case 2:
				System.out.println("Digite corretamente e em ordem os atributos para a Classe Balao");
				enter = scanner.nextLine();
				nome = scanner.nextLine();
				numeroPassageiros = scanner.nextInt();
				velocidadeAtual = scanner.nextInt();
				anguloCurvatura = scanner.nextFloat();
				altitudeAtual = scanner.nextInt();
				pesoLargada = scanner.nextInt();
				TransporteAdicionado2 = new Balao(nome, numeroPassageiros, velocidadeAtual, anguloCurvatura, altitudeAtual, pesoLargada);
			break;
			case 3:
				System.out.println("Digite corretamente e em ordem os atributos para a Classe Carro");
				nome = scanner.nextLine();
				enter = scanner.nextLine();
				numeroPassageiros = scanner.nextInt();
				velocidadeAtual = scanner.nextInt();
				anguloCurvatura = scanner.nextFloat();
				tipo = scanner.nextLine();
				enter = scanner.nextLine();
				numeroCilindrada = scanner.nextInt();
				combustivelAtual = scanner.nextInt();
				motorLigado = scanner.nextBoolean();
				TransporteAdicionado3 = new Carro(nome, numeroPassageiros, velocidadeAtual, anguloCurvatura, tipo, numeroCilindrada, combustivelAtual, motorLigado);
			break;
			case 4:
				System.out.println("Digite corretamente e em ordem os atributos para a Classe Bicicleta");
				enter = scanner.nextLine();
				nome = scanner.nextLine();
				numeroPassageiros = scanner.nextInt();
				velocidadeAtual = scanner.nextInt();
				anguloCurvatura = scanner.nextFloat();
				tipo = scanner.nextLine();
				enter = scanner.nextLine();
				numeroRaios = scanner.nextInt();
				TransporteAdicionado4 = new Bicicleta(nome, numeroPassageiros, velocidadeAtual, anguloCurvatura, tipo, numeroRaios);
			break;
			default:
				System.out.println("Comando inválido");
			break;
		}
		if(resposta == 1 || resposta == 2 || resposta == 3 || resposta == 4) {
			System.out.println("Imprimindo atributos e métodos ...");
			Transporte aux;
			switch(resposta) {
				case 1:
					
					aux = (Transporte) TransporteAdicionado;
					
					System.out.println("Atributos:");
					   
					System.out.println("    Nome: " + aux.getNome());
					System.out.println("    Número de passageiros: " + aux.getNumeroPassageiros() );
					System.out.println("    velocidadeAtual: " + aux.getVelocidadeAtual() );
					System.out.println("    Angulo de Curvatura: " + aux.getAnguloCurvatura() );
					
					Aviao = (Aviao) TransporteAdicionado;
					
					System.out.println("    Altitude Atual: " + Aviao.getAltitudeAtual() );

					System.out.println("    Número de motores: " + Aviao.getNumeroMotores( ) );
					System.out.println("    Motor Ligado: " + Aviao.isMotorLigado() );
					System.out.println("    Combustível Atual: " + Aviao.getCombustivelAtual() );

					System.out.println("\nMétodos:");
					
					System.out.println("    estaParado(): " + Aviao.estaParado() );
					System.out.println("Digite a quantidade de metros (inteiro) para testar os métodos subir e descer");
					int metros = scanner.nextInt();
					Aviao.subir(metros);
					System.out.println("    subir(int metros) : " + Aviao.getAltitudeAtual() );
					Aviao.descer(metros);
					System.out.println("    descer(int metros): " + Aviao.getAltitudeAtual() );
					System.out.println("Digite o angulo (float) para testar o método curvar");
					float angulo = scanner.nextFloat();
					Aviao.curvar(angulo);
					System.out.println("    curvar(float angulo): " + Aviao.getAnguloCurvatura() );
					System.out.println("Digite a quantidade de litros (inteiro) para testar o método abastecer");
					int numLitros = scanner.nextInt();
					Aviao.abastecer(numLitros);
					System.out.println("    abastecer(int metros): " + Aviao.getCombustivelAtual() );
					System.out.println("    ligarMotor(): " + Aviao.isMotorLigado() );
				break;
				case 2:
					aux = (Transporte) TransporteAdicionado2;
					
					System.out.println("Atributos:");
					   
					System.out.println("    Nome: " + aux.getNome());
					System.out.println("    Número de passageiros: " + aux.getNumeroPassageiros() );
					System.out.println("    velocidadeAtual: " + aux.getVelocidadeAtual() );
					System.out.println("    Angulo de Curvatura: " + aux.getAnguloCurvatura() );
					
					Balao = (Balao) TransporteAdicionado2;
					
					System.out.println("    Altitude Atual: " + Balao.getAltitudeAtual() );

					System.out.println("    Peso Inicial: " + Balao.getPesoLargada() );

					System.out.println("\nMétodos:");
					
					System.out.println("    estaParado(): " + Balao.estaParado() );
					System.out.println("Digite a quantidade de metros (inteiro) para testar os métodos subir e descer");
					metros = scanner.nextInt();
					Balao.subir(metros);
					System.out.println("    subir(int metros) : " + Balao.getAltitudeAtual() );
					Balao.descer(metros);
					System.out.println("    descer(int metros): " + Balao.getAltitudeAtual() );
					System.out.println("Digite a quantidade de peso (float) para testar o método largarPeso");
					float peso = scanner.nextFloat();
					Balao.largarPeso(peso);
					System.out.println("    largarPeso(): " + Balao.getPesoLargada() );
					System.out.println("Digite quantos graus (float) foi aquecido o balão para testar o método aquecerAr");
					System.out.println("Para cada 5º C aquecido o balão sobe 20 metros");
					float temperatura = scanner.nextFloat();
					Balao.aquecerAr(temperatura);		
					System.out.println("    Altitude Atual: " + Balao.getAltitudeAtual() );
				break;
				case 3:
					
					aux = (Transporte) TransporteAdicionado3;
					
					System.out.println("Atributos:");
					   
					System.out.println("    Nome: " + aux.getNome());
					System.out.println("    Número de passageiros: " + aux.getNumeroPassageiros() );
					System.out.println("    velocidadeAtual: " + aux.getVelocidadeAtual() );
					System.out.println("    Angulo de Curvatura: " + aux.getAnguloCurvatura() );
					
					Carro = (Carro) TransporteAdicionado3;
					
					System.out.println("    Tipo: " + Carro.getTipo() );

					System.out.println("    Número de Cilindradas: " + Carro.getNumeroCilindrada() );
					System.out.println("    Motor Ligado: " + Carro.isMotorLigado() );
					System.out.println("    Combustível Atual: " + Carro.getCombustivelAtual() );

					System.out.println("\nMétodos:");
					
					System.out.println("    estaParado(): " + Carro.estaParado() );
					System.out.println("    aplicando estacionar() ... , estaParado() : " + Carro.estaParado() );
					System.out.println("Digite o angulo (float) para testar o método curvar");
					angulo = scanner.nextFloat();
					Carro.curvar(angulo);
					System.out.println("    curvar(float angulo): " + Carro.getAnguloCurvatura() );
					System.out.println("Digite a quantidade de litros (inteiro) para testar o método abastecer");
					numLitros = scanner.nextInt();
					Carro.abastecer(numLitros);
					System.out.println("    abastecer(int metros): " + Carro.getCombustivelAtual() );
					System.out.println("    ligarMotor(): " + Carro.isMotorLigado() );
					System.out.println("    aplicando embrear() ... , estaParado() : " + Carro.estaParado() );
				break;
				case 4:
					aux = (Transporte) TransporteAdicionado4;
					
					System.out.println("Atributos:");
					   
					System.out.println("    Nome: " + aux.getNome());
					System.out.println("    Número de passageiros: " + aux.getNumeroPassageiros() );
					System.out.println("    velocidadeAtual: " + aux.getVelocidadeAtual() );
					System.out.println("    Angulo de Curvatura: " + aux.getAnguloCurvatura() );
					
					Bicicleta = (Bicicleta) TransporteAdicionado4;
					
					System.out.println("    Tipo: " + Bicicleta.getTipo() );

					System.out.println("    Número de Raios: " + Bicicleta.getNumeroRaios() );

					System.out.println("\nMétodos:");
					
					System.out.println("    estaParado(): " + Bicicleta.estaParado() );
					System.out.println("    aplicando estacionar() ... , estaParado() : " + Bicicleta.estaParado() );
					System.out.println("Digite o angulo (float) para testar o método curvar");
					angulo = scanner.nextFloat();
					Bicicleta.curvar(angulo);
					System.out.println("    curvar(float angulo): " + Bicicleta.getAnguloCurvatura() );
					System.out.println("    aplicando pedalar() ... , estaParado() : " + Bicicleta.estaParado() );					
				break;
			}
		}
		scanner.close();
	}	
}
