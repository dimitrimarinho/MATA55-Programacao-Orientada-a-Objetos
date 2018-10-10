public class Contato{
    private String nome, telefone;
    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;        
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return this.telefone;        
    }    
}