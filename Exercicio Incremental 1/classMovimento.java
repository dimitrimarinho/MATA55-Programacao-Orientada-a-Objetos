import java.util.Calendar;
public class Movimento{
    private int mesa, status;
    private Calendar dataAbertura, dataFechamento;
    private Pedido pedidos[];
    public Movimento(int mesa){
        Calendar aDataAbertura = Calendar.getInstance();
        System.out.println("Conta aberta às " + aDataAbertura.get(Calendar.HOUR_OF_DAY) + ":" + aDataAbertura.get(Calendar.MINUTE) + ":" + aDataAbertura.get(Calendar.SECOND) + " do dia " + aDataAbertura.get(Calendar.DAY_OF_MONTH) + "/" + aDataAbertura.get(Calendar.MONTH) + "/" + aDataAbertura.get(Calendar.YEAR) + ".");
        this.dataAbertura = aDataAbertura;
        this.mesa = mesa;
        this.status = 0;
        switch(this.status){
            case 0:
                System.out.println("Conta em aberto.");
            break;
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
                System.out.println("Conta paga.");
            break;
            case 9:
                System.out.println("Conta encerrada.");
            break;
            default:
                System.out.println("Erro ! O status digitado é inválido.");
        }
    }
    void setDataAbertura(){
        Calendar aDataAbertura = Calendar.getInstance();
        System.out.println("Conta aberta às " + aDataAbertura.get(Calendar.HOUR_OF_DAY) + ":" + aDataAbertura.get(Calendar.MINUTE) + ":" + aDataAbertura.get(Calendar.SECOND) + " do dia " + aDataAbertura.get(Calendar.DAY_OF_MONTH) + "/" + aDataAbertura.get(Calendar.MONTH) + "/" + aDataAbertura.get(Calendar.YEAR) + ".");
        this.dataAbertura = aDataAbertura;
    }
    void setDataFechamento(){
        Calendar aDataFechamento = Calendar.getInstance();
        System.out.println("Conta fechada às " + aDataFechamento.get(Calendar.HOUR_OF_DAY) + ":" + aDataFechamento.get(Calendar.MINUTE) + ":" + aDataFechamento.get(Calendar.SECOND) + " do dia " + aDataFechamento.get(Calendar.DAY_OF_MONTH) + "/" + aDataFechamento.get(Calendar.MONTH) + "/" + aDataFechamento.get(Calendar.YEAR) + ".");
        this.dataFechamento = aDataFechamento;
    }
    void fechar(){
        this.status = 9;
        switch(this.status){
            case 9:
                System.out.println("A conta foi encerrada.");
            break;
        }
        Calendar aDataFechamento = Calendar.getInstance();
        System.out.println("Conta fechada às " + aDataFechamento.get(Calendar.HOUR_OF_DAY) + ":" + aDataFechamento.get(Calendar.MINUTE) + ":" + aDataFechamento.get(Calendar.SECOND) + " do dia " + aDataFechamento.get(Calendar.DAY_OF_MONTH) + "/" + aDataFechamento.get(Calendar.MONTH) + "/" + aDataFechamento.get(Calendar.YEAR) + ".");
        this.dataFechamento = aDataFechamento;
    }
    void pagar(){
        this.status = 1;
        switch(this.status){
            case 1:
                System.out.println("A conta foi paga.");
            break;
        }
        Calendar aDataFechamento = Calendar.getInstance();
        System.out.println("Conta paga às " + aDataFechamento.get(Calendar.HOUR_OF_DAY) + ":" + aDataFechamento.get(Calendar.MINUTE) + ":" + aDataFechamento.get(Calendar.SECOND) + " do dia " + aDataFechamento.get(Calendar.DAY_OF_MONTH) + "/" + aDataFechamento.get(Calendar.MONTH) + "/" + aDataFechamento.get(Calendar.YEAR) + ".");
        this.dataFechamento = aDataFechamento;
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
                System.out.println("Conta paga.");
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
        System.out.println("A conta foi aberta às " + this.dataAbertura.get(Calendar.HOUR_OF_DAY) + ":" + this.dataAbertura.get(Calendar.MINUTE) + ":" + this.dataAbertura.get(Calendar.SECOND) + " do dia " + this.dataAbertura.get(Calendar.DAY_OF_MONTH) + "/" + this.dataAbertura.get(Calendar.MONTH) + "/" + this.dataAbertura.get(Calendar.YEAR) + ".");
        return this.dataAbertura;
    }
    Calendar getDataFechamento(){
        if(this.dataFechamento == null){
            System.out.println("A conta ainda não foi encerrada. Então, será retornado a data de abertura da conta.");
            return this.dataAbertura;
        }
        else{
            System.out.println("A conta foi fechada às " + this.dataFechamento.get(Calendar.HOUR_OF_DAY) + ":" + this.dataFechamento.get(Calendar.MINUTE) + ":" + this.dataFechamento.get(Calendar.SECOND) + " do dia " + this.dataFechamento.get(Calendar.DAY_OF_MONTH) + "/" + this.dataFechamento.get(Calendar.MONTH) + "/" + this.dataFechamento.get(Calendar.YEAR) + ".");
            return this.dataFechamento;
        }
    }
}
