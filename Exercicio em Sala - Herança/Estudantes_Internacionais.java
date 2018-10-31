public class Estudantes_Internacionais extends Pessoas {
	private String paisOrigem, nomeEscola;
	private int serie;
	public Estudantes_Internacionais(String nome, String endereco, String nomeEscola, int serie, String paisOrigem) {
		super(nome, endereco);
		this.nomeEscola = nomeEscola;
		this.serie = serie;
		this.paisOrigem = paisOrigem;
	}
	public String toString() {
		return super.toString() + "\nNome da Escola: " + nomeEscola + "\nSérie: " + serie + "\nPaís de Origem: " + paisOrigem;
	}
	public String getPaisOrigem() {
		return paisOrigem;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
}
