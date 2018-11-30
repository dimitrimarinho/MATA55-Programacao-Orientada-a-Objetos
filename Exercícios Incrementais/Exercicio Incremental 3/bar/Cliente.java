package bar;
public class Cliente {
	private int ID, tipo, categoria;
	private String nome;
	public Cliente(int ID, int tipo, int categoria, String nome) {
		this.ID = ID;
		this.tipo = tipo;
		this.categoria = categoria;
		this.nome = nome;
		informacaoSobreTipoDeCliente(tipo);
		informacaoSobreCategoriaDoCliente(categoria);
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getTipo() {
		informacaoSobreTipoDeCliente(tipo);
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
		informacaoSobreTipoDeCliente(tipo);
	}
	public int getCategoria() {
		informacaoSobreCategoriaDoCliente(categoria);
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
		informacaoSobreCategoriaDoCliente(categoria);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void informacaoSobreTipoDeCliente(int tipo){
		switch(tipo){
			case 0:
				System.out.println("O cliente é uma Pessoa Física (PF)");
			break;
			case 1:
				System.out.println("O cliente é uma Pessoa Jurídica (PJ)");
			break;
			default:
				System.out.println("Erro ! Tipo de cliente inválido. Digite '0' para Pessoa Física (PF) ou '1' para Pessoa Jurídica (PJ)");
			break;
		}
	}
	public void informacaoSobreCategoriaDoCliente(int categoria) {
		switch(categoria) {
			case 0:
				System.out.println("O cliente é da categoria Normal");
			break;
			case 1:
				System.out.println("O cliente é da categoria Especial");
			break;
			case 2:
				System.out.println("O cliente é da categoria VIP");				
			break;
			default:
				
			break;
		}
	}
}
