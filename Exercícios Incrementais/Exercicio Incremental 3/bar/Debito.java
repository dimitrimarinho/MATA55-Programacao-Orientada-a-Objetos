package bar;
public class Debito extends FormaDePagamento{
	private double taxaRetencao;
	private String contaCorrente;
	public Debito(int ID, String nome, boolean ativo, double taxaRetencao, String contaCorrente) {
		super(ID, nome, ativo);
		this.taxaRetencao = taxaRetencao;
		this.contaCorrente = contaCorrente;
	}
	public double getTaxaRetencao() {
		return taxaRetencao;
	}
	public void setTaxaRetencao(double taxaRetencao) {
		this.taxaRetencao = taxaRetencao;
	}
	public String getContaCorrente() {
		return contaCorrente;
	}
	public void setContaCorrente(String contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
}
