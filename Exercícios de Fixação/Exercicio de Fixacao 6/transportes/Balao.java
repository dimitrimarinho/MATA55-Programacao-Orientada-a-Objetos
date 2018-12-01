package transportes;

public class Balao extends TransporteAereo {
	
	private int pesoLargada;

	public Balao(String nome, int numeroPassageiros, int velocidadeAtual, float anguloCurvatura, int altitudeAtual, int pesoLargada) {
		super(nome, numeroPassageiros, velocidadeAtual, anguloCurvatura, altitudeAtual);
		this.pesoLargada = pesoLargada;
	}
	
	@Override
	public boolean estaParado() {
		if(getVelocidadeAtual() == 0)
			return true;
		else
			return false;		
	}
	
	@Override
	public void subir(int metros) {
		setAltitudeAtual(getAltitudeAtual() + metros);
	}

	@Override
	public void descer(int metros) {
		setAltitudeAtual(getAltitudeAtual() - metros);
	}
	
	public void largarPeso(float peso) {
		// Implementação: Para cada 1 kg de peso largado, o balão sobe 2 metros
		int subirQuantosMetros = (int) (2 * peso);
		setAltitudeAtual(getAltitudeAtual() + subirQuantosMetros);
		setPesoLargada(getPesoLargada() - (int) peso);
	}
	
	public void aquecerAr(float temperatura) {
		// Implementação: Para cada 5º C aquecido o balão sobe 20 metros
		int subirQuantosMetros = (int) (20 * (temperatura/5));
		setAltitudeAtual(getAltitudeAtual() + subirQuantosMetros);
	}
	
	public int getPesoLargada() {
		return pesoLargada;
	}

	public void setPesoLargada(int pesoLargada) {
		this.pesoLargada = pesoLargada;
	}
		
}
