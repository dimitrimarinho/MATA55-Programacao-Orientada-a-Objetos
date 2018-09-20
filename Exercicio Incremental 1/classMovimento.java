import java.util.Calendar;
public class Movimento{
    private int mesa, status;
    private Calendar dataAbertura, dataFechamento;      // import java.util.Calendar
    public Movimento(Calendar dataAbertura, int mesa){
        this.dataAbertura = dataAbertura;
        this.mesa = mesa;
        this.status = 0;
    }
    void setMesa(int mesa){
        this.mesa = mesa;
    }
    void setStatus(int status){
        this.status = status;
    }
    void setDataAbertura(Calendar dataAbertura){
        this.dataAbertura = dataAbertura;
    }
    void setDataFechamento(Calendar dataFechamento){
        this.dataFechamento = dataFechamento;
    }
    void pagar(Calendar dataFechamento){
        this.dataFechamento = dataFechamento;
        this.status = 1;
    }
    void fechar(Calendar dataFechamento){
        this.dataFechamento = dataFechamento;
        this.status = 9;
    }
    int getMesa(){
        return this.mesa;
    }
    int getStatus(){
        return this.status;
    }
    Calendar getDataAbertura(){
        return this.dataAbertura;
    }
    Calendar getDataFechamento(){
        return this.dataFechamento;
    }
}
