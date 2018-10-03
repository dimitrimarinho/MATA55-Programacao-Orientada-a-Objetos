
/**
 * Write a description of class Medicamento here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Medicamento
{
    // instance variables - replace the example below with your own
    private String nome, principioAtivo, indicacao;

    /**
     * Constructor for objects of class Medicamento
     */
    public Medicamento(String nome, String principioAtivo, String indicacao)
    {
        this.nome = nome;
        this.principioAtivo = principioAtivo;
        this.indicacao = indicacao;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public String getPrincipioAtivo()
    {
        return this.principioAtivo;
    }
    
    public String getIndicacao()
    {
        return this.indicacao;
    }
}
