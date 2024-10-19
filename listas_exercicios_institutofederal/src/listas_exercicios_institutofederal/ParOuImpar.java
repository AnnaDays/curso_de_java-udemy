package listas_exercicios_institutofederal;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero, resultado;
		
		System.out.println("Digite um número:");
		numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			resultado = numero + 5;
			System.out.printf("O número %d é PAR, seu resultado é: %d", numero, resultado);
			
		} else {
			resultado = numero + 8;
			System.out.printf("O número %d é ÍMPAR, seu resultado é: %d", numero, resultado);
		}
		
		sc.close();
	}

}
