
public abstract class Transporte
{
    private String nome;
    private int numeroPassageiros, velocidadeAtual;
    
    public Transporte (String nome, int numeroPassageiros, int velocidadeAtual){
        this.nome = nome;
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeAtual = velocidadeAtual;
    }
    
    public abstract boolean estaParado();

}
