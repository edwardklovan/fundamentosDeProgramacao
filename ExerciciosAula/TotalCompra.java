/**
 * @author Edward
 * @version 16/03/2016
 */
import java.util.Scanner;

public class TotalCompra {
    public static void man(String[] args) {

        // Declaracao de variaveis
        int quantidadeProduto;
        double precoUnitario, valorTotal, desconto, bonus = 0;

        // entrada de dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a quantidade comprada");
        quantidadeProduto = entrada.nextInt();

        System.out.println("Insira o preço unitário");
        precoUnitario = entrada.nextDouble();

        valorTotal = quantidadeProduto * precoUnitario;

        if (valorTotal < 100) {
            desconto = valorTotal * 0.05;

        } else if (valorTotal >= 1000)  {
            desconto = valorTotal * 0.05;
            bonus = valorTotal * 0.05;
        } else {
            desconto = valorTotal * 0.05;
            bonus = valorTotal * 0.05;
            System.out.println("Cliente VIP");
        }

        //valorTotal = valorTotal - desconto;

        System.out.println("O valor total é de " + valorTotal);
        System.out.println("O valor com desconto é de" + desconto);
        System.out.println("O seu bonus é de" + bonus);
    }
}
