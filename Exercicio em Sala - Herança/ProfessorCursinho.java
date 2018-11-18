public class ProfessorCursinho extends Professores{
    private String cursinho;
    public ProfessorCursinho(String nome, String endereco, String disciplina, String cursinho) {
        super(nome, endereco, disciplina);
        this.cursinho = cursinho;
    }
    @Override
    public String toString() {
		return super.toString() + "\nCursinho que leciona: " + this.cursinho;
	}
    public String getCursinho() {
		return this.cursinho;
	}
	public void setCursinho(String cursinho) {
		this.cursinho = cursinho;
	}
}
