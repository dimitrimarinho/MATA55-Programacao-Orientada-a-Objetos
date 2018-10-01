public class Horario{

    private int hora, minuto;
    public Horario(int hora, int minuto){
       this.hora = hora;
       this.minuto = minuto;
    }
    public Horario(){
       this(0,0);
    }
    public void setHora(int hora){
       this.hora = hora;
    }
    public void setMinuto(int minuto){
       this.minuto = minuto;
    }
    public int getHora(){
       return this.hora;
    }
    public int getMinuto(){
       return this.minuto;
    }
    
}
