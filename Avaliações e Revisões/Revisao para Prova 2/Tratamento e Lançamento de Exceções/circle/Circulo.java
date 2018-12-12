package circle;

public class Circulo {

	private double coordenadaX, coordenadaY, raio;

	public Circulo(double coordenadaX, double coordenadaY, double raio) {
		setCoordenadaX(coordenadaX);
		setCoordenadaY(coordenadaY);
		setRaio(raio);
	}

	public double getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(double coordenadaX) {
		if (coordenadaX < 0)
			throw new IllegalArgumentException("Não é permitido número negativo, digite um número positivo");
		else
			this.coordenadaX = coordenadaX;
	}

	public double getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(double coordenadaY) {
		if (coordenadaY < 0)
			throw new IllegalArgumentException("Não é permitido número negativo, digite um número positivo");
		else
			this.coordenadaY = coordenadaY;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		if (raio < 0)
			throw new IllegalArgumentException("Não é permitido número negativo, digite um número positivo");
		else
			this.raio = raio;
	}
		
}
