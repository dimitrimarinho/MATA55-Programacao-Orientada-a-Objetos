package bar;
public class Pedido{
	 private int numero, status;
	 private Produto pedidoProduto;
	 public Pedido(int numero, int codigo, int tipo, String nome, double preco, boolean disponibilidade){
	      this.numero = numero;
	      this.status = 0;
          informacaoSobreStatusDoPedido(this.status);
          this.setPedidoProduto(new Produto(codigo, tipo, nome, preco, disponibilidade));
	 }
	 public Pedido(int numero, int status, int codigo, int tipo, String nome, double preco, boolean disponibilidade){
	      this(numero, codigo, tipo, nome, preco, disponibilidade);
	      this.status = status;
          informacaoSobreStatusDoPedido(this.status);
	 }
     public int getNumero(){
       return this.numero;
     }
     public void setNumero(int numero){
       this.numero = numero;
     }
     public int getStatus(){
       informacaoSobreStatusDoPedido(this.status);
       return this.status;
     }
     public void setStatus(int status){
	    this.status = status;
        informacaoSobreStatusDoPedido(status);
	 }
     public Produto getPedidoProduto() {
		return pedidoProduto;
	 }
	 public void setPedidoProduto(Produto pedidoProduto) {
		this.pedidoProduto = pedidoProduto;
	 }
	 public void servir(){
	    this.status = 1;
        informacaoSobreStatusDoPedido(this.status);
	 }
     public void cancelar(){
	      this.status = 9;
          informacaoSobreStatusDoPedido(this.status);
	 }
     public void informacaoSobreStatusDoPedido(int status){
         switch(this.status){
 	        case 0:
 	            System.out.println("O pedido está aberto");
 	        break;
 	        case 1:
 	            System.out.println("O pedido foi servido");
 	        break;
 	        case 9:
 	            System.out.println("O pedido foi cancelado");
 	        break;
 	        default:
 	            System.out.println("Erro ! Status digitado é inválido");
 	        break;
 	    }
    }
}
