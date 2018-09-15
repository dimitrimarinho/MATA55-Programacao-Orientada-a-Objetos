import java.lang.Math;
import java.lang.Character.*;
import java.lang.String.*;
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
    int calc1DigV()
    {
      int cont = 0, contCasa = 0, calc1digi = 0;
      String varNumConta = Integer.toString(numeroConta);
      while(cont != varNumConta.length()){
        cont++;
        calc1digi+= (Character.getNumericValue(varNumConta.charAt(contCasa)))*cont;
        // System.out.println("\n"); // Debug
        // System.out.printf("while1 calc1digi é %d", calc1digi); // Debug
        contCasa++;
      }
      String varCalc1digi = Integer.toString(calc1digi);
      while(varCalc1digi.length() != 1)
      {
        calc1digi = (Integer.parseInt(varCalc1digi)) - 9;
        // System.out.println("\n"); // Debug
        // System.out.printf("while2 calc1digi é %d", calc1digi); // Debug
        varCalc1digi = Integer.toString(calc1digi);
      }
      return calc1digi;
    }
    int calc2DigV()
    {
      int contCasa = 0, calc2digi = 0;
      String varNumConta = Integer.toString(numeroConta);
      int cont = varNumConta.length();
      while(cont != 0){
        calc2digi+= (Character.getNumericValue(varNumConta.charAt(contCasa)))*cont;
        cont--;
        // System.out.println("\n"); // Debug
        // System.out.printf("while1 calc2digi é %d", calc2digi); // Debug
        contCasa++;
      }
      String varCalc2digi = Integer.toString(calc2digi);
      while(varCalc2digi.length() != 1)
      {
        calc2digi = (Integer.parseInt(varCalc2digi)) - 9;
        // System.out.println("\n"); // Debug
        // System.out.printf("while2 calc2digi é %d", calc2digi); // Debug
        varCalc2digi = Integer.toString(calc2digi);
      }
      return calc2digi;
    }
}
