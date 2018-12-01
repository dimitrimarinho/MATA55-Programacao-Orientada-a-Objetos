public abstract class TransporteTerrestre extends Transporte
{
    private String tipo;
    public TransporteTerrestre (String nome, int numeroPassageiros, int velocidadeAtual, String tipo){
        super(nome, numeroPassageiros, velocidadeAtual);
        this.tipo = tipo;
    }
    
    public abstract void estacionar();
}
