package aplicacaoPagamento;

public class Operador extends Empregado implements Pagamento {
	
	private String especialidade, plantaLocada;

	public Operador(String nome, String CPF, String matricula, String cargo, String numeroConta, double salarioBase,
			int tempoServico, int banco, int agencia, String especialidade, String plantaLocada) {
		super(nome, CPF, matricula, cargo, numeroConta, salarioBase, tempoServico, banco, agencia);
		this.especialidade = especialidade;
		this.plantaLocada = plantaLocada;
	}
	
	@Override
	public double salarioLiquido(){
		double adicionalTempo = ( (0.10 * super.getSalarioBase()) * super.getTempoServico() );
		double adicionalPericulosidade = ( 0.30 * super.getSalarioBase() );
		double salarioLiquido = ( 0.80 * super.getSalarioBase() + adicionalTempo + adicionalPericulosidade );
		return salarioLiquido;
	}
	
	@Override
	public String informarPagamento() {
		return "O operador " + super.getNome() + " recebeu o salário líquido de R$ " + salarioLiquido() + "\n";
	}
	
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getPlantaLocada() {
		return plantaLocada;
	}

	public void setPlantaLocada(String plantaLocada) {
		this.plantaLocada = plantaLocada;
	}
	
}
