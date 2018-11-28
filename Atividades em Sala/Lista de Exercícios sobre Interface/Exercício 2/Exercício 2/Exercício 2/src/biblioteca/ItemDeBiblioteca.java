package biblioteca;

public interface ItemDeBiblioteca {

	public final static int máximoDeDiasParaEmpréstimo = 14;
	public void empresta();
	public void devolve();
	String descricao();
	
}
