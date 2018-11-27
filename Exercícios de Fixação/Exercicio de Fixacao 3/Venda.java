import java.util.ArrayList;
public class Venda{
    private Mercado mercado;
    private Cliente clientes;
    private ArrayList<ItemVenda>itensVendidos;
    public boolean criarVenda(Mercado mercado, String codigoCliente){
        boolean foundCliente = false;
        ArrayList<Cliente> buscaClientes = mercado.getClientes();
        for(int i = 0; i < buscaClientes.size() ; i++){
            if(buscaClientes.get(i).getCodigoCliente() == codigoCliente){
               foundCliente = true;    
               new Venda(mercado, buscaClientes.get(i));
            }
        }
        if (!foundCliente){
            System.out.printf("Código do Cliente não encontrado. Esta venda não pode ser instanciada.\n");
        }       
        return foundCliente;
    }
    public Venda(Mercado mercado, Cliente clientes){
        this.itensVendidos = new ArrayList();
        this.mercado = mercado;
        this.clientes = clientes;        
    }
    public boolean addItemVendido(int codigoProduto, int quantidade){
        ArrayList<Produto> buscaProdutos = mercado.getProdutos();
        boolean foundProduto = false;
        for(int i = 0; i < buscaProdutos.size(); i++){ 
            if(buscaProdutos.get(i).getCodigoProduto() == codigoProduto){
                foundProduto = true;
                ItemVenda novoItemVendido = new ItemVenda(buscaProdutos.get(i), quantidade); 
                itensVendidos.add(novoItemVendido);    
            }
        }
        if(!foundProduto){
            System.out.printf("Código do Cliente não encontrado. Este produto não pode ser instanciado.\n");
        }
        return foundProduto;
    }
    public boolean addItemVendido(int codigoProduto){
       return addItemVendido(codigoProduto, 1);
    }
    
}   