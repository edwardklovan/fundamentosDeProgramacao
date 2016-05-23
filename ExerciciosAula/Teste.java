import java.util.Scanner;

public class Teste {
	
	public static void retornaLinhas(char c, int numVezes){
		for (int i=0; i<numVezes; i++) {
			System.out.print(c);
		}
		System.out.println("");
	}

	public static double somaDois (double a, double b) {
		double res;
		res = a + b;
		return res;
	}

	public static void main (String[] args) {
		double v1, v2, soma;
		int[] valores = new int[15];


		// retornaLinhas('#', 10);

        v1 = 10;
        v2 = 10;
        // soma = somaDois(v1,v2);

        Scanner entrada = new Scanner(System.in);

        String nome = entrada.next();
		System.out.println(nome);
		char a = nome.charAt(0);
        
        // for (int i = 0; i < 5; i++) {
        // 	System.out.println(i);
        // 	valores[i] = entrada.nextInt();
        // }

        // for (int i = 0; i < 5; i++) {
        // 	System.out.println("o valor da posicao " + i + " é " + valores[i]);
        // }

        // System.out.println(somaDois(10,20));
	}


}