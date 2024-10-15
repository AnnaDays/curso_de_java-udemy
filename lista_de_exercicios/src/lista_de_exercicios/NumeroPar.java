package lista_de_exercicios;

import java.util.Scanner;

public class NumeroPar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite o número:");
		numero = sc.nextInt();
		
		
		if(numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}

	}

}
