/*
Slide: POO com Java
(página 27 de 33)
https://www.moodle.ufba.br/pluginfile.php/579183/mod_resource/content/1/MATA55_IntroducaoPOOJava2017.pdf

Exercício:

Criar uma classe triângulo
Atributos: lado1, lado2, lado3
Métodos: éEquilatero()

Código no BlueJ: Triangulo.class
*/
/**
 * Exercício:   Criar uma classe triângulo
 * 
 * Atributos: lado1, lado2, lado3 
 * Método: isEquilateral
 */
 
public class Triangulo
{
    // Variáveis de instância
    private double lado1, lado2, lado3;
    /**
     * Construtor para objetos da classe Triangulo
     */
    public Triangulo(double newLado1, double newLado2, double newLado3)
    {
        // Inicializa variáveis de instância
        this.lado1 = newLado1;
        this.lado2 = newLado2;
        this.lado3 = newLado3;
    }

    public boolean isEquilateral()
    {
        if (lado1 == lado2 && lado1 == lado3)
            return true;
        else
            return false;        
    }
}
