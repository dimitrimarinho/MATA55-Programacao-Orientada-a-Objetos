public class Produto{
  private int codigo, tipo;
  private String nome;
  private double preco;
  private boolean disponibilidade;
  public Produto(int codigo, int tipo, String nome){
    this.codigo = codigo;
    this.tipo = tipo;
    this.nome = nome;
  }
  public Produto(int codigo, int tipo, String nome, double preco, boolean disponibilidade){
    new Produto(codigo, tipo, nome);
    this.preco = preco;
    this.disponibilidade = disponibilidade;
  }
  void setCodigo(int codigo){
    this.codigo = codigo;
  }
  void setTipo(int tipo){
    this.tipo = tipo;
  }
  void setNome(String nome){
    this.nome = nome;
  }
  void setPreco(double preco){
    this.preco = preco;
  }
  void setDisponibilidade(boolean disponibilidade){
    this.disponibilidade = disponibilidade;
  }
  int getCodigo(){
    return this.codigo;
  }
  int getTipo(){
    return this.tipo;
  }
  String getNome(){
    return this.nome;
  }
  double getPreco(){
    return this.preco;
  }
  boolean getDisponibilidade(){
    return this.disponibilidade;
  }
}
