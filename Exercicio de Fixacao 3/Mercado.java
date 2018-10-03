import java.util.ArrayList;
public class Mercado{
    private ArrayList<Cliente>clientes;
    private ArrayList<Produto>produtos;
    public Mercado(){
        this.produtos = new ArrayList();
    }
    public void addCliente(Cliente clientes){
        Cliente.add(clientes);
    }
    public void deleteCliente(Cliente clientes){
        Cliente.remove(clientes);
    }
    public void addProdutos(Produto produtos){
        Produto.add(produtos);
    }
    public void deleteProdutos(Produto produtos){
        Produto.remove(produtos);
    }
}
