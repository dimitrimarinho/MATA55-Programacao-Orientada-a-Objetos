package transportes; 

public abstract class TransporteAereo extends Transporte
{
       private int altitudeAtual;

       public TransporteAereo (String nome, int numeroPassageiros, int velocidadeAtual, float anguloCurvatura, int altitudeAtual){
            super(nome, numeroPassageiros, velocidadeAtual, anguloCurvatura);
            this.altitudeAtual = altitudeAtual;
       }
        
       public abstract void subir (int metros);
       public abstract void descer (int metros);

       public int getAltitudeAtual() {
    	   return altitudeAtual;
       }

       public void setAltitudeAtual(int altitudeAtual) {
    	   this.altitudeAtual = altitudeAtual;
       }        
       
}
