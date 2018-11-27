public class Revistas extends Titulos {
	private String periodicidade;
	public Revistas(String nome, String editora, double preco, String periodicidade) {
		super(nome, editora, preco);
		this.periodicidade = periodicidade;
	}
	public String toString() {
		return super.toString() + "\nPeriodicidade: " + periodicidade;
	}
	public String getPeriodicidade() {
		return periodicidade;
	}
	public void setPeriodicidade(String periodicidade) {
		this.periodicidade = periodicidade;
	}	
}
