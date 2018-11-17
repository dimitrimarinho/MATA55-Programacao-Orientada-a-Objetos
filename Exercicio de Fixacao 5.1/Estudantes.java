public class Estudantes extends Pessoas {
	private String nomeEscola;
	private int serie;
	public Estudantes(String nome, String endereco, String nomeEscola, int serie) {
		super(nome, endereco);
		this.nomeEscola = nomeEscola;
		this.serie = serie;
	}
	public String toString() {
		return super.toString() + "\nNome da Escola: " + nomeEscola + "\nSérie: " + serie;
 	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
}
