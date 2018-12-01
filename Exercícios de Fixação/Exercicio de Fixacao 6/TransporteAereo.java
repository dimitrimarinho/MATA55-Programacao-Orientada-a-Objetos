
public abstract class TransporteAereo extends Transporte
{
       private int alturaAtual;

       public TransporteAereo (String nome, int numeroPassageiros, int velocidadeAtual, int alturaAtual){
            super(nome, numeroPassageiros, velocidadeAtual);
            this.alturaAtual = alturaAtual;
       }
        
       public abstract void subir (int metros);
       public abstract void descer (int metros); 
}
