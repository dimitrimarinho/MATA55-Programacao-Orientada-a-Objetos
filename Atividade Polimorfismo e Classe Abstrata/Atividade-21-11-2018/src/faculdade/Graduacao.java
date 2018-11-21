package faculdade;
public class Graduacao extends Curso {
	private int discObrig, discOpta;
	public Graduacao(String codigo, String nome, String area, int vagas, int discObrig, int discOpta) {
		super(codigo, nome, area, vagas);
		this.discObrig = discObrig;
		this.discOpta = discOpta;		
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
