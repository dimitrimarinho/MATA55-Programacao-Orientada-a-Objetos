public class Pedido{
  private int numero, status;
  private Produto pedidoProduto;
  public Pedido(int numero, int codigo, int tipo, String nome, double preco, boolean disponibilidade){
      this.numero = numero;
      this.status = 0;
      switch(this.status){
          case 0:
              System.out.println("O pedido está aberto.");
          break;
      }
     this.pedidoProduto = new Produto(codigo, tipo, nome, preco, disponibilidade); 
  }
  public Pedido(int numero, int status, int codigo, int tipo, String nome, double preco, boolean disponibilidade){
      this(numero, codigo, tipo, nome, preco, disponibilidade);
      this.status = status;
      switch(this.status){
          case 0:
          break;
          case 1:
              System.out.println("O pedido foi servido.");
          break;
          case 9:
              System.out.println("O pedido foi cancelado.");
          break;
          default:
              System.out.println("Erro ! Status digitado é inválido.");
          break;
      }
  }
  void servir(){
      this.status = 1;
      switch(this.status){
          case 1:
              System.out.println("O pedido foi servido.");
          break;
      }
  }
  void cancelar(){
      this.status = 9;
      switch(this.status){
          case 9:
              System.out.println("O pedido foi cancelado.");
          break;
      }
  }
  void setNumero(int numero){
    this.numero = numero;
  }
  void setStatus(int status){
    this.status = status;
    switch(this.status){
        case 0:
            System.out.println("O pedido está aberto.");
        break;
        case 1:
            System.out.println("O pedido foi servido.");
        break;
        case 9:
            System.out.println("O pedido foi cancelado.");
        break;
        default:
            System.out.println("Erro ! Status digitado é inválido.");
        break;
    }
  }
  int getNumero(){
    return this.numero;
  }
  int getStatus(){
        switch(this.status){
        case 0:
            System.out.println("O pedido está aberto.");
        break;
        case 1:
            System.out.println("O pedido foi servido.");
        break;
        case 9:
            System.out.println("O pedido foi cancelado.");
        break;
        default:
            System.out.println("Erro ! O status digitado é inválido.");
        break;
    }
    return this.status;
  }
}
