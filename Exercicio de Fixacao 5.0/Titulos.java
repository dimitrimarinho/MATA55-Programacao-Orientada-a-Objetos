package Livraria;
public class Titulos {
	private String nome, editora;
	private double preco;
	public Titulos(String nome, String editora, double preco) {
		this.nome = nome;
		this.editora = editora;
		this.preco = preco;
	}
	public String toString() {
		return "\nNome da Publicação: " + nome + "\nEditora: " + editora + "\nPreço: " + preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}	
}
