public class Venda{
	private Mercado mercado;
	private Cliente clientes;
    private ArrayList<ItemVenda>itensVendidos;
	public Venda(Mercado mercado, String codigoCliente){
		if(this.clientes.getCodigoCliente() != codigoCliente){
			System.out.printf("Código do Cliente não encontrado. Esta venda não pode ser instanciada.\n");

		}
		else{
			this.itensVendidos = new ArrayList();
			this.clientes.setCodigoCliente(codigoCliente);
		}		
	}
	public addItemVendido(int codigoProduto){
		if(this.clientes.getCodigoProduto() != codigoProduto){
			System.out.printf("Código do Cliente não encontrado. Este produto não pode ser instanciado.\n");

		}
	}
}	