package bar;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
public class Movimento{
    private int mesa, status;
    private Calendar dataAbertura, dataFechamento;
    private Pedido pedidos[];
    private ArrayList<Cliente> clientes;
    public Movimento(int mesa){
        Calendar aDataAbertura = Calendar.getInstance();
        String curTime = configuraCurTime(aDataAbertura);
        System.out.println("Conta aberta às " + curTime + " do dia " + aDataAbertura.get(Calendar.DAY_OF_MONTH) + "/" + (aDataAbertura.get(Calendar.MONTH)+1) + "/" + aDataAbertura.get(Calendar.YEAR));
        this.dataAbertura = aDataAbertura;
        this.mesa = mesa;
        this.status = 0;
        clientes = new ArrayList<Cliente>();
        informacaoSobreStatusDaConta(this.status);
    }
    public int getMesa(){
        return this.mesa;
    }
    public void setMesa(int mesa){
        this.mesa = mesa;
    }
    public int getStatus(){
        informacaoSobreStatusDaConta(this.status);
        return this.status;
    }
    public void setStatus(int status){
        this.status = status;
        informacaoSobreStatusDaConta(this.status);
    }
    public Calendar getDataAbertura(){
        String curTime = configuraCurTime(this.dataAbertura);
        System.out.println("A conta foi aberta às " + curTime + " do dia " + this.dataAbertura.get(Calendar.DAY_OF_MONTH) + "/" + (this.dataAbertura.get(Calendar.MONTH)+1) + "/" + this.dataAbertura.get(Calendar.YEAR));
        return this.dataAbertura;
    }
    public String stringGetDataAbertura(){
        String curTime = configuraCurTime(this.dataAbertura);
        return("A conta foi aberta às " + curTime + " do dia " + this.dataAbertura.get(Calendar.DAY_OF_MONTH) + "/" + (this.dataAbertura.get(Calendar.MONTH)+1) + "/" + this.dataAbertura.get(Calendar.YEAR));
    }
    public void setDataAbertura(){
        Calendar aDataAbertura = Calendar.getInstance();
        String curTime = configuraCurTime(aDataAbertura);
        System.out.println("Conta aberta às " + curTime + " do dia " + aDataAbertura.get(Calendar.DAY_OF_MONTH) + "/" + (aDataAbertura.get(Calendar.MONTH)+1) + "/" + aDataAbertura.get(Calendar.YEAR));
        this.dataAbertura = aDataAbertura;
    }
    public Calendar getDataFechamento(){
        if(this.dataFechamento == null){
            System.out.println("A conta ainda não foi encerrada. Será retornado a data de abertura da conta");
            return this.dataAbertura;
        }
        else{
            String curTime = configuraCurTime(this.dataFechamento);
            System.out.println("A conta foi fechada às " + curTime + " do dia " + this.dataFechamento.get(Calendar.DAY_OF_MONTH) + "/" + (this.dataFechamento.get(Calendar.MONTH)+1) + "/" + this.dataFechamento.get(Calendar.YEAR));
            return this.dataFechamento;
        }
    }
    public String stringGetDataFechamento(){
        if(this.dataFechamento == null){
            return("A conta ainda não foi encerrada.");
        }
        else{
            String curTime = configuraCurTime(this.dataFechamento);
            return("\nA conta foi fechada às " + curTime + " do dia " + this.dataFechamento.get(Calendar.DAY_OF_MONTH) + "/" + (this.dataFechamento.get(Calendar.MONTH)+1) + "/" + this.dataFechamento.get(Calendar.YEAR));
        }
    }
    public void setDataFechamento(){
        Calendar aDataFechamento = Calendar.getInstance();
        String curTime = configuraCurTime(aDataFechamento);
        System.out.println("Conta fechada às " + curTime + " do dia " + aDataFechamento.get(Calendar.DAY_OF_MONTH) + "/" + (aDataFechamento.get(Calendar.MONTH)+1) + "/" + aDataFechamento.get(Calendar.YEAR));
        this.dataFechamento = aDataFechamento;
    }
    public Pedido[] getPedidos() {
        return pedidos;
    }
    public void setPedidos(Pedido pedidos[]) {
        this.pedidos = pedidos;
    }
    public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	public void adicionaCliente(Cliente novoCliente) {
		clientes.add(novoCliente);
	}
	public void adicionarClienteEspecial(Especial novoClienteEspecial) {
		clientes.add(novoClienteEspecial);
	}
	public void adicionarClienteVIP(VIP novoClienteVIP) {
		clientes.add(novoClienteVIP);
	}
	public boolean removeCliente(int ID) {
		for(Iterator<Cliente> it = clientes.iterator(); it.hasNext();) {
			Cliente c = (Cliente) it.next();
			if(c.getID() == ID) {
				clientes.remove(c);
				System.out.println("Cliente encontrado e removido");
				return true;
			}
		}
		System.out.println("Não foi encontrado cliente com este ID");
		return false;
	}
	public void fechar(){
        this.status = 9;
        informacaoSobreStatusDaConta(this.status);
        Calendar aDataFechamento = Calendar.getInstance();
        String curTime = configuraCurTime(aDataFechamento);
        System.out.println("Conta fechada às " + curTime + " do dia " + aDataFechamento.get(Calendar.DAY_OF_MONTH) + "/" + (aDataFechamento.get(Calendar.MONTH)+1) + "/" + aDataFechamento.get(Calendar.YEAR));
        this.dataFechamento = aDataFechamento;
    }
    public void pagar(){
        this.status = 1;
        informacaoSobreStatusDaConta(this.status);
        Calendar aDataFechamento = Calendar.getInstance();
        String curTime = configuraCurTime(aDataFechamento);
        System.out.println("Conta paga às " + curTime + " do dia " + aDataFechamento.get(Calendar.DAY_OF_MONTH) + "/" + (aDataFechamento.get(Calendar.MONTH)+1) + "/" + aDataFechamento.get(Calendar.YEAR));
        this.dataFechamento = aDataFechamento;
    }
    public void informacaoSobreStatusDaConta(int status){
        switch(this.status){
            case 0:
                System.out.println("Conta em aberto");
            break;
            case 1:
                System.out.println("Conta paga");
            break;
            case 9:
                System.out.println("Conta encerrada");
            break;
            default:
                System.out.println("Erro ! O status digitado é inválido");
        }
    }
	// public String relatorioMovimentacao(Movimento movimento){
    //	return "\nNome do Cliente: " + movimento.getClientes().get(0).getNome() + "\nID do Cliente: " + movimento.getClientes().get(0).getID() + "\nTipo do Cliente: " + movimento.getClientes().get(0).getTipo() + "\nCategoria do Cliente: " + movimento.getClientes().get(0).getCategoria() + "\nData da Abertura da Movimento: " + movimento.getDataAbertura() + "\nData de Fechamento do Movimento: " + movimento.getDataFechamento() + "\n\n";
	//}   
    public String configuraCurTime(Calendar aData){
        int hrs = aData.get(Calendar.HOUR);
        int mnts = aData.get(Calendar.MINUTE);
        int segs = aData.get(Calendar.SECOND);
        String curTime = String.format("%02d:%02d:%02d", hrs, mnts, segs);
        return curTime;
    }    
}
