public class Estudantes_Internacionais extends Estudantes {
	private String paisOrigem, nomeEscola;
	private int serie;
	public Estudantes_Internacionais(String nome, String endereco, String nomeEscola, int serie, String paisOrigem) {
		super(nome, endereco, nomeEscola, serie);
		this.paisOrigem = paisOrigem;
	}
	@Override
	public String toString() {
		return super.toString() + "\nNome da Escola: " + nomeEscola + "\nSérie: " + serie + "\nPaís de Origem: " + paisOrigem;
	}
	public String getPaisOrigem() {
		return paisOrigem;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
}
