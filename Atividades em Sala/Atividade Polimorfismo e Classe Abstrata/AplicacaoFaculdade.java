import java.util.Scanner;
public class AplicacaoFaculdade {
	public static void main(String[] args) {
	}
	public Graduacao criaGraduacao (String codigo, String nome, String area, int vagas, double taxa, int discObrig, int discOpta) {
	    Graduacao novaGraduacao = new Graduacao(codigo, nome, area, vagas, taxa, discObrig, discOpta);
	    return novaGraduacao;
	}
	public PosGraduacao criaPosGraduacao(String codigo, String nome, String area, int vagas, double taxa, int maxCargaHoraria) {
		PosGraduacao novaPosGraduacao = new PosGraduacao(codigo, nome, area, vagas, taxa, maxCargaHoraria);
		return novaPosGraduacao;
	}
	public String consultaInformacoes(Curso cursoConsultado) {
		String informacoes = "";
		if(cursoConsultado instanceof Graduacao) {
			Graduacao aux = (Graduacao) cursoConsultado;
			informacoes = aux.toString();
		}
		else if(cursoConsultado instanceof PosGraduacao) {
			PosGraduacao aux = (PosGraduacao) cursoConsultado;
			informacoes = aux.toString();
		}
		return informacoes;
	}
	public double consultaTaxa(Curso cursoConsultado) {
		Scanner scanner = new Scanner(System.in);
		double taxaFinal = 0;
		if (cursoConsultado instanceof Graduacao) {
			Graduacao aux = (Graduacao) cursoConsultado;
			taxaFinal = 0.90 * aux.getTaxa();
			System.out.println("O aluno a ser matriculado possui irmão na escola ? Digite 'Sim' caso positivo.");
			String temIrmao = scanner.nextLine();
			if(temIrmao.equals("Sim"))
				taxaFinal = 0.84 * aux.getTaxa();
		}
		else if (cursoConsultado instanceof PosGraduacao) {
			PosGraduacao aux = (PosGraduacao) cursoConsultado;
			taxaFinal = 0.95 * aux.getTaxa();
			System.out.println("O aluno a ser matriculado fez a graduacao na faculdade ? Digite 'Sim' caso positivo.");
			String exAluno = scanner.nextLine();
			if(exAluno.equals("Sim"))
				taxaFinal = 0.90 * aux.getTaxa();
		}
		scanner.close();
		return taxaFinal;
	}
}
