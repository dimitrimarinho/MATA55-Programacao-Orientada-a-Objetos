
public class Receita{
    private String paciente;
    private Medicamento medicamentos[];
    private int tam;
    public Receita(String paciente, int quantidade){
        this.paciente = paciente;
        this.medicamentos = new Medicamento[quantidade];
        this.tam = 0;
        adicionarTodos();
    }
    public Receita(String paciente)    {
        this(paciente, 1);
    }    
    public boolean addRemedio(String nome, String principioAtivo, String indicacao){
        boolean adicionado = true;
        if(tam < this.medicamentos.length){
            this.medicamentos[tam] = new Medicamento(nome, principioAtivo, indicacao);
            tam++;
        }
        else{
            adicionado = false;
        }
        return adicionado;
    }    
    public boolean adicionarTodos(){
        boolean adicionados = true;
        String nome="teste", principioAtivo="teste", indicacao="teste";
        if(tam<medicamentos.length){
            for (int i=tam; i<medicamentos.length; i++){
                this.medicamentos[i] = new Medicamento(nome, principioAtivo, indicacao);   
            }
        }
        else
            adicionados = false;
        return adicionados;
    }
}

