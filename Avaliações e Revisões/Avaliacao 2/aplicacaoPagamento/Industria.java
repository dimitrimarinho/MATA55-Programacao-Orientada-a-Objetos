package aplicacaoPagamento;

import java.util.ArrayList;
import java.util.Iterator;

public class Industria {

	private ArrayList<Empregado> funcionarios;
	private ArrayList<Fornecedor> terceiros;
	
	public Industria() {
		funcionarios = new ArrayList<Empregado>();
		terceiros = new ArrayList<Fornecedor>();
	}

	public void adicionarFuncionario(Empregado e) {
		try {
			funcionarios.add(e);
		} catch (NullPointerException exc) {
			System.out.println("A referência para o empregado é nula");
		}
	}
	
	public void removerFuncionario(String CPF) {
		for (Iterator<Empregado> it = funcionarios.iterator(); it.hasNext();) {
			Empregado e = (Empregado) it.next();
			if(e.getCPF().equals(CPF))
				funcionarios.remove(e);
		}		
	}
	
	public void adicionarTerceiro(Fornecedor f) {
		try {
			terceiros.add(f);
		} catch (NullPointerException exc) {
			System.out.println("A referência para o fornecedor é nula");
		}
	}
	
	public void removerTerceiro(String CNPJ) {
		for (Iterator<Fornecedor> it = terceiros.iterator(); it.hasNext();) {
			Fornecedor f = (Fornecedor) it.next();
			if(f.getCNPJ().equals(CNPJ))
				terceiros.remove(f);
		}		
	}
	
	public void listaPagamentos() {
		
		if(!funcionarios.isEmpty()) {
			System.out.println("Listagem dos pagamentos feitos aos empregados: \n");
			for (Iterator<Empregado> it = funcionarios.iterator(); it.hasNext();) {
				Empregado e = (Empregado) it.next();
				if(e instanceof Operador) {
					Operador op = (Operador) e;
					System.out.printf(op.informarPagamento());
				}
				else if(e instanceof Engenheiro) {
					Engenheiro eng = (Engenheiro) e;
					System.out.printf(eng.informarPagamento());
				}
				else if(e instanceof Empregado) {
					System.out.printf(e.informarPagamento());
				}
			}
		}
		else
			System.out.println("Não há empregados cadastrados");
		if(!terceiros.isEmpty()) {
			System.out.println("\nListagem dos pagamentos feitos aos fornecedores: \n");
			for (Iterator<Fornecedor> it = terceiros.iterator(); it.hasNext();) {
				Fornecedor f = (Fornecedor) it.next();
				System.out.printf(f.informarPagamento());
			}
		}
		else
			System.out.println("Não há fornecedores cadastrados");
		
	}
    	
	public ArrayList<Empregado> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<Empregado> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public ArrayList<Fornecedor> getTerceiros() {
		return terceiros;
	}

	public void setTerceiros(ArrayList<Fornecedor> terceiros) {
		this.terceiros = terceiros;
	}
		
}
