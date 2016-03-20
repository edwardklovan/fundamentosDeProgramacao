import java.util.Scanner;

public class CelsiusToFahrenheit {
	public static void main(String[] args) {

		// variaveis
		int c, f;

		Scanner entrada = new Scanner (System.in);

		System.out.println("Digite a temperatura em Celsius.");
		c = entrada.nextInt();

		f = (9/5) * (c) + 32;

		System.out.println(f);

	}
}
