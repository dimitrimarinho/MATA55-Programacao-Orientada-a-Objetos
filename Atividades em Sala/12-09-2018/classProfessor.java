import java.util.Date;
import java.util.Calendar;
public class Professor
{
    // variáveis de instância
    private String nome;
    private String depto;
    private Calendar dataAdmissao;

    /**
     * Construtor para objetos da classe Universidade
     */
    public Professor(String nome, String depto, Calendar dataAdmissao)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        this.depto = depto;
        this.dataAdmissao = dataAdmissao;
    }
    public Professor(String nome, String depto)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        this.depto = depto;
        this.dataAdmissao = Calendar.getInstance();
    }
     public Professor(String nome, int idDepartamento)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        String deptoString = "Departamento de ";
        switch (idDepartamento)
        {
            case 1:
                this.depto = deptoString+"Ciencia da Computacao";
            break;
            case 2:
                this.depto = deptoString+"Matematica";
            break;
            case 3:
                this.depto = deptoString+"Estatistica";
            break;
            default:
                this.depto = "Departamento Desconhecido";
            break;
        }
        this.dataAdmissao = Calendar.getInstance();
    }
    public void setDepartamento(String nomeDepartamento)
    {
        this.depto = nomeDepartamento;
    }
    public void setDepartamento(int idDepartamento)
    {
        String depto = "Departamento de ";
        switch (idDepartamento)
        {
            case 1:
                this.setDepartamento(depto+"Ciencia da Computacao");
            break;
            case 2:
                this.setDepartamento(depto+"Matematica");
            break;
            case 3:
                this.setDepartamento(depto+"Estatistica");
            break;
            default:
                this.setDepartamento("Departamento Desconhecido");
            break;
        }
    }
}
