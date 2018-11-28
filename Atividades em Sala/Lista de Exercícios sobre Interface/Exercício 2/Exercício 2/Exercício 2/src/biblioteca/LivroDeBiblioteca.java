package biblioteca;

public class LivroDeBiblioteca extends Livro {
	
	private boolean emprestado;
	private String localizacao;
	public LivroDeBiblioteca(String titulo, String autor, short numeroDePaginas, short anoDaEdicao, boolean emprestado,
			String localizacao) {
		super(titulo, autor, numeroDePaginas, anoDaEdicao);
		this.emprestado = emprestado;
		this.localizacao = localizacao;
	}
	
	@Override
	String descricao() {
		return super.toString();
	}

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
	
}
