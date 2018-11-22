   
public abstract class Curso {
	private String codigo, nome, area;
	private int vagas;			 
	private double taxa;    	
	public Curso(String codigo, String nome, String area, int vagas, double taxa) {	
		this.codigo = codigo;
		this.nome = nome;
		this.area = area;
		this.vagas = vagas;
		this.taxa = taxa;
	}
	public String toString() {
		return "\nNome do curso: " + this.nome + "\nCódigo do curso: " + this.codigo + "\nÁrea: " + this.area + "\nQuantidade de Vagas: " + this.vagas;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getVagas() {
		return vagas;
	}
	public void setVagas(int vagas) {
		this.vagas = vagas;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}	
}
