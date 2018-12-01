package transportes;

public class Aviao extends TransporteAereo implements Motorizado, Conduzivel {

	// Acrescentado atributo (int) combustívelAtual devido à Interface Motorizado que possui o método abastecer(int numLitros)
	private int numeroMotores, combustivelAtual;
	// Acrescentado o atributo (boolean) motorLigado devido à Interface Motorizado que possui o método ligarMotor() 
	private boolean motorLigado;

	public Aviao(String nome, int numeroPassageiros, int velocidadeAtual, float anguloCurvatura, int altitudeAtual, int numeroMotores, int combustivelAtual, boolean motorLigado) {
		super(nome, numeroPassageiros, velocidadeAtual, anguloCurvatura, altitudeAtual);
		this.numeroMotores = numeroMotores;
		this.combustivelAtual = combustivelAtual;
		this.motorLigado = motorLigado;
	}

	@Override
	public boolean estaParado() {
		if(getVelocidadeAtual() == 0)
			return true;
		else
			return false;			
	}
	
	@Override
	public void subir (int metros) {
		setAltitudeAtual(getAltitudeAtual() + metros);
	}
	
	@Override
	public void descer (int metros) {
		setAltitudeAtual(getAltitudeAtual() - metros);
	}
	
	@Override
	public void curvar(float angulo) {
		setAnguloCurvatura(getAnguloCurvatura() + angulo);
	}
	
	@Override
	public void abastecer(int numLitros) {
		setCombustivelAtual(getCombustivelAtual() + numLitros);
	}
	
	@Override
	public void ligarMotor() {
		if(isMotorLigado() == false)
			setMotorLigado(true);
	}
					
	public int getNumeroMotores() {
		return numeroMotores;
	}

	public void setNumeroMotores(int numeroMotores) {
		this.numeroMotores = numeroMotores;
	}
	
	public int getCombustivelAtual() {
		return combustivelAtual;
	}

	public void setCombustivelAtual(int combustivelAtual) {
		this.combustivelAtual = combustivelAtual;
	}

	public boolean isMotorLigado() {
		return motorLigado;
	}

	public void setMotorLigado(boolean motorLigado) {
		this.motorLigado = motorLigado;
	}	
		
}
