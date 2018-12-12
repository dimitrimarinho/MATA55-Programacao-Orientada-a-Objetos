   
public class PosGraduacao extends Curso {
	private int maxCargaHoraria;
	public PosGraduacao(String codigo, String nome, String area, int vagas, double taxa, int maxCargaHoraria) {
		super(codigo, nome, area, vagas, taxa);
		this.maxCargaHoraria = maxCargaHoraria;
	}
	@Override
	public String toString() {
		return super.toString() + "\nCarga Horária Máxima";
	}
	public int getMaxCargaHoraria() {
		return maxCargaHoraria;
	}
	public void setMaxCargaHoraria(int maxCargaHoraria) {
		this.maxCargaHoraria = maxCargaHoraria;
	}	
}
