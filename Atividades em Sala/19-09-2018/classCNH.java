public class CNH
{
    // variáveis de instância
    private String id;
    private boolean status;
    private char categoria;
    private int pontosCarteira;

        // Construtor para objetos da classe CNH
        public CNH(String id, boolean status, char categoria, int pontosCarteira)
        {
          // inicializa variáveis de instância
          this.id = id;
          this.status = status;
          this.categoria = categoria;
          this.pontosCarteira = pontosCarteira;
        }
}
