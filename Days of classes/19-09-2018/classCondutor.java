public class condutor
{
    // variáveis de instância
    private String nome, RG, CPF;
    private CNH cnhMotorista;

    // Construtor para objetos da classe condutor
    public condutor(String nome, String RG, String CPF, String id, boolean status, char categoria, int pontosCarteira)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
        this.cnhMotorista = new CNH(id, status, categoria, pontosCarteira);
    }
}
