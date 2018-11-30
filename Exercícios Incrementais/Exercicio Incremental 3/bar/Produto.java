package bar;
public class Produto{
  private int codigo, tipo;
  private String nome;
  private double preco;
  private boolean disponibilidade;
  public Produto(int codigo, int tipo, String nome){
    this.codigo = codigo;
    this.tipo = tipo;
    this.nome = nome;
    informacaoSobreTipoDoProduto(tipo);
  }
  public Produto(int codigo, int tipo, String nome, double preco, boolean disponibilidade){
    this(codigo, tipo, nome);
    this.preco = preco;
    this.disponibilidade = disponibilidade;
    informacaoSobreDisponibilidadeDoProduto(disponibilidade);
  }
  public int getCodigo(){
    return this.codigo;
  }
  public void setCodigo(int codigo){
    this.codigo = codigo;
  }
  public int getTipo(){
    informacaoSobreTipoDoProduto(this.tipo);
    return this.tipo;
  }
  public void setTipo(int tipo){
    this.tipo = tipo;
    informacaoSobreTipoDoProduto(this.tipo);
  }
  public String getNome(){
    return this.nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public double getPreco(){
    return this.preco;
  }
  public void setPreco(double preco){
    this.preco = preco;
  }
  public boolean getDisponibilidade(){
    informacaoSobreDisponibilidadeDoProduto(this.disponibilidade);
    return this.disponibilidade;
  }
  public void setDisponibilidade(boolean disponibilidade){
    this.disponibilidade = disponibilidade;
    informacaoSobreDisponibilidadeDoProduto(disponibilidade);
  }
  public void informacaoSobreTipoDoProduto(int tipo){
      switch(tipo){
          case 0:
              System.out.println("Este tipo refere-se a bar");
          break;
          case 1:
              System.out.println("Este tipo refere-se a cozinha");
          break;
          case 9:
              System.out.println("Este tipo categoriza outros");
          break;
          default:
              System.out.println("Erro ! O tipo digitado é inválido");
          break;
      }
  }
  public void informacaoSobreDisponibilidadeDoProduto(boolean disponibilidade){
      if(this.disponibilidade == false){
          System.out.println("Produto indisponível");
      }
      else{
          System.out.println("Produto disponível");
      }
  }
}
