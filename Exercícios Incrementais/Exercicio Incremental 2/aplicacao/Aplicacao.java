package aplicacao;
import java.util.Scanner;
import bar.*;
public class Aplicacao {
    public static void main(String[] args) {
        Cliente cliente;
        Especial especial;
        VIP vip;
        Movimento adicionaMovimento;
        Scanner scanner = new Scanner(System.in);
        @SuppressWarnings("unused")
        String enter;
        System.out.println("Deseja adicionar um novo movimento ? Digite 'Sim' ou 'Nao'");
        String novoMovimento = scanner.nextLine();
        @SuppressWarnings("unused")
        Bar novoBar = new Bar();
        while(!novoMOvimento("Nao")){
            if (novoMovimento.equals("Sim") || novoMovimento.equals("Nao")){
                while(novoMovimento.equals("Sim")) {
                    System.out.println("Digite o número da mesa destinada ao novo movimento");
                    int mesa = scanner.nextInt();
                    adicionaMovimento = new Movimento(mesa);
                    Bar.adicionarMovimento(adicionaMovimento);
                    System.out.println("Seja bem-vindo ao bar. Sinta-se a vontade no nosso estabelecimento, mas antes precisamos fazer o seu cadastro de cliente");
                    System.out.println("Qual o seu nome ?");
                    enter = scanner.nextLine();
                    String nome = scanner.nextLine();
                    System.out.println("Digite agora um inteiro para ser seu número de identificação");
                    int ID = scanner.nextInt();
                    System.out.println("Qual tipo de cliente você é ? Digite 0 para Pessoa Física e 1 para Pessoa Jurídica");
                    int tipo = scanner.nextInt();
                    System.out.println("Em qual categoria de cliente você se enquadra ? Digite '0' para Normal, '1' para Especial e '2' para VIP");
                    int categoria = scanner.nextInt();
                    if(categoria == 0) {
                        cliente = new Cliente(ID, tipo, categoria, nome);
                        System.out.println("Cadastro de cliente concluído com sucesso");
                        adicionaMovimento.adicionaCliente(cliente);
                        enter = scanner.nextLine();
                    }
                    else if(categoria == 1) {
                        System.out.println("Como você é um cliente Especial precisamos de mais informações");
                        System.out.println("Qual o seu endereço ?");
                        enter = scanner.nextLine();
                        String endereco = scanner.nextLine();
                        System.out.println("Digite agora o seu telefone");
                        String telefone = scanner.nextLine();
                        System.out.println("Agora digite um email para contato");
                        String email = scanner.nextLine();
                        System.out.println("Qual o seu sexo ? Digite 'M' para Masculino ou 'F' para Feminino");
                        char sexo = scanner.next().charAt(0);
                        especial = new Especial(ID, tipo, categoria, nome, endereco, telefone, email, sexo);
                        System.out.println("Cadastro de cliente Especial concluído com sucesso");
                        adicionaMovimento.adicionarClienteEspecial(especial);
                        enter = scanner.nextLine();
                    }
                    else if(categoria == 2) {
                        System.out.println("Como você é um cliente VIP precisamos de mais informações");
                        System.out.println("Qual o seu endereço ?");
                        enter = scanner.nextLine();
                        String endereco = scanner.nextLine();
                        System.out.println("Digite agora o seu telefone");
                        String telefone = scanner.nextLine();
                        System.out.println("Agora digite um email para contato");
                        String email = scanner.nextLine();
                        System.out.println("Qual o seu sexo ? Digite 'M' para Masculino ou 'F' para Feminino");
                        char sexo = scanner.next().charAt(0);
                        System.out.println("Já estamos acabando, precisamos de mais duas informações");
                        System.out.println("Digite agora o valor do seu limite no bar");
                        double limite = scanner.nextDouble();
                        System.out.println("Por fim, digite o gerente que lhe atende");
                        enter = scanner.nextLine();
                        String gerente = scanner.nextLine();
                        vip = new VIP(ID, tipo, categoria, nome, endereco, telefone, email, sexo, limite, gerente);
                        System.out.println("Cadastro de cliente VIP concluído com sucesso");
                        adicionaMovimento.adicionarClienteVIP(vip);
                    }
                    System.out.println("Deseja adicionar um novo movimento ? Digite 'Sim' ou 'Nao'");
                    novoMovimento = scanner.nextLine();
                }
                if(novoMovimento.equals("Nao")){
                        System.out.println("A adição de novos movimentos foi encerrada. Deseja imprimir o relatório ? Digite 'Sim' ou 'Nao'");
                        String relatorio = scanner.nextLine();
                        if(relatorio.equals("Sim")) {
                            novoBar.relatorioMovimentacao();
                            break;
                        }
                        else if(relatorio.equals("Nao")) {
                            System.out.println("Conforme solicitado, não será adicionado um novo movimento nem será impresso o relatório");
                            break;
                        }
                }
            }
            else if(!novoMovimento.equals("Sim") || !novoMovimento.equals("Nao")) {
                while(!novoMovimento.equals("Sim") || !novoMovimento.equals("Nao")) {
                    System.out.println("Você digitou um comando inválido. Digite 'Sim' se desejar adicionar um novo cliente ou 'Nao' caso contrário");
                    novoMovimento = scanner.nextLine();
                    if(novoMovimento.equals("Sim") || novoMovimento.equals("Nao"))
                        break;
                }
            }
        }
    }
}
