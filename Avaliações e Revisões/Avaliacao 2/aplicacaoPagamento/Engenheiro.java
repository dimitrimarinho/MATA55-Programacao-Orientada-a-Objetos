package aplicacaoPagamento;

public class Engenheiro extends Empregado implements Pagamento {

	private String tipoEngenheiro;
	private boolean cargoChefia;
	
	public Engenheiro(String nome, String CPF, String matricula, String cargo, String numeroConta, double salarioBase,
			int tempoServico, int banco, int agencia, String tipoEngenheiro, boolean cargoChefia) {
		super(nome, CPF, matricula, cargo, numeroConta, salarioBase, tempoServico, banco, agencia);
		this.tipoEngenheiro = tipoEngenheiro;
		this.cargoChefia = cargoChefia;
	}
	
	@Override
	public double salarioLiquido(){
		double adicionalTempo = ( (0.10 * super.getSalarioBase()) * super.getTempoServico() );
		double salarioLiquido = ( 0.80 * super.getSalarioBase() + adicionalTempo );
		if(isCargoChefia() == true) 
				salarioLiquido = 1.1 * salarioLiquido;			
		return salarioLiquido;
	}
	
	@Override
	public String informarPagamento() {
		return "O engenheiro " + super.getNome() + " recebeu o salário líquido de R$ " + salarioLiquido() + "\n";
	}

	public String getTipoEngenheiro() {
		return tipoEngenheiro;
	}

	public void setTipo(String tipoEngenheiro) {
		this.tipoEngenheiro = tipoEngenheiro;
	}

	public boolean isCargoChefia() {
		return cargoChefia;
	}

	public void setCargoChefia(boolean cargoChefia) {
		this.cargoChefia = cargoChefia;
	}
		
}
