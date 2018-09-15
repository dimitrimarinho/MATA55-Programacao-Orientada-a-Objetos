import java.lang.Math;
public class ContaCorrente
{
    private int numeroConta, digitosVerificadores,numeroAgencia, grauConta, saldo, limiteConta, numDigitos;
    private boolean statusConta;

    public ContaCorrente(int numeroConta, int numeroAgencia, int grauConta, int limiteConta, int depositoInicial)
        {
            this.numeroConta = numeroConta;
            this.numeroAgencia = numeroAgencia;
            this.grauConta = grauConta;
            this.limiteConta = limiteConta;
            this.saldo = 0;
            switch(grauConta)
            {
                case 0:
                    if(limiteConta == 0 && depositoInicial > 100)
                    {
                        statusConta = true;
                    }
                    else
                    {
                        if(limiteConta != 0)
                        {
                            if(depositoInicial <= 100)
                            {
                                 System.out.println("O limite da Conta e o depósito inicial não são válidos para esse grau de Conta");
                            }
                            else if(depositoInicial > 100)
                            {
                                System.out.println("O limite da Conta não é válido para esse grau de Conta");
                            }
                        }
                        else if(depositoInicial <= 100)
                        {
                            System.out.println("O depósito inicial não é válido para esse grau de Conta");
                        }
                        statusConta = false;
                    }
                break;
                case 1:
                    if(limiteConta >= 0 && depositoInicial >= 200)
                    {
                        statusConta = true;
                    }
                    else
                    {
                        if(limiteConta < 0)
                        {
                            if(depositoInicial < 200)
                            {
                                 System.out.println("O limite da Conta e o depósito inicial não são válidos para esse grau de Conta");
                            }
                            else if(depositoInicial >= 200)
                            {
                                System.out.println("O limite da Conta não é válido para esse grau de Conta");
                            }
                        }
                        else if(depositoInicial < 200)
                        {
                            System.out.println("O depósito inicial não é válido para esse grau de Conta");
                        }
                        statusConta = false;
                    }
                break;
                case 2:
                    if(limiteConta >= 0 && depositoInicial >= 500)
                    {
                        statusConta = true;
                    }
                    else
                    {
                        if(limiteConta < 0)
                        {
                            if(depositoInicial < 500)
                            {
                                 System.out.println("O limite da Conta e o depósito inicial não são válidos para esse grau de Conta");
                            }
                            else if(depositoInicial >= 500)
                            {
                                System.out.println("O limite da Conta não é válido para esse grau de Conta");
                            }
                        }
                        else if(depositoInicial < 500)
                        {
                            System.out.println("O depósito inicial não é válido para esse grau de Conta");
                        }
                        statusConta = false;
                    }
                break;
                case 3:
                    if(limiteConta >= 0 && depositoInicial >= 1000)
                    {
                        statusConta = true;
                    }
                    else
                    {
                        if(limiteConta < 0)
                        {
                            if(depositoInicial < 1000)
                            {
                                 System.out.println("O limite da Conta e o depósito inicial não são válidos para esse grau de Conta");
                            }
                            else if(depositoInicial >= 1000)
                            {
                                System.out.println("O limite da Conta não é válido para esse grau de Conta");
                            }
                        }
                        else if(depositoInicial < 1000)
                        {
                            System.out.println("O depósito inicial não é válido para esse grau de Conta");
                        }
                        statusConta = false;
                    }
                break;
            }
        this.saldo+= depositoInicial;

    }
    /* Método que calcula quantos dígitos tem o número da Conta */
    int digitosNumeroConta()
    {
        int var = numeroConta;
        while(var != 0)
        {
          var = var/10;
          numDigitos++;
        }
        return numDigitos;
    }
    int calc1DigV()
    {
      double var = Math.pow(10, numDigitos);
      int primeiroVerificador = 0, contador = 1, varNumConta = numeroConta;
      while(var != 1)
      {
        var = var/10;
        primeiroVerificador += (varNumConta/var)*contador;
        contador++;
        varNumConta-= (numeroConta/var)*var;
      }
      return primeiroVerificador;
    }
    int calc2DigV()
    {
      double var = 10;
      int segundoVerificador = 0, contador = 1;
      while(var != 0)
      {
        segundoVerificador += (numeroConta%var)*contador;
        contador++;
        var = Math.pow(10, contador);
      }
      return segundoVerificador;
    }
}
