public class Produto{
  private int codigo, tipo;
  private String nome;
  private double preco;
  private boolean disponibilidade;
  public Produto(int codigo, int tipo, String nome){
    this.codigo = codigo;
    this.tipo = tipo;
    this.nome = nome;
    switch(tipo){
        case 0:
            System.out.println("Este tipo refere-se a bar.");
        break;
        case 1:
            System.out.println("Este tipo refere-se a cozinha.");
        break;
        case 9:
            System.out.println("Este tipo categoriza outros.");
        break;
        default:
            System.out.println("Erro ! O tipo digitado é inválido.");
        break;
    }
  }
  public Produto(int codigo, int tipo, String nome, double preco, boolean disponibilidade){
    this(codigo, tipo, nome);
    this.preco = preco;
    this.disponibilidade = disponibilidade;
  }
  public void setCodigo(int codigo){
    this.codigo = codigo;
  }
  public void setTipo(int tipo){
    this.tipo = tipo;
    switch(this.tipo){
        case 0:
            System.out.println("Este tipo refere-se a bar.");
        break;
        case 1:
            System.out.println("Este tipo refere-se a cozinha.");
        break;
        case 9:
            System.out.println("Este tipo categoriza outros.");
        break;
        default:
            System.out.println("Erro ! O tipo digitado é inválido.");
        break;
    }
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public void setPreco(double preco){
    this.preco = preco;
  }
  public void setDisponibilidade(boolean disponibilidade){
    this.disponibilidade = disponibilidade;
    if(this.disponibilidade == false){
        System.out.println("Produto indisponível.");
    }
    else{
        System.out.println("Produto disponível.");
    }
  }
  public int getCodigo(){
    return this.codigo;
  }
  public int getTipo(){
      switch(this.tipo){
          case 0:
              System.out.println("Este tipo refere-se a bar.");
          break;
          case 1:
              System.out.println("Este tipo refere-se a cozinha.");
          break;
          case 9:
              System.out.println("Este tipo categoriza outros.");
          break;
          default:
              System.out.println("Erro ! O tipo digitado é inválido.");
          break;
    }
    return this.tipo;
  }
  public String getNome(){
    return this.nome;
  }
  public double getPreco(){
    return this.preco;
  }
  public boolean getDisponibilidade(){
    if(this.disponibilidade == false){
        System.out.println("Produto indisponível.");
    }
    else{
        System.out.println("Produto disponível.");
    }
    return this.disponibilidade;
  }
}
