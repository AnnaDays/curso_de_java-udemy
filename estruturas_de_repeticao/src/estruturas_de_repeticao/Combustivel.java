package estruturas_de_repeticao;

import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int tipo;

		System.out.println("Digite o tipo de combustível:");
		tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				alcool += 1;
			} else if (tipo == 2) {
				gasolina += 1;
			} else if (tipo == 3) {
				diesel += 1;
			}
			
			tipo = sc.nextInt();
		}

		System.out.println("Muito Obrigado!");
		System.out.printf("Álcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);

		sc.close();

	}

}
