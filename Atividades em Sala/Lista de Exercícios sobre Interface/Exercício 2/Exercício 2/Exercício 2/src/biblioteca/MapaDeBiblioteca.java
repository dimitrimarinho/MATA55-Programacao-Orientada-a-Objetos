package biblioteca;

public class MapaDeBiblioteca extends Mapa implements ItemDeBiblioteca{
	
	private boolean emprestado;
	private final String localizacao = "Mapoteca";
	
	public MapaDeBiblioteca(String titulo, String descricaoSumaria, double escala, boolean emprestado) {
		super(titulo, descricaoSumaria, escala);
		this.emprestado = emprestado;
	}
	
	String descricao() {
		return super.toString();		
	}
	
	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	@Override
	public String toString() {
		return "MapaDeBiblioteca [emprestado=" + emprestado + ", localizacao=" + localizacao + "]";
	}
	
}