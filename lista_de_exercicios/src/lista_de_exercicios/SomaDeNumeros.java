package lista_de_exercicios;

import java.util.Scanner;

public class SomaDeNumeros {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int numero1, numero2, soma;
		
		System.out.println("Digite o primeiro número:");
		numero1 = sc.nextInt();
		System.out.println("Digite o segundo número:");
		numero2 = sc.nextInt();
		
		sc.close();
		
		soma = numero1 + numero2;
		
		System.out.printf("A soma de %d + %d é %d", numero1, numero2, soma);

	}

}
