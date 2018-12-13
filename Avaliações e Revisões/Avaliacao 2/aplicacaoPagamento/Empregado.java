package aplicacaoPagamento;

/* Não foi empregado a classe abstrata, pois como o enunciado diz que o salarioLiquido
da classe Empregado difere do Operador e do Engenheiro, concluiu-se que há empregados
que não são Operadores e nem Engenheiros. Houve uma ambiguidade quando foi dito que somente
os Operadores e Engenheiros possuíam atributos adicionais, podia-se entender que haviam outros empregados
e que estes não tinham atributos adicionais */
public class Empregado implements Pagamento {

	private String nome, CPF, matricula, cargo, numeroConta;
	private double salarioBase;
	private int tempoServico, codigoBanco, agencia;

	public Empregado(String nome, String CPF, String matricula, String cargo, String numeroConta, double salarioBase,
			int tempoServico, int codigoBanco, int agencia) {
		this.nome = nome;
		this.CPF = CPF;
		this.matricula = matricula;
		this.cargo = cargo;
		this.numeroConta = numeroConta;
		this.salarioBase = salarioBase;
		this.tempoServico = tempoServico;
		this.codigoBanco = codigoBanco;
		this.agencia = agencia;
	}

	public double salarioLiquido(){
		double adicionalTempo = ( (0.10 * getSalarioBase()) * getTempoServico() );
		double salarioLiquido = ( 0.80 * getSalarioBase() + adicionalTempo );
		return salarioLiquido;
	}

	@Override
	public String informarPagamento() {
		return "O empregado " + getNome() + " recebeu o salário líquido de R$ " + salarioLiquido() + "\n";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getTempoServico() {
		return tempoServico;
	}

	public void setTempoServico(int tempoServico) {
		this.tempoServico = tempoServico;
	}

	public int getCodigoBanco() {
		return codigoBanco;
	}

	public void setBanco(int codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

}
