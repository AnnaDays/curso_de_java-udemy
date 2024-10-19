package listas_exercicios_institutofederal;

import java.util.Scanner;

public class ValoresAeB {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Digite o valor de A:");
		a = sc.nextInt();
		
		System.out.println("Digite o valor de B:");
		b = sc.nextInt();
		
		if(a == b) {
			c = a + b;
			System.out.printf("Como os valores são iguais, eles foram "
					+ "somados. RESULTADO: %d", c);
		} else {
			c = a * b;
			System.out.printf("Como os valores são diferentes, eles foram "
					+ "multiplicados. RESULTADO: %d", c);
		}
		sc.close();
	}

}
