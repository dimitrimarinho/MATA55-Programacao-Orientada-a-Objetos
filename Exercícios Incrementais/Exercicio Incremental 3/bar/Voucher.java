package bar;
public class Voucher extends FormaDePagamento {
	private double diaria;
	private int prazoPagamento;
	private String contaCorrente;
	public Voucher(int id, String nome, boolean ativo, double diaria, int prazoPagamento, String contaCorrente) {
		super(id, nome, ativo);
		this.diaria = diaria;
		this.prazoPagamento = prazoPagamento;
		this.contaCorrente = contaCorrente;
	}
	public double getDiaria() {
		return diaria;
	}
	public void setDiaria(double diaria) {
		this.diaria = diaria;
	}
	public int getPrazoPagamento() {
		return prazoPagamento;
	}
	public void setPrazoPagamento(int prazoPagamento) {
		this.prazoPagamento = prazoPagamento;
	}
	public String getContaCorrente() {
		return contaCorrente;
	}
	public void setContaCorrente(String contaCorrente) {
		this.contaCorrente = contaCorrente;
	}	
}
