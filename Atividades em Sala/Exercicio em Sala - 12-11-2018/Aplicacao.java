import java.util.Scanner;
public class Aplicacao{
    public static void main(String args[]){
        Pessoa pessoa;        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome ?");
        String nome = scanner.nextLine();
        System.out.println("Voce e funcionario?");
        String func = scanner.nextLine(); 
    if(func.equals("sim")){            
            System.out.println("Voce e funcionario publico?");
            String funcpublic = scanner.nextLine();        
            if(funcpublic.equals("sim")){
                   System.out.println("Qual e o orgao?");
                   String orgao = scanner.nextLine();
                   System.out.println("Qual salario?");
                   double salario = scanner.nextDouble();                   
                   pessoa = new FuncionarioPublico(nome,salario,orgao);
                   System.out.println("O valor do emprestimo e: " + pessoa.valorEmprestimo());
            }
            else{ 
                   System.out.println("Voce e chefe de departamento?");
                   String chefe = scanner.nextLine();        
                   if(chefe.equals("sim")){
                       System.out.println("Qual departamento?");
                       String depto = scanner.nextLine();
                       System.out.println("Qual salario?");
                       double salario = scanner.nextDouble();                    
                       pessoa = new ChefeDepartamento(nome,salario,depto);
                       System.out.println("O valor do emprestimo e: " + pessoa.valorEmprestimo());
                   }
                   else{
                       System.out.println("Qual salario?");
                       double salario = scanner.nextDouble();
                       pessoa = new Funcionario(nome,salario);
                       System.out.println("O valor do emprestimo e: " + pessoa.valorEmprestimo());
                    }              
            }
        }
        else{
            pessoa = new Pessoa(nome);
            System.out.println("O valor do emprestimo e: " + pessoa.valorEmprestimo());       
        }
 }
public static double calculaEmprestimo(Pessoa p){
        double emprestimo = 1000.0;
        if(p instanceof ChefeDepartamento){
            ChefeDepartamento aux = (ChefeDepartamento) p;
            emprestimo = 3* aux.qualSalario();
        }
        else if(p instanceof Funcionario){
            Funcionario aux = (Funcionario) p;
            emprestimo = 2 * aux.qualSalario();
        }
        else if(p instanceof FuncionarioPublico){
            FuncionarioPublico aux = (FuncionarioPublico) p;
            emprestimo = 1.5 * aux.qualSalario();
        }
        return emprestimo;
  }
}
