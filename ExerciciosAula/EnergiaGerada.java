import java.util.Scanner;
import java.lang.Math;

public class EnergiaGerada {
    public static void man(String[] args) {

        // Declaracao de variaveis
        int codCentral;
        int qeCentral;
        int k;
        int maiorValor;
        int maiorCentral;
        
        double media;
             
        // entrada de dados
        Scanner entrada = new Scanner(System.in);
        
        // inicializando variáveis
        maiorValor = 0;
        qeCentral = 0;
        codCentral = 0;
      
        
        System.out.println("Digite o número de centrais desejado:");
        k = entrada.nextInt();
        
        for (int i=1; i <= k; i++) {

            System.out.println("Digite o código da central " + i + " :");
            codCentral = entrada.nextInt();
    
            System.out.println("Digite a quantidade de energia gerada:");
            qeCentral = entrada.nextInt();
            
                      
           
            if (qeCentral < 800) {
                System.out.println("Central " + codCentral + " subutilizada!");
            } else if (qeCentral > 10000) {
                System.out.println("Central " + codCentral + " superutilizada!");
            }
            
            
            if (qeCentral > maiorValor) {
                maiorValor = qeCentral;
                maiorCentral = codCentral;
            } 
          
            
        }
        
        media = qeCentral / k;
        System.out.println("A média de energia gerada é de " + media);
        
        System.out.println("A central que tem maior energia é a " + maiorCentral + " com o valor de " + maiorValor);
   ;
        
        
                
    }
}