package listas_exercicios_institutofederal;

import java.util.Scanner;

public class SomaAeB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		int soma = 0;
		
		System.out.println("Digite o valor de A:");
		a = sc.nextInt();
		
		System.out.println("Digite o valor de B:");
		b = sc.nextInt();
		
		System.out.println("Digite o valor de C:");
		c = sc.nextInt();
		
		soma = a + b;
		
		if(soma < c) {
			System.out.println("A soma de A e B é menor do que o valor de C!");
			
		} else if(soma == c) {
			System.out.println("A soma de A e B é igual ao valor de C!");
			
		} else {
			System.out.println("A soma de A e B é maior do que o valor de C!");
		}
		
		sc.close();
	}
	

}
