package Livraria;
import java.util.ArrayList;
public class AplicacaoLivraria {
	public String nomeLivraria;
	public ArrayList <Livros> livros;
	public ArrayList <Revistas> revistas;
	public ArrayList <LivrosDidaticos> livrosDidativos;
	public AplicacaoLivraria(String nomeLivraria) {
		this.nomeLivraria = nomeLivraria;
		this.livros = new ArrayList<Livros>();
		this.revistas = new ArrayList<Revistas>();
		this.livrosDidativos = new ArrayList<LivrosDidaticos>();
	}
	public void criarRevista(String nome, String editora, double preco, String periodicidade) {
		revistas.add(new Revistas(nome, editora, preco, periodicidade));
	}
	public void criarLivro(String nome, String editora, double preco, String autorPrincipal, String resumo) {
		livros.add(new Livros(nome, editora, preco, autorPrincipal, resumo));
	}
	public void criarLivroDidativo(String nome, String editora, double preco, String autorPrincipal, String resumo, String area) {
		livrosDidativos.add(new LivrosDidaticos(nome, editora, preco, autorPrincipal, resumo, area));
	}
	public String consultarResumoDeLivro(Livros livro1) {
		return livro1.getResumo();
	}
	public String toStringLivros(Livros nomeLivro) {
		return nomeLivro.toString();
	}
	public String toStringRevistas(Revistas nomeRevista) {
		return nomeRevista.toString();
	}
	public boolean RevistasDeMesmaEditora(Revistas revista1, Revistas revista2) {
		boolean mesmaEditora;
		if(revista1.getEditora() == revista2.getEditora()){
			mesmaEditora = true;
		}
		else {
			mesmaEditora = false;
		}
		return mesmaEditora;
	}
	public String getNomeLivraria() {
		return nomeLivraria;
	}
	public void setNomeLivraria(String nomeLivraria) {
		this.nomeLivraria = nomeLivraria;
	}
	public ArrayList<Livros> getLivros() {
		return livros;
	}
	public void setLivros(ArrayList<Livros> livros) {
		this.livros = livros;
	}
	public ArrayList<Revistas> getRevistas() {
		return revistas;
	}
	public void setRevistas(ArrayList<Revistas> revistas) {
		this.revistas = revistas;
	}
	public ArrayList<LivrosDidaticos> getLivrosDidativos() {
		return livrosDidativos;
	}
	public void setLivrosDidativos(ArrayList<LivrosDidaticos> livrosDidativos) {
		this.livrosDidativos = livrosDidativos;
	}	
}
