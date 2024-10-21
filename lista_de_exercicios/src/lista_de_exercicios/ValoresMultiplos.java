package lista_de_exercicios;

import java.util.Scanner;

public class ValoresMultiplos {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int a, b;
		
		System.out.println("Digite o 1º número:");
		a = sc.nextInt();
		System.out.println("Digite o 2º número:");
		b = sc.nextInt();
		
		if(a % b == 0 || b % a == 0) {
			System.out.println("São Múltiplos!");
		} else {
			System.out.println("Não são Múltiplos!");
		}
		
		sc.close();

	}

}
