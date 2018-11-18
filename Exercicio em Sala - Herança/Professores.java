public class Professores extends Pessoas {
	private String disciplina;
	public Professores(String nome, String endereco, String disciplina) {
		super(nome, endereco);
		this.disciplina = disciplina;
	}
	@Override
	public String toString() {
		return "\nNome: Prof. "+ super.getNome() + "\nEndereço: " + super.getEndereco() + "\nDisciplina: " + disciplina;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
}
