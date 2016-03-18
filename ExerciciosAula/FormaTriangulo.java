/**
 * @author Edward
 * @version 16/03/2016

 *
 */
import java.util.Scanner;
import java.lang.Math;

public class FormaTriangulo {
    public static void man(String[] args) {

        // Declaracao de variaveis
        double x, y, z;
        boolean triangulo;
        double a, b, c;

        // entrada de dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira x");
        x = entrada.nextDouble();

        System.out.println("Insira y");
        y = entrada.nextDouble();

        System.out.println("Insira z");
        z = entrada.nextDouble();

     // a soma de deois lados tem que ser maior que o terceiro
     // e a diferenca desses dois deve ser menos que o terceiro.
     // priscilla.oliveira@acad.pucrs.br


        if ((x < y + z) && (y < x + z) && (z < x + y)) {
           System.out.println("ok");
           //System.out.println(a);

        } else {
           System.out.println("Os pontos não formam um triângulo");
        }



        //m = Math.max(x, y);
        //System.out.println(m);

    }
}
