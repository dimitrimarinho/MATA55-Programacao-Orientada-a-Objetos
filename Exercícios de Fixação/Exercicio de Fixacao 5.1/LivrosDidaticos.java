public class LivrosDidaticos extends Livros {
	private String area;
	public LivrosDidaticos(String nome, String editora, double preco, String autorPrincipal, String resumo,
			String area) {
		super(nome, editora, preco, autorPrincipal, resumo);
		this.area = area;
	}
	public String toString() {
		return super.toString() + "\nÁrea: " + area;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
}
