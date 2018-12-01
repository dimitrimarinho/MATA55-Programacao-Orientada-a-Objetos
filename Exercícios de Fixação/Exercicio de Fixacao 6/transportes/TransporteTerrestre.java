package transportes; 

public abstract class TransporteTerrestre extends Transporte
{
    private String tipo;
    public TransporteTerrestre (String nome, int numeroPassageiros, int velocidadeAtual, float anguloCurvatura, String tipo){
        super(nome, numeroPassageiros, velocidadeAtual, anguloCurvatura);
        this.tipo = tipo;
    }
    
    public abstract void estacionar();

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
