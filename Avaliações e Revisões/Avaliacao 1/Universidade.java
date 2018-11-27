import java.util.ArrayList; // PF = Projeto Final
import java.util.Iterator;
public class Universidade{
  private String nome, curso;
  private char notaPF;
  private ArrayList<Disciplina> lista;
  private int sizeMaxLista;
  public Universidade(String nome, String curso, int quantidade){
    this.nome = nome;
    this.curso = curso;
    lista = new ArrayList<Disciplina>();
    this.sizeMaxLista = quantidade;
  }
  public Universidade(String nome, String curso){
    this(nome, curso, 20);
  }
  public boolean adicionaDisciplina(String codigo, char nota){
      if(lista.size() < this.sizeMaxLista){
          Disciplina d = new Disciplina (codigo, nota);
          d.setCodigo(codigo);
          d.setNota(nota);
          lista.add(d);
          return true;
      }
      else{
        return false;
      }
  }
  public boolean adicionaDisciplina(ArrayList<Disciplina> adicionaPorLista){
    if(this.sizeMaxLista > (lista.size() + adicionaPorLista.size())){
      for(int j = 0; j < adicionaPorLista.size(); j++){
        Disciplina d = (Disciplina) lista.get(j);
        lista.add(d);
      }
      return true;
    }
    else{
      System.out.println("\nNão é possível efetuar esta operação. A lista fornecida ultrapassa a quantidade máxima de disciplinas\n");
      return false;
    }
  }
  public boolean removePorCodigo(String codigo){
    for(Iterator it = lista.iterator(); it.hasNext();){
      Disciplina d = (Disciplina) it.next();
      if(d.getCodigo().equals(codigo)){
        lista.remove(d);
        return true;
      }
    }
    System.out.println("\nDisciplina não encontrada\n");
    return false;
  }
  public char consultarDisciplina(String codigo){
    for(Disciplina d : lista){
      if(d.getCodigo().equals(codigo)){
        return d.getNota();
      }
    }
    return 'Z';
  }
  public void listar(){
    System.out.println("\nImprimindo o registro ...\n");
    System.out.println("\nNome do aluno: " + this.nome + "\nNome do curso: " + this.curso + "\n");
    System.out.println("Disciplinas: \n");
    for(Disciplina d : lista)
      System.out.println("\nCodigo da Disciplina: " + d.getCodigo() + ", Nota da disciplina: " + d.getNota() + ", Nota da PF: " + this.notaPF);
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getNome(){
    return this.nome;
  }
  public void setCurso(String curso){
    this.curso = curso;
  }
  public String getCurso(){
    return this.curso;
  }
  public void setNotaPF(char notaPF){
    this.notaPF = notaPF;
  }
  public char getNotaPF(){
    return this.notaPF;
  }
  public void setLista(ArrayList<Disciplina> lista){
    this.lista = lista;
  }
  public ArrayList<Disciplina> getLista(){
    return this.lista;
  }
  public void setSizeMaxLista (int sizeMaxLista){
    this.sizeMaxLista = sizeMaxLista;
  }
  public int getSizeMaxLista(){
    return this.sizeMaxLista;
  }
}
