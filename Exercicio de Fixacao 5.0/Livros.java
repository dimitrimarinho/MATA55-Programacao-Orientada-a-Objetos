package Livraria;
public class Livros extends Titulos {
	private String autorPrincipal, resumo;
		public Livros(String nome, String editora, double preco, String autorPrincipal, String resumo) {
		super(nome, editora, preco);
		this.autorPrincipal = autorPrincipal;
		this.resumo = resumo;
	}
	public String toString() {
		return super.toString() + "\nAutor Principal: " + autorPrincipal + "\nResumo: " + resumo;
	}
	public String getAutorPrincipal() {
		return autorPrincipal;
	}	
	public void setAutorPrincipal(String autorPrincipal) {
		this.autorPrincipal = autorPrincipal;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
}
