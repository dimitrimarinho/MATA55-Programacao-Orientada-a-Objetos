package bar;
import java.util.ArrayList;
import java.util.Iterator;
public class Bar {
	private static ArrayList<Movimento> movimento = new ArrayList<Movimento>(); ;
	private static ArrayList<Produto> produtos = new ArrayList<Produto>();
	public Bar(){
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
}
