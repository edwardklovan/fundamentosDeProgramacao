import java.util.Scanner;

public class Vetor {
    
    
    public static void imprimeV(int[] v, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(v[i]);
        }
        System.out.println();
    }

    
    public static void imprimeT(int[] t, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(t[i]);
        }
        System.out.println();
    }
    
    
    public static void man(String[] args) {       

        Scanner entrada = new Scanner(System.in);
        
        int[] v;
        int[] t;
        
        v = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o valor:");
            v[i] = entrada.nextInt();
        }
        
       imprimeV(v, 10);
       
       for (int i = 0; i < 10; i ++) {
           v[i] = v[i] + 10;
       }
       
       imprimeV(v, 10);
       
       t = new int[10];
       
       
       for (int i = 0; i < 10; i++) {
           t[n-1-i] = v[i];
       }
       
       imprimeT(t, 10);
   
      
       for () {
       
       }
                
    }
}




        //System.out.println("Digite o número de centrais desejado:");
        //k = entrada.netInt();