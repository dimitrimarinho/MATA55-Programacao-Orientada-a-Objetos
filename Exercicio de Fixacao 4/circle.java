public class circle {
	private double raio;
	private static double PI = 3.14159;
	public circle(double raio) {
		this.raio = raio;
	}
	public double area() {
		double area = PI * raio * raio;
		return area;
	}
	public double perimetro() {
		double perimetro = 2 * PI * raio;
		return perimetro;
	}
	public double getRaio() {
		return this.raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}	
}
