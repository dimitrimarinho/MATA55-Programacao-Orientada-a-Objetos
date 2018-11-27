package bar;
public class Especial extends Cliente {
	private String endereco, telefone, email;
	private char sexo;
	public Especial(int ID, int tipo, int categoria, String nome, String endereco, String telefone, String email, char sexo) {
		super(ID, tipo, categoria, nome);
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.sexo = sexo;
		informacaoSobreSexo(sexo);
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getSexo() {
		informacaoSobreSexo(sexo);
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
		informacaoSobreSexo(sexo);
	}
	public void informacaoSobreSexo(char sexo) {
		switch(sexo) {
			case 'M':
				System.out.println("O cliente é do sexo Masculino");
			break;
			case 'F':
				System.out.println("O cliente é do sexo Feminino");
			break;
			default:
				System.out.println("Char digitado é inválido. Para sexo masculino utilize o caractere 'M' e para o sexo feminino utilize o caractere 'F'");
			break;
		}
	}
}
