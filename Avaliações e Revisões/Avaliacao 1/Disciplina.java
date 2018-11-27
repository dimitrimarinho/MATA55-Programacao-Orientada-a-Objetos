public class Disciplina{
  private String codigo;
  private char nota;
  public Disciplina(String codigo, char nota){
    this.codigo = codigo;
    this.nota = nota;
  }
  public void setCodigo(String codigo){
    this.codigo = codigo;
  }
  public String getCodigo(){
    return this.codigo;
  }
  public void setNota(char nota){
    this.nota = nota;
  }
  public char getNota(){
    return this.nota;
  }
}
