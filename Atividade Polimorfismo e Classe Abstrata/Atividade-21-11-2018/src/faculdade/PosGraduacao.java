package faculdade;
public class PosGraduacao extends Curso {
	private int maxCargaHoraria;
	public PosGraduacao(String codigo, String nome, String area, int vagas, int maxCargaHoraria) {
		super(codigo, nome, area, vagas);
		this.maxCargaHoraria = maxCargaHoraria;
	}
	public int getMaxCargaHoraria() {
		return maxCargaHoraria;
	}
	public void setMaxCargaHoraria(int maxCargaHoraria) {
		this.maxCargaHoraria = maxCargaHoraria;
	}	
}
