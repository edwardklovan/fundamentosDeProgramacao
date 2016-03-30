/**
 * @author Edward
 * @version 28/03/2016

 *
 */

import java.util.Scanner;


public class AumentarEnergia {
    public static void man(String[] args) {

        // Declaracao de variaveis
        int codCentral1, codCentral2, codCentral3;
        int qeCentral1, qeCentral2, qeCentral3;
        int codigoCentral, novoValor;
        int totalEnergia;
        double mediaEnergia;
        
        codCentral1 = 50;
        codCentral2 = 51;
        codCentral3 = 52;
                
        qeCentral1 = 0;
        qeCentral2 = 0;
        qeCentral3 = 0;
        
        novoValor = 1;
        
        // entrada de dados
        Scanner entrada = new Scanner(System.in); 
        
        System.out.println("Digite o código da central que deseja alterar. Para sair digite 0");
        codigoCentral = entrada.nextInt();
                
        while (codigoCentral != 0) {
              
                System.out.println("Digite o novo valor.");
                novoValor = entrada.nextInt();
                
                //while (novoValor > 10000) {
                     //System.out.println("A central não suporta valores acima de 10000MW. Digite outro valor.");
                     //novoValor = entrada.nextInt();
                //}
                
          
                
                if (codigoCentral == codCentral1) {
                    if (qeCentral1 + novoValor < 1000) {
                        qeCentral1 = novoValor;
                    } else {
                        System.out.println("A central não aceita valores acima de 10000.");
                    }
                }
            
                if (codigoCentral == codCentral2) {
                   if (qeCentral1 + novoValor < 1000) {
                        qeCentral1 = novoValor;
                    } else {
                        System.out.println("A central não aceita valores acima de 10000.");
                    }
                }
            
                if (codigoCentral == codCentral3) {
                   if (qeCentral1 + novoValor < 1000) {
                        qeCentral1 = novoValor;
                    } else {
                        System.out.println("A central não aceita valores acima de 10000.");
                    }
                }
                
                 System.out.println("\n");
                 System.out.println("Centrais \n");
                 System.out.println("Central " + codCentral1 + ":" + qeCentral1 + "MW");
                 System.out.println("Central " + codCentral2 + ":" + qeCentral2 + "MW");
                 System.out.println("Central " + codCentral3 + ":" + qeCentral3 + "MW");
                 System.out.println("\n");
                 
                 totalEnergia = qeCentral1 + qeCentral2 + qeCentral3;
                 System.out.println("O total de energia das três centrais é de "  + totalEnergia);
                 
                 mediaEnergia = (qeCentral1 + qeCentral2 + qeCentral3) / 3;
                 System.out.println("A média de energia gasta é de " + mediaEnergia);
                 
                 System.out.println("Digite o código da central que deseja alterar. Para sair digite 0");
                 codigoCentral = entrada.nextInt();
                 System.out.println("\n");                           
            }
          
        if (codigoCentral == 0) {
            System.out.println("Você saiu do programa.");
        }
               

    }
}
