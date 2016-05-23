import java.util.*;
import java.lang.*;

public class JogoDaVidaT4PriscillaOverbeckEdwardKlovan{

   // public static void impssrimeMatriz (boolean [][] m){
    
    
    //}
    
    
    public static void main (String[] args){
    
        System.out.print('\u000C');
        int tam, ger;
        
        Scanner entrada = new Scanner (System.in);
        Random gerador = new Random();
                        
        do{
           System.out.println("Digite o tamanho do tabuleiro: ");
           tam = entrada.nextInt();
           System.out.println("Digite o número de gerações a executar: ");
           ger = entrada.nextInt(); 
           boolean [][] tab = new boolean [tam][tam];
           
           for (int i = 0; i < tam; i++){
               
               for (int j = 0; j < tam; j++){
                   
                   tab [i][j] = gerador.nextBoolean();
                }
                
            }
            
           for (int i = 0; i < tam; i++){
        
               for (int j = 0; j < tam; j++){
            
                   //if (tab[i][j] == true){
                    
                    System.out.print(tab[i][j] + " ");
                   // }
                   
               }
        
               System.out.println();
           }
        
        }while (tam < 15);
        
        
            
            
            
    }           
                
    public static int celulas ( boolean [][] m, int i, int j){    
            
        int cont = 0;
        if (m [i-1][j-1] == true){
        
            cont++;
            
        }else if(m [i-1][j] == true){
        
            cont++;
        
        }else if (m [i-1][j+1] == true){
        
            cont++;
            
        }else if (m [i][j-1] == true){
        
            cont++;
            
        }else if (m [i][j+1] == true){
        
            cont++;
            
        }else if (m [i+1][j-1] == true){
        
            cont++;
            
        }else if (m [i+1][j] == true){
            
            cont++;
            
        }else if (m [i+1][j+1] == true){
            
            cont++;
            
        }
        
            return cont;
    }
        
    public static void atualiza(boolean [][] m, int i, int j, int cont){ 
   
        if ((celulas (m, i, j) < 2) && ((m[i][j]) == true)){
           
            //Qualquer célula viva com menos de 2 vizinhas vivas morre (subpopulação);
            m [i][j] = false;                  

        }else if (((celulas (m, i, j) == 2) || (celulas (m, i, j) ==3)) && ((m[i][j]) == true)){
        
             //Qualquer célula viva com 2 ou 3 vizinhas vivas sobrevive para a próxima geração;
            m [i][j] = true;
             
        }else if ((celulas (m, i, j)  > 3) && ((m[i][j]) == true)){
            
            //Qualquer célula viva com mais de 3 vizinhas vivas morre (superpopulação);
            m [i][j] = false;
            
        }else if ((celulas (m, i, j) == 3) && ((m[i][j]) == true)){
        
           //Qualquer célula morta com exatamente 3 vizinhas vivas se torna viva (reprodução)
           m [i][j] = true;
        
        }
        
    }
    
}
            
        


