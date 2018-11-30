package bar;
public class Credito extends FormaDePagamento {
	private double taxaRetencao;
	private int prazoPagamento;
	public Credito(int ID, String nome, boolean ativo, double taxaRetencao, int prazoPagamento) {
		super(ID, nome, ativo);
		this.taxaRetencao = taxaRetencao;
		this.prazoPagamento = prazoPagamento;
	}
	public double getTaxaRetencao() {
		return taxaRetencao;
	}
	public void setTaxaRetencao(double taxaRetencao) {
		this.taxaRetencao = taxaRetencao;
	}
	public int getPrazoPagamento() {
		return prazoPagamento;
	}
	public void setPrazoPagamento(int prazoPagamento) {
		this.prazoPagamento = prazoPagamento;
	}
}
