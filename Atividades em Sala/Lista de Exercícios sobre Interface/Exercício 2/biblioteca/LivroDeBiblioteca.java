package biblioteca;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {

	private boolean emprestado;
	private String localizacao;

	public LivroDeBiblioteca(String titulo, String autor, short numeroDePaginas, short anoDaEdicao) {
		super(titulo, autor, numeroDePaginas, anoDaEdicao);
	}

	public String toString() {
		if (emprestado == true)
			return super.toString() + "\nStatus do Livro: Emprestado" + "\nLocalização: " + getLocalizacao();
		else
			return super.toString() + "\nStatus do Livro: Disponível" + "\nLocalização: " + getLocalizacao();
	}

	// --------------- Implementando Interface ItemDeBiblioteca ----------------
	public void empresta() {
		setEmprestado(true);
	}
	public void devolve() {
		setEmprestado(false);
	}
	public String descricao() {
		return toString();
	}
	// -------------- -------------- -------------- --------------- ------------

	// -------------- Implementando métodos acessores (get e set) --------------
	public boolean isEmprestado() {
		return emprestado;
	}
	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	// -------------- -------------- -------------- --------------- ------------

}
