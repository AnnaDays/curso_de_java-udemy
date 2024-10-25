package estruturas_de_repeticao;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero, tabuada;
		int cont = 0;
		
		System.out.println("Digite um número de 0 à 10:");
		numero = sc.nextInt();
		
		while(cont < 10) {
			cont += 1;
			tabuada = cont * numero;
			System.out.printf("%d X %d = %d%n", cont, numero, tabuada);
		}
		
		sc.close();

	}

}
