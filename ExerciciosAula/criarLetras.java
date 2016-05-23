import java.util.Scanner;

public class criarLetras {
    
    public static String[] inicializaLetrasGigantes() {
        
        String[] letras = new String[26];
        letras[0] = "######\n#     #\n#######\n#     #\n#     #\n"; //a
        letras[1] = "#######\n#     #\n#     #\n#######\n#     #\n#     #\n######"; //b
        letras[2] = "######\n#\n#\n#\n######"; //c
    
        return letras;
    }   
    
    
    public static String converteParaLetrasGigantes(String  palavra) {
        String saida = "";
        
        char[] letrinhas = new char[26];
        letrinhas[0] = 'a';
        letrinhas[1] = 'b';
        letrinhas[2] = 'c'; 
        
        
        String[] letras = inicializaLetrasGigantes();
        
        int tamanhoPalavra = palavra.length();
        
        for (int i = 0; i < tamanhoPalavra; i++) {
            
            
            char ci = palavra.charAt(i);
            
            for (int k = 0; k < 26; k ++) {
                
                if (letrinhas[k] == ci) {
                
                    saida =  saida + letras[k];
                }
            
            }
            
            
            
            
            
            } 
            
             return saida;
        }
        
        
        //para cada letra em palavra
          //  procra letra em letrinhas usando a charAt
          // k = posicao encontrada
           
            //saida = saida + letras[k];
        
       
        
            
  
    
    
    public static void man(String[] args) {
         
        
         
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a palavra a ser convertida:");
        String palavra = entrada.next();
        
        
        String imprimir = converteParaLetrasGigantes(palavra);
         System.out.println(imprimir);
        
        
                                  
    }
}




        //System.out.println("Digite o número de centrais desejado:");
        //k = entrada.netInt();