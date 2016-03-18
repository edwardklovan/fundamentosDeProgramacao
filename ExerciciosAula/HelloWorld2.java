
/**
 * Escreva a descrição da classe HelloWorld aqui.
 *
 * @author Edward
 * @version 09/03/2016
 */

import java.util.Scanner;

public class HelloWorld2 {
    public static void man(String[] args) {

        // Declaracao de variaveis
        double totalVendido;
        double salarioBase, comissao, salarioBruto;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o total vendido.");
        totalVendido = entrada.nextDouble();

        salarioBase = 1000;
        comissao = totalVendido * 0.1;
        salarioBruto = salarioBase + comissao;


        System.out.println("O valor da comissão é de " + comissao + " e o salário bruto é de " + salarioBruto);
        //System.exit(0);
    }
}
