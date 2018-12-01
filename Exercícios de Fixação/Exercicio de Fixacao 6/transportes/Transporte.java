package transportes;
 
public abstract class Transporte
{
    private String nome;
    private int numeroPassageiros, velocidadeAtual;
	// Acrescentado o atributo (float) anguloCurvatura devido à Interface Conduzível que possui o método curvar(float angulo) 
    private float anguloCurvatura;
    
    public Transporte (String nome, int numeroPassageiros, int velocidadeAtual, float anguloCurvatura){
        this.nome = nome;
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeAtual = velocidadeAtual;
        this.anguloCurvatura = anguloCurvatura;
    }
    
    public abstract boolean estaParado();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}

	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	
	public float getAnguloCurvatura() {
		return anguloCurvatura;
	}

	public void setAnguloCurvatura(float anguloCurvatura) {
		this.anguloCurvatura = anguloCurvatura;
	}      

}
