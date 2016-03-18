/**
 * @author Edward
 * @version 10/03/2016
 * Programa que calcula a quantidade de latas de tinta necessárias
 * e o custo para pintar tanques cilíndricos de combustível.
 *
 * - a lata de tinta custa R$ 20,00
 * - cada lata contém 5 Litros
 * - cada litro pinta 3 metros quadrados
 * - área do cilindro 2 * pi * r ^ 2 + 2 * pi * r * h
 * - raio e altura devem ser os dados de entrada
 *
 */

import java.util.Scanner;
import java.lang.Math;

public class QuantidadeLatas {
    public static void man(String[] args) {

        // Declaracao de variaveis
        double areaCilindro, litrosNecessarios, quantidadeDeLatas, custoTotal;
        int alturaCilindro, raioCilindro;



        // entrada de dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a altura do cilíndro.");
        alturaCilindro = entrada.nextInt();

        System.out.println("Digite o raio do cilíndro.");
        raioCilindro = entrada.nextInt();

        areaCilindro = (2 * 3.14 * Math.pow(raioCilindro, 2)) + (2 * 3.14 * raioCilindro * alturaCilindro);
        //areaCilindro = 10;

        litrosNecessarios = areaCilindro / 3;
        quantidadeDeLatas = litrosNecessarios / 5;

        custoTotal = quantidadeDeLatas * 20.00;


        System.out.println("É necessário " + quantidadeDeLatas + " latas para pintar o cilindro.");
        System.out.println("O custo total é de " + custoTotal);
        //System.exit(0);
    }
}
