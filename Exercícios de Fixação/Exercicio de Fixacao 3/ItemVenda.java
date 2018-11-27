public class ItemVenda{
    private Produto produto;
    private int quantidade;
    public ItemVenda(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    public ItemVenda(Produto produto){
        this(produto, 1);
    }
}
