import java.util.Scanner;

public class NumNegativo {
    public static void main(String[] args) {

        // variáveis
        int n, contador, continuar;

        // inicalizar incremento
        contador = 0;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Escreva um número.");
            n = entrada.nextInt();

            if (n < 0) {
                contador++;
            }
            System.out.println("Digite 1 para continuar");
            continuar = entrada.nextInt();

        } while (continuar == 1);

        System.out.println("Você digitou " + contador + " núneros negativos.");
    }
}
