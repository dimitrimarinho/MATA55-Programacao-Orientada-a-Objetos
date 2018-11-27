public class Cliente{
    private String nomeCliente, codigoCliente;
    public Cliente(String nomeCliente, String codigoCliente){
        this.nomeCliente = nomeCliente;
        this.codigoCliente = codigoCliente;
    }
    public void setCodigoCliente(String codigoCliente){
    	this.codigoCliente = codigoCliente;
    }
    public String getCodigoCliente(){
    	return this.codigoCliente;
    }
    public void setNomeCliente(String nomeCliente){
    	this.nomeCliente = nomeCliente;
    }
    public String getNomeCliente(){
    	return this.nomeCliente;
    }
    
}
