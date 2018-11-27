import java.util.ArrayList;
import java.util.Iterator;
public class Agenda{
    private ArrayList<Contato> aCont;
    public Agenda(){
        aCont = new ArrayList<Contato>();
    }
    public void adicionar(Contato c){
        aCont.add(c);
    }
    public void removerPorNome(String nome){   
        // melhor utilizando iterator
        for(Iterator it = aCont.iterator(); it.hasNext();){
            Contato c = (Contato) it.next();
            if(c.getNome().equals(nome)){
                aCont.remove(c);
                break;      // opcional, se considerar que soh tem um registro com o mesmo nome
            }
        }
    }
    public void alterarPeloTelefone(String telefone, String novoNome){
        // melhor utilizando for
        for(int i = 0; i < aCont.size(); i++){
            Contato c = aCont.get(i);
            if(c.getTelefone().equals(telefone)){
                c.setNome(novoNome);
                aCont.set(i, c);  // atualizando o contato em i por c
                break;  // opcional, se considerar que soh tem um registro com o mesmo telefone            
            }
        }
    }
    public void listar(){
        System.out.println("\nListando contatos com Iterator\n");
        for(Iterator it = aCont.iterator(); it.hasNext();){
            Contato c = (Contato) it.next();
            System.out.println("Nome: " + c.getNome() + ", Telefone: " + c.getTelefone());
        }
        System.out.println("\nListando contatos com for avançado\n");
        for(Contato c: aCont)
            System.out.println("Nome: " + c.getNome() + ", Telefone: " + c.getTelefone());
    }
    public int totalContatos(){
        return aCont.size();
    }
}