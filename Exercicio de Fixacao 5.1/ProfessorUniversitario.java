public class ProfessorUniversitario extends Professores{
    private String universidade;
    public ProfessorUniversitario(String nome, String endereco, String disciplina, String universidade) {
        super(nome, endereco, disciplina);
        this.universidade = universidade;
    }
    @Override
    public String toString() {
		return super.toString() + "\nUniversidade que leciona: " + this.universidade;
	}
    public String getUniversidade() {
		return this.universidade;
	}
	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}
}
