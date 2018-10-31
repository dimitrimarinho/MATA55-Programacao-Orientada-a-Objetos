public class Professores extends Pessoas {
	private String disciplina;

	public Professores(String nome, String endereco, String disciplina) {
		super(nome, endereco);
		this.disciplina = disciplina;
	}
	public String toString() {
		return super.toString() + "\nDisciplina: " + disciplina;
	}
	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}	
}
