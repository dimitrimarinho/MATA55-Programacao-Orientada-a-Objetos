package bar;
import java.util.ArrayList;
import java.util.Iterator;
public class Bar {
	private static ArrayList<Movimento> movimento; 
	private static ArrayList<Produto> produtos; 
	private static ArrayList<FormaDePagamento> pagamentos; 
	public Bar(){
		movimento = new ArrayList<Movimento>();
		produtos = new ArrayList<Produto>();
		pagamentos = new ArrayList<FormaDePagamento>();
	}
	public static ArrayList<Movimento> getMovimento() {
		return movimento;
	}
	public static void setMovimento(ArrayList<Movimento> movimento) {
		Bar.movimento = movimento;		
	}
	public static ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public static void setProdutos(ArrayList<Produto> produtos) {
		Bar.produtos = produtos;
	}
	public static boolean adicionarMovimento(Movimento novoMovimento) {
        boolean adicionado = false;
        if(movimento.isEmpty()){
            System.out.println("Movimento adicionado");
            movimento.add(novoMovimento);
            adicionado = true;
        }        
        else{
            for(Iterator<Movimento> it = movimento.iterator(); it.hasNext();) {
               Movimento m = (Movimento) it.next();
               if(m.getMesa() == novoMovimento.getMesa()) {
                       if(m.getStatus() == 9) {
                            movimento.add(novoMovimento);
                            System.out.println("Movimento adicionado");             
                            adicionado = true;
                            return adicionado;                            
                        }
                        else {
                            System.out.println("Movimento não foi adicionado. A mesa está ocupada e a conta não foi encerrada");
                            adicionado = false;
                            return adicionado;
                        }
               }               
            }
            System.out.println("Movimento adicionado");
            movimento.add(novoMovimento);
            adicionado = true;
        }
        return adicionado;
    }
	public static boolean removerMovimento(int mesa) {
		for(Iterator<Movimento> it = movimento.iterator(); it.hasNext();) {
			Movimento m = (Movimento) it.next();
			if(m.getMesa() == mesa) {
				movimento.remove(m);
				System.out.println("Movimento encontrado e removido");
				return true;
			}
		}
		System.out.println("Não foi encontrado movimento na mesa indicada");
		return false;
	}
	public static void adicionarProduto(Produto novoProduto) {
		produtos.add(novoProduto);
	}
	public static boolean removerProduto(int codigo) {
		for(Iterator<Produto> it = produtos.iterator(); it.hasNext();) {
			Produto p = (Produto) it.next();
			if(p.getCodigo() == codigo) {
				produtos.remove(p);
				System.out.println("Produto encontrado e removido");
				return true;
			}
		}
		System.out.println("Não foi encontrado produto com o código indicado");
		return false;
	}
	public void relatorioMovimentacao(){
		for(Iterator<Movimento> it = movimento.iterator(); it.hasNext();) {
			Movimento m = (Movimento) it.next();
	    	System.out.print("\nNome do Cliente: " + m.getClientes().get(0).getNome() + "\nID do Cliente: " + m.getClientes().get(0).getID() + "\nTipo do Cliente: " + m.getClientes().get(0).getTipo() + "\nCategoria do Cliente: " + m.getClientes().get(0).getCategoria() + "\nData da Abertura da Movimento: " + m.stringGetDataAbertura() + "\nData de Fechamento do Movimento: " + m.stringGetDataFechamento() + "\n\n");
		}
	}   
	public static void adicionarPagamento(FormaDePagamento novoPagamento) {
		pagamentos.add(novoPagamento);
	}
	public static boolean removerPagamento(int idPagamento) {
		for(Iterator<FormaDePagamento> it = pagamentos.iterator(); it.hasNext();) {
			FormaDePagamento p = (FormaDePagamento) it.next();
			if(p.getId() == idPagamento) {
				pagamentos.remove(p);
				System.out.println("Pagamento encontrado e removido");
				return true;
			}
		}
		System.out.println("Não foi encontrado pagamento com o ID indicado");
		return false;
	}
	public static void listaFormasPagamento(){
		for(Iterator<FormaDePagamento> it = pagamentos.iterator(); it.hasNext();) {
			FormaDePagamento p = (FormaDePagamento) it.next();
			System.out.println("\nID do Pagamento: " + p.getId() + "\nNome: " + p.getNome());
			if(p.isAtivo() == true) 
				System.out.println("Pagamento Ativo ? Sim");
			else
				System.out.println("Pagamento Ativo ? Não");
			if (p instanceof Credito) {
				Credito aux = (Credito) p;
				System.out.print("Taxa de Retenção (em R$): " + aux.getTaxaRetencao() + "\nPrazo (em meses): " + aux.getPrazoPagamento());
			}
			else if (p instanceof Debito) {
				Debito aux = (Debito) p;
				System.out.print("Taxa de Retenção (em R$): " + aux.getTaxaRetencao() + "\nConta Corrente: " + aux.getContaCorrente());
			}
			else if (p instanceof Voucher) {
				Voucher aux = (Voucher) p;
				System.out.print("Diária (em R$): " + aux.getDiaria() + "\nPrazo (em meses): " + aux.getPrazoPagamento() + "\nConta Corrente: " + aux.getContaCorrente());
			}
			else if (p instanceof Dinheiro) {
				Dinheiro aux = (Dinheiro) p;
				System.out.print("Forma de pagamento: " + aux.getForma());
			}
			System.out.println();
		}
	}
}
