package transportes;

public class Bicicleta extends TransporteTerrestre implements Conduzivel {
	
	private int numeroRaios;

	public Bicicleta(String nome, int numeroPassageiros, int velocidadeAtual, float anguloCurvatura, String tipo, int numeroRaios) {
		super(nome, numeroPassageiros, velocidadeAtual, anguloCurvatura, tipo);
		this.numeroRaios = numeroRaios;
	}
	
	@Override
	public boolean estaParado() {
		if(getVelocidadeAtual() == 0)
			return true;
		else
			return false;
	}
	
	@Override
	public void estacionar() {
		setVelocidadeAtual(0);
	}
	
	@Override
	public void curvar(float angulo) {
		setAnguloCurvatura(getAnguloCurvatura() + angulo);
	}
	
	public void pedalar() {
		// Pedalar acrescenta +1 à velocidade atual e muda a condição estaParado() de true para false
		setVelocidadeAtual(getVelocidadeAtual() + 1);
	}
	
	public int getNumeroRaios() {
		return numeroRaios;
	}

	public void setNumeroRaios(int numeroRaios) {
		this.numeroRaios = numeroRaios;
	}
	
}
