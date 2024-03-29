/* 
Slide: POO com Java
(página 24 de 33)
https://www.moodle.ufba.br/pluginfile.php/579183/mod_resource/content/1/MATA55_IntroducaoPOOJava2017.pdf

Exercício:

Escrever, de acordo com a sintaxe apresentada, a classe Filme do exercício da locadora.
Atributos: Titulo, ator, lancamento, qtd_copias
Métodos: Construtor, Locar (), Devolver( ), só considerando o filme

Código no BlueJ: Filme.class
*/
/**
 * Descrição do Exercício (Programação OO com Java)
 * 
 * Escrever, de acordo com a sintaxe apresentada, a classe Filme do exercício da locadora
 * Atributos: Titulo, ator, lancamento, qtd_copias
 * Métodos: Construtor, Locar(), Devolver()
 */
public class Filme
{
    // Variáveis de instância
    private String titulo;
    private String ator;
    private int anoLancamento;
    private int qtdCopias;
    /**
     * Construtor para objetos da classe Filme
     */
    public Filme(String newTitulo, String newAtor, int newAnoLancamento, int newQtdCopias)
    {
        // Inicializa as variáveis de instância
        this.titulo = newTitulo;
        this.ator = newAtor;
        this.anoLancamento = newAnoLancamento;
        this.qtdCopias = newQtdCopias;
    }  
    public void locar(int qtdCopias)
    {
        qtdCopias--;
    }
    public void devolver(int qtdCopias)
    {
        qtdCopias++;
    }
}
