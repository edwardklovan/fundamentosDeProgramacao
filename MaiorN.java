import java.util.Scanner;


public class MaiorN {
    public static void man(String[] args) {

        // Declaracao de variaveis
        int n;
        int maiorValor;
        
        maiorValor = 0;
                
        // entrada de dados
        Scanner entrada = new Scanner(System.in);
            
              
        for (int i=0; i < 4; i++) {
            
            System.out.println("Digite um número.");
            n = entrada.nextInt();
            
            if (n > maiorValor) {
                maiorValor = n;
            }
            
        }
        
        
        System.out.println("O maior valor é " + maiorValor);
        
        
        
        
        
        
                
    }
}