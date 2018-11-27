   
public class Graduacao extends Curso {
	private int discObrig, discOpta;
	public Graduacao(String codigo, String nome, String area, int vagas, double taxa, int discObrig, int discOpta) {
		super(codigo, nome, area, vagas, taxa);
		this.discObrig = discObrig;
		this.discOpta = discOpta;		
	}
	public String toString() {
		return super.toString() + "\nNúmero de Disciplinas Obrigatórias: " + this.discObrig + "\nNúmero de Disciplinas Optativas: " + this.discOpta;
	}
	public int getDiscObrig() {
		return discObrig;
	}
	public void setDiscObrig(int discObrig) {
		this.discObrig = discObrig;
	}
	public int getDiscOpta() {
		return discOpta;
	}
	public void setDiscOpta(int discOpta) {
		this.discOpta = discOpta;
	}	
}
