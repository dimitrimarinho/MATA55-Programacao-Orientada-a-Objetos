public class Medicamento
{
    private String nome, principioAtivo, indicacao;
    public Medicamento(String nome, String principioAtivo, String indicacao){
        this.nome = nome;
        this.principioAtivo = principioAtivo;
        this.indicacao = indicacao;
    }    
    public String getNome(){
        return this.nome;
    }    
    public String getPrincipioAtivo(){
        return this.principioAtivo;
    }    
    public String getIndicacao(){
        return this.indicacao;
    }
}
