import java.util.Calendar;
public class Movimento{
    private int mesa, status;
    private Calendar dataAbertura = Calendar.getInstance(), dataFechamento = Calendar.getInstance();      // import java.util.Calendar
    private Pedido pedidos[];
    public Movimento(Calendar dataAbertura, int mesa){
        this.dataAbertura = dataAbertura;
        this.mesa = mesa;
        this.status = 0;
        switch(this.status){
            case 0:
                System.out.println("Conta em aberto.");
            break;
            case 1:
                System.out.println("Em pagamento...");
            break;x
            case 9:
                System.out.println("Conta encerrada.");
            break;
            default:
                System.out.println("Erro ! O status digitado é inválido.");
        }
    }
    void setMesa(int mesa){
        this.mesa = mesa;
    }
    void setStatus(int status){
        this.status = status;
        switch(this.status){
            case 0:
                System.out.println("Conta em aberto.");
            break;
            case 1:
                System.out.println("Conta em pagamento...");
            break;
            case 9:
                System.out.println("Conta encerrada.");
            break;
            default:
                System.out.println("Erro ! O status digitado é inválido.");
        }
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
        switch(this.status){
            case 1:
                System.out.println("Conta em pagamento...");
            break;
        }
    }
    void fechar(Calendar dataFechamento){
        this.dataFechamento = dataFechamento;
        this.status = 9;
        switch(this.status){
            case 9:
                System.out.println("Conta encerrada.");
            break;
        }
    }
    int getMesa(){
        return this.mesa;
    }
    int getStatus(){
        switch(this.status){
            case 0:
                System.out.println("Conta em aberto.");
            break;
            case 1:
                System.out.println("Em pagamento...");
            break;
            case 9:
                System.out.println("Conta encerrada.");
            break;
            default:
                System.out.println("Erro ! O status digitado é inválido.");
        }
        return this.status;
    }
    Calendar getDataAbertura(){
        return this.dataAbertura;
    }
    Calendar getDataFechamento(){
        return this.dataFechamento;
    }
}
