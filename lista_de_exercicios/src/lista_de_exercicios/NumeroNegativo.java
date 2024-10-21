package lista_de_exercicios;

import java.util.Scanner;

public class NumeroNegativo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite o número:");
		numero = sc.nextInt();
		
		
		if(numero < 0) {
			System.out.println("NEGATIVO");
			
		} else {
			System.out.println("NÃO NEGATIVO");
		}

		sc.close();
	}

}
