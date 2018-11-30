package bar;
public class Dinheiro extends FormaDePagamento {
	private int forma;
	public Dinheiro(int id, String nome, boolean ativo, int forma) {
		super(id, nome, ativo);
		this.forma = forma;
		informacaoSobreFormaDePagamento(forma);
	}
	public int getForma() {
		informacaoSobreFormaDePagamento(forma);
		return forma;
	}
	public void setForma(int forma) {
		this.forma = forma;
		informacaoSobreFormaDePagamento(forma);
	}
	public void informacaoSobreFormaDePagamento(int forma){
		switch(forma){
			case 0:
				System.out.println("O pagamento será através de dinheiro");
			break;
			case 1:
				System.out.println("O pagamento será através de depósito em conta");
			break;
			case 2:
				System.out.println("O pagamento será através de DOC");
			break;
			case 3:
				System.out.println("O pagamento será através de TED");
			break;
			case 4:
				System.out.println("O pagamento será através de cheque");
			break;
			case 9:
				System.out.println("O pagamento não será realizado por dinheiro, depósito em conta, DOC, TED ou cheque. Será realizado de outra maneira");
			break;
			default:
				System.out.println("Erro ! Forma de pagamento inválida. Digite '0' para dinheiro, '1' para depósito em conta, '2' para DOC, '3' para TED, '4' para cheque ou '9' para outras formas de pagamento");
			break;
		}
	}

}
