package Exercicio4;
/* 2) Desenvolva uma classe ContaCorrente que deverá conter como atributos seu número
(String), dígito verificador (int) e o saldo (double). Deverá conter um único método
construtor que recebe o número da conta e seu dígito verificador. O saldo deverá ser
iniciado com zero. Essa classe também possuirá dois métodos, um para creditar um valor ao
saldo e outro para debitar um valor ao saldo.
Essa classe também deverá possuir um atributo estático responsável por controlar o número
total de contas correntes que existem no banco. Para isso deverá considerar que toda
instanciação de objeto de ContaCorrente deverá adicionar 1 a esse total. */

public class ContaCorrente {
	private String numero;
	private int digitoVerificador;
	private double saldo;
	/* Essa classe também deverá possuir um atributo estático responsável por controlar o número
	total de contas correntes que existem no banco. Para isso deverá considerar que toda
	instanciação de objeto de ContaCorrente deverá adicionar 1 a esse total. */
	public ContaCorrente(String numero, int digitoVerificador) {
		this.saldo = 0;
	}
	public void creditaValor(double valor) {
		this.saldo+= valor;
	}
	public void debitaValor(double valor) {
		this.saldo-= valor;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getDigitoVerificador() {
		return digitoVerificador;
	}
	public void setDigitoVerificador(int digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
