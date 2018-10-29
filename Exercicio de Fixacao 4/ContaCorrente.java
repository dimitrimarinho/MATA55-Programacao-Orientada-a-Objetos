public class ContaCorrente{
	private String numero;
	private int digitoVerificador;
	private double saldo;
	private static int totalContasCorrentes;
	public ContaCorrente(String numero, int digitoVerificador){
		this.saldo = 0;
		this.numero = numero;
		this.digitoVerificador = digitoVerificador;
		this.totalContasCorrentes++;
	}
	public void creditaValor(double valor){
		this.saldo+= valor;
	}
	public void debitaValor(double valor){
		this.saldo-= valor;
	}
	public String getNumero(){
		return numero;
	}
	public void setNumero(String numero){
		this.numero = numero;
	}
	public int getDigitoVerificador(){
		return digitoVerificador;
	}
	public void setDigitoVerificador(int digitoVerificador){
		this.digitoVerificador = digitoVerificador;
	}
	public double getSaldo(){
		return saldo;
	}
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
}
