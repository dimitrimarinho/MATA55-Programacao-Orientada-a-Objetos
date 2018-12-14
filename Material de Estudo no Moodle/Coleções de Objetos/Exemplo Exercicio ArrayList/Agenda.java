package agenda;

import java.util.ArrayList;
import java.util.Iterator;

public class Agenda {
	
	private ArrayList<Contato> aCont;
	
	public Agenda() {
		aCont = new ArrayList<Contato>();
	}
	
	public void adicionar(Contato c) {
		aCont.add(c);
	}
	
	public void removerPorNome(String nome) {
		// melhor utilizando iterator
		for(Iterator it = aCont.iterator(); it.hasNext();) {
			Contato c = (Contato) it.next();
			if(c.getNome().equals(nome)) {
				aCont.remove(c);
				break; // opcional, se considerar que s� tem um registro com o mesmo nome
			}
		}		
		
	}

	public void removerPorTelefone(String telefone) {
		// melhor utilizando iterator
		for(Iterator it = aCont.iterator(); it.hasNext();) {
			Contato c = (Contato) it.next();
			if(c.getTelefone().equals(telefone)) {
				aCont.remove(c);
				break; // opcional, se considerar que s� tem um registro com o mesmo nome
			}
		}		
	}
	
	public void alterar(String telefone, String novoNome) {
		// melhor utilizando get
		for(int i=0; i<aCont.size(); i++) {
			Contato c = aCont.get(i); 
			if(c.getTelefone().equals(telefone)) {
				c.setNome(novoNome);
				aCont.set(i, c); // atualizando o contato em i por c
				break; // opcional, se considerar que s� tem um registro com o mesmo telefone
			}
		}
		
	}
	
	public void listar() {
		System.out.println("\nListando Contatos com Iterator\n");
		for(Iterator it = aCont.iterator(); it.hasNext();) {
			Contato c = (Contato) it.next();
			System.out.println("Nome:"+c.getNome()+", Telefone:"+c.getTelefone());
		}		
		System.out.println("\nListando Contatos com for\n");
		for(Contato c : aCont) 
			System.out.println("Nome:"+c.getNome()+", Telefone:"+c.getTelefone());
	}
	
	public int totalContatos() {
		return aCont.size();
	}
}

