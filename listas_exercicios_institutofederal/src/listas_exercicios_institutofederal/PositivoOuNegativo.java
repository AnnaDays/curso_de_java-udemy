package listas_exercicios_institutofederal;

import java.util.Scanner;

public class PositivoOuNegativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero, triplo, dobro;
		
		System.out.println("Digite um número:");
		numero = sc.nextInt();
		
		if(numero < 0) {
			triplo = numero * numero * numero;
			System.out.printf("Número %d é NEGATIVO, seu triplo é: %d", numero, triplo);
		} else {
			dobro = numero * 2;
			System.out.printf("Número %d é POSITIVO, seu dobro é: %d", numero, dobro);
		}
		
		sc.close();
	}

}
