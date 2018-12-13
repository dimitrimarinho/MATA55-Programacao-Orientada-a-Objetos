package aplicacaoPagamento;

public class Fornecedor implements Pagamento {
	
	private String nome, nomeFantasia, numeroConta, CNPJ;
	private double valorMensal;
	private int codigoBanco, agencia;
	
	public Fornecedor(String nome, String nomeFantasia, String numeroConta, double valorMensal, int codigoBanco,
			int agencia, String CNPJ) {
		this.nome = nome;
		this.nomeFantasia = nomeFantasia;
		this.numeroConta = numeroConta;
		this.valorMensal = valorMensal;
		this.codigoBanco = codigoBanco;
		this.agencia = agencia;
		this.setCNPJ(CNPJ);
	}
	
	public double valorAposDesconto() {
		double valorAposDesconto = 0.82 * getValorMensal();
		return valorAposDesconto;		
	}
	
	@Override
	public String informarPagamento() {
		return "O fornecedor " + getNome() + " recebeu o pagamento mensal de R$ " + valorAposDesconto() + "\n";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}

	public double getValorMensal() {
		return valorMensal;
	}

	public void setValorMensal(double valorMensal) {
		this.valorMensal = valorMensal;
	}

	public int getCodigoBanco() {
		return codigoBanco;
	}

	public void setCodigoBanco(int codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
		
}
