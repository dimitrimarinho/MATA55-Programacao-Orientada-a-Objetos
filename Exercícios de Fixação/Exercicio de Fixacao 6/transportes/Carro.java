package transportes;

public class Carro extends TransporteTerrestre implements Motorizado, Conduzivel {
	
	// Acrescentado atributo (int) combustívelAtual devido à Interface Motorizado que possui o método abastecer(int numLitros)
	private int numeroCilindrada, combustivelAtual;
	// Acrescentado o atributo (boolean) motorLigado devido à Interface Motorizado que possui o método ligarMotor() 
	private boolean motorLigado;

	public Carro(String nome, int numeroPassageiros, int velocidadeAtual, float anguloCurvatura, String tipo, 
			int numeroCilindrada, int combustivelAtual, boolean motorLigado) {
		super(nome, numeroPassageiros, velocidadeAtual, anguloCurvatura, tipo);
		this.numeroCilindrada = numeroCilindrada;
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
	public void estacionar() {
		setVelocidadeAtual(0);
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
	
	public void embrear() {
		// Embrear acrescenta +1 à velocidade atual e muda a condição estaParado() de true para false
		setVelocidadeAtual(getVelocidadeAtual() + 1);
	}
			
	public int getNumeroCilindrada() {
		return numeroCilindrada;
	}

	public void setNumeroCilindrada(int numeroCilindrada) {
		this.numeroCilindrada = numeroCilindrada;
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
