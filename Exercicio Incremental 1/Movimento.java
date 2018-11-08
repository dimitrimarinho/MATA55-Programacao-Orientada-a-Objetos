import java.util.Calendar;
public class Movimento{
    private int mesa, status;
    private Calendar dataAbertura, dataFechamento;
    private Pedido pedidos[];
    public Movimento(int mesa){
        Calendar aDataAbertura = Calendar.getInstance();
        int hrs = aDataAbertura.get(Calendar.HOUR);
        int mnts = aDataAbertura.get(Calendar.MINUTE);
        int segs = aDataAbertura.get(Calendar.SECOND);
        String curTime = String.format("%02d:%02d:%02d", hrs, mnts, segs);
        System.out.println("Conta aberta às " + curTime + " do dia " + aDataAbertura.get(Calendar.DAY_OF_MONTH) + "/" + (aDataAbertura.get(Calendar.MONTH)+1) + "/" + aDataAbertura.get(Calendar.YEAR) + ".");
        this.dataAbertura = aDataAbertura;
        this.mesa = mesa;
        this.status = 0;
        switch(this.status){
            case 0:
                System.out.println("Conta em aberto.");
            break;
        }
    }
    public void setMesa(int mesa){
        this.mesa = mesa;
    }
    public void setStatus(int status){
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
    public void setDataAbertura(){
        Calendar aDataAbertura = Calendar.getInstance();
        int hrs = aDataAbertura.get(Calendar.HOUR);
        int mnts = aDataAbertura.get(Calendar.MINUTE);
        int segs = aDataAbertura.get(Calendar.SECOND);
        String curTime = String.format("%02d:%02d:%02d", hrs, mnts, segs);
        System.out.println("Conta aberta às " + curTime + " do dia " + aDataAbertura.get(Calendar.DAY_OF_MONTH) + "/" + (aDataAbertura.get(Calendar.MONTH)+1) + "/" + aDataAbertura.get(Calendar.YEAR) + ".");
        this.dataAbertura = aDataAbertura;
    }
    public void setDataFechamento(){
        Calendar aDataFechamento = Calendar.getInstance();
        int hrs = aDataFechamento.get(Calendar.HOUR);
        int mnts = aDataFechamento.get(Calendar.MINUTE);
        int segs = aDataFechamento.get(Calendar.SECOND);
        String curTime = String.format("%02d:%02d:%02d", hrs, mnts, segs);
        System.out.println("Conta fechada às " + curTime + " do dia " + aDataFechamento.get(Calendar.DAY_OF_MONTH) + "/" + (aDataFechamento.get(Calendar.MONTH)+1) + "/" + aDataFechamento.get(Calendar.YEAR) + ".");
        this.dataFechamento = aDataFechamento;
    }
    public void fechar(){
        this.status = 9;
        switch(this.status){
            case 9:
                System.out.println("A conta foi encerrada.");
            break;
        }
        Calendar aDataFechamento = Calendar.getInstance();
        int hrs = aDataFechamento.get(Calendar.HOUR);
        int mnts = aDataFechamento.get(Calendar.MINUTE);
        int segs = aDataFechamento.get(Calendar.SECOND);
        String curTime = String.format("%02d:%02d:%02d", hrs, mnts, segs);
        System.out.println("Conta fechada às " + curTime + " do dia " + aDataFechamento.get(Calendar.DAY_OF_MONTH) + "/" + (aDataFechamento.get(Calendar.MONTH)+1) + "/" + aDataFechamento.get(Calendar.YEAR) + ".");
        this.dataFechamento = aDataFechamento;
    }
    public void pagar(){
        this.status = 1;
        switch(this.status){
            case 1:
                System.out.println("A conta foi paga.");
            break;
        }
        Calendar aDataFechamento = Calendar.getInstance();
        int hrs = aDataFechamento.get(Calendar.HOUR);
        int mnts = aDataFechamento.get(Calendar.MINUTE);
        int segs = aDataFechamento.get(Calendar.SECOND);
        String curTime = String.format("%02d:%02d:%02d", hrs, mnts, segs);
        System.out.println("Conta paga às " + curTime + " do dia " + aDataFechamento.get(Calendar.DAY_OF_MONTH) + "/" + (aDataFechamento.get(Calendar.MONTH)+1) + "/" + aDataFechamento.get(Calendar.YEAR) + ".");
        this.dataFechamento = aDataFechamento;
    }
    public int getMesa(){
        return this.mesa;
    }
    public int getStatus(){
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
    public Calendar getDataAbertura(){
        int hrs = this.dataAbertura.get(Calendar.HOUR);
        int mnts = this.dataAbertura.get(Calendar.MINUTE);
        int segs = this.dataAbertura.get(Calendar.SECOND);
        String curTime = String.format("%02d:%02d:%02d", hrs, mnts, segs);
        System.out.println("A conta foi aberta às " + curTime + " do dia " + this.dataAbertura.get(Calendar.DAY_OF_MONTH) + "/" + (this.dataAbertura.get(Calendar.MONTH)+1) + "/" + this.dataAbertura.get(Calendar.YEAR) + ".");
        return this.dataAbertura;
    }
    public Calendar getDataFechamento(){
        if(this.dataFechamento == null){
            System.out.println("A conta ainda não foi encerrada. Será retornado a data de abertura da conta.");
            return this.dataAbertura;
        }
        else{
            int hrs = this.dataFechamento.get(Calendar.HOUR);
            int mnts = this.dataFechamento.get(Calendar.MINUTE);
            int segs = this.dataFechamento.get(Calendar.SECOND);
            String curTime = String.format("%02d:%02d:%02d", hrs, mnts, segs);
            System.out.println("A conta foi fechada às " + curTime + " do dia " + this.dataFechamento.get(Calendar.DAY_OF_MONTH) + "/" + (this.dataFechamento.get(Calendar.MONTH)+1) + "/" + this.dataFechamento.get(Calendar.YEAR) + ".");
            return this.dataFechamento;
        }
    }
}
