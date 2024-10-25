package estruturas_de_repeticao;

import java.util.Scanner;

public class IntervaloNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero25 = 0;
		int numero50 = 0;
		int numero75 = 0;
		int numero100 = 0;
		
		System.out.println("Digite um número");
		int numero = sc.nextInt();
		
		while(numero >= 0) {
			if(numero >= 0 && numero < 25) {
				numero25++;
			} else if(numero > 25 && numero < 50) {
				numero50++;
			} else if(numero > 50 && numero < 75) {
				numero75++;
			} else if(numero > 76 && numero < 100) {
				numero100++;
			} 
			
			numero = sc.nextInt();
		}
		System.out.println("FORA DE INTERVALO");
		System.out.printf("[0-25]: %d%n", numero25);
		System.out.printf("[26-50]: %d%n", numero50);
		System.out.printf("[51-75]: %d%n", numero75);
		System.out.printf("[76-100]: %d%n", numero100);

	}

}