/**
 * @author Edward
 * @version 10/03/2016

 *
 */

import java.util.Scanner;
import java.lang.Math;

public class DistanciaEntrePontos {
    public static void man(String[] args) {

        // Declaracao de variaveis
        double x1, x2, y1, y2, distancia;



        // entrada de dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("Valor de x1.");
        x1 = entrada.nextDouble();

        System.out.println("Valor de x2.");
        x2 = entrada.nextDouble();

        System.out.println("Digite o valor de y1.");
        y1 = entrada.nextDouble();

        System.out.println("Digite o valor de y2.");
        y2 = entrada.nextDouble();

        distancia = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));

        System.out.println("A distância entre os pontos é de " + distancia);
    }
}
