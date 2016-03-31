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
<<<<<<< HEAD
=======
        double soma;
>>>>>>> b44f1a0df7d3fbd0379a9e287f372ec22cd9a707
        
        codCentral1 = 50;
        codCentral2 = 51;
        codCentral3 = 52;
                
        qeCentral1 = 0;
        qeCentral2 = 0;
        qeCentral3 = 0;
        
        novoValor = 1;
<<<<<<< HEAD
=======
        soma = 0;
>>>>>>> b44f1a0df7d3fbd0379a9e287f372ec22cd9a707
        
        // entrada de dados
        Scanner entrada = new Scanner(System.in); 
        
        System.out.println("Digite o código da central que deseja alterar. Para sair digite 0");
        codigoCentral = entrada.nextInt();
                
<<<<<<< HEAD
        while (codigoCentral != 0) {
=======
        while (codigoCentral != 0 && soma <= 24000) {
>>>>>>> b44f1a0df7d3fbd0379a9e287f372ec22cd9a707
              
                System.out.println("Digite o novo valor.");
                novoValor = entrada.nextInt();
                
<<<<<<< HEAD
                while (novoValor > 10000) {
                     System.out.println("A central não suporta valores acima de 10000MW. Digite outro valor.");
                     novoValor = entrada.nextInt();
                }
=======
                //while (novoValor > 10000) {
                     //System.out.println("A central não suporta valores acima de 10000MW. Digite outro valor.");
                     //novoValor = entrada.nextInt();
                //}
>>>>>>> b44f1a0df7d3fbd0379a9e287f372ec22cd9a707
                
          
                
                if (codigoCentral == codCentral1) {
<<<<<<< HEAD
                    qeCentral1 = novoValor;
                }
            
                if (codigoCentral == codCentral2) {
                    qeCentral2 = novoValor;
                }
            
                if (codigoCentral == codCentral3) {
                    qeCentral3 = novoValor;
=======
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
>>>>>>> b44f1a0df7d3fbd0379a9e287f372ec22cd9a707
                }
                
                 System.out.println("\n");
                 System.out.println("Centrais \n");
                 System.out.println("Central " + codCentral1 + ":" + qeCentral1 + "MW");
                 System.out.println("Central " + codCentral2 + ":" + qeCentral2 + "MW");
                 System.out.println("Central " + codCentral3 + ":" + qeCentral3 + "MW");
                 System.out.println("\n");
                 
                 totalEnergia = qeCentral1 + qeCentral2 + qeCentral3;
                 System.out.println("O total de energia das três centrais é de "  + totalEnergia);
                 
<<<<<<< HEAD
                 mediaEnergia = (qeCentral1 + qeCentral2 + qeCentral3) / 3;
                 System.out.println("A média de energia gasta é de " + mediaEnergia);
                 
                 System.out.println("Digite o código da central que deseja alterar. Para sair digite 0");
                 codigoCentral = entrada.nextInt();
                 System.out.println("\n");                           
=======
                 soma = qeCentral1 + qeCentral2 + qeCentral3;
                 mediaEnergia = soma / 3;
                 System.out.println("A média de energia gasta é de " + mediaEnergia);
                 
                 
                 if (soma < 24000) {
                     System.out.println("Digite o código da central que deseja alterar. Para sair digite 0");
                     codigoCentral = entrada.nextInt();
                     System.out.println("\n");
                    }
>>>>>>> b44f1a0df7d3fbd0379a9e287f372ec22cd9a707
            }
          
        if (codigoCentral == 0) {
            System.out.println("Você saiu do programa.");
        }
               

    }
}
