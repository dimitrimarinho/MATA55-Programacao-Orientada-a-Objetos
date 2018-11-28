package tv; 
public class ModeloTV001 extends TV implements ControleRemoto{
        public final String MODELO = "TV001";
        public ModeloTV001(int tamanho) {
		super(tamanho);
	}
	@Override
	public void mudarCanal(int canal){
		super.setCanal(canal);
	}
	@Override
	public void aumentarVolume(){
		super.setVolume(super.getVolume() + 1); 
    	}
    	@Override
    	public void diminuirVolume(){
    		super.setVolume(super.getVolume() - 1); 
    	}
   	@Override
	public void desligar(){
    		super.setLigada(false);
	}
	@Override
	public void ligar(){
		super.setLigada(true);
    	}       
}
