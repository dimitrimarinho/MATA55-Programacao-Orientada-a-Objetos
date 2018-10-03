import java.util.ArrayList;
public class Mercado{
    private ArrayList<Cliente>clientes;
    private ArrayList<Produto>produtos;
    public Mercado(){
        this.clientes = new ArrayList<Cliente>();
        this.produtos = new ArrayList<Produto>();
    }
    public void addCliente(Cliente recebeCliente){
        clientes.add(recebeCliente);
    }
    public void deleteCliente(Cliente recebeCliente){
        clientes.remove(recebeCliente);
    }
    public void addProdutos(Produto recebeProduto){
        produtos.add(recebeProduto);
    }
    public void deleteProdutos(Produto recebeProduto){
        produtos.remove(recebeProduto);
    }
    public ArrayList<Cliente> getClientes(){
        return clientes;
    }
    public void setClientes(ArrayList<Cliente>clientes){
        this.clientes = clientes;
    }    
    public ArrayList<Produto> getProdutos(){
        return produtos;
    }
    public void setProdutos(ArrayList<Produto>produtos){
        this.produtos = produtos;
    }  
}
