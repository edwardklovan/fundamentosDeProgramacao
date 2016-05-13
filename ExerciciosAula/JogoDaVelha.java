import java.util.Scanner;

public class JogoDaVelha {
    
    public static void imprimeTabuleiro(int[][]tabuleiro) {

        for (int i = 0; i < 3; i++){
            System.out.println(" +---+---+---+");
            for (int j = 0; j < 3; j++ ) {
               
                if (tabuleiro[i][j] == 0) {
                    System.out.print(" |" + " ");
                } else if (tabuleiro[i][j] == 1) {
                    System.out.print(" |" + " X");
                } else if (tabuleiro[i][j] == -1) {
                    System.out.print(" |" + " O");
                }
            }
            System.out.println(" |");
        }
        System.out.println(" +---+---+---+");
    }
    
    
    
    
    public static void main(String[] args) {       
        
        int[][] tabuleiro;
        tabuleiro = new int[3][3];
        
        
        
        for (int i = 0; i < 2; i++) {
            
            for (int j = 0; j < 2; j++) {
              tabuleiro[i][j] = 0;
            }
        
        }
        
        imprimeTabuleiro(tabuleiro);
        
        int resultado = testaQuemGanhou(tabuleiro);
        
        if(resulta == 1){
            System.out.println("O Jogador X ganhou");
            continuar = falso;
        }
        
    }
}




        //System.out.println("Digite o número de centrais desejado:");
        //k = entrada.netInt();
        //Scanner entrada = new Scanner(System.in);