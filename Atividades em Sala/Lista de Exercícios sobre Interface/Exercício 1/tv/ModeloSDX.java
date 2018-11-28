package tv; 
public class ModeloSDX extends TV implements ControleRemoto {
        public final String MODELO = "TV-SDX";    
	public ModeloSDX(int tamanho) {
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
    		System.out.println("Tchau!");
    		super.setLigada(false);
    	}
    	@Override
    	public void ligar(){
    		super.setLigada(true);
    	}       
}
