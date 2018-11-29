package biblioteca;

public class MapaDeBiblioteca extends Mapa implements ItemDeBiblioteca{
	
	private boolean emprestado;
	private final String localizacao = "Mapoteca";
	
	public MapaDeBiblioteca(String titulo, String descricaoSumaria, double escala) {
		super(titulo, descricaoSumaria, escala);
	}
	
	public void empresta() {
		setEmprestado(true);
	}
	public void devolve() {
		setEmprestado(false);
	}
	public String descricao() {
		return toString();		
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
		if(emprestado == true)
			return super.toString() + "\nMapa da Biblioteca emprestado ? Sim" + "Localização: " + getLocalizacao();
		else
			return super.toString() + "\nMapa da Biblioteca emprestado ? Não" + "Localização: " + getLocalizacao();

	}
	
}