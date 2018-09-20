public class Pedido{
  private int numero, status;
  // private produto pedidoProduto;
  public Pedido(int numero, int codigo, int tipo, String nome, double preco, boolean disponibilidade){
      this.numero = numero;
      // this.pedidoProduto = new Produto(codigo, tipo, nome, preco, disponibilidade); // erro de compilação
  }
  public Pedido(int numero, int status, int codigo, int tipo, String nome, double preco, boolean disponibilidade){
      this.numero = numero;
      this.status = status;
      // this.pedidoProduto = new Produto(codigo, tipo, nome, preco, disponibilidade); // erro de compilação
  }
  void setNumero(int numero){
    this.numero = numero;
  }
  void setStatus(int status){
    this.status = status;
  }
  int getNumero(){
    return this.numero;
  }
  int getStatus(){
    return this.status;
  }
}
