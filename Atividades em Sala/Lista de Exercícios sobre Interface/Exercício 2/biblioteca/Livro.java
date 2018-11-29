package biblioteca;

public class Livro {

	private String titulo, autor;
	private short numeroDePaginas, anoDaEdicao;
	public Livro(String titulo, String autor, short numeroDePaginas, short anoDaEdicao) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroDePaginas = numeroDePaginas;
		this.anoDaEdicao = anoDaEdicao;
	}
	
	@Override
	public String toString() {
		return "\nTítulo do Livro: " + getTitulo() + "\nAutor: " + getAutor() + "\nNúmero de Páginas: " + getNumeroDePaginas() + "\nAno da Edição: " + getAnoDaEdicao();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public short getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(short numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public short getAnoDaEdicao() {
		return anoDaEdicao;
	}

	public void setAnoDaEdicao(short anoDaEdicao) {
		this.anoDaEdicao = anoDaEdicao;
	}
	
}
