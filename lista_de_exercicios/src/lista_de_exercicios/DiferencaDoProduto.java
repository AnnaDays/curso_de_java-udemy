package lista_de_exercicios;

import java.util.Scanner;

public class DiferencaDoProduto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		System.out.println("Digite o valor de A:");
		a = sc.nextInt();
		
		System.out.println("Digite o valor de B:");
		b = sc.nextInt();
		
		System.out.println("Digite o valor de C:");
		c = sc.nextInt();
		
		System.out.println("Digite o valor de D:");
		d = sc.nextInt();
		
		diferenca = (a * b - c * d);
		
		System.out.printf("A diferença de A: %d,  B: %d,  C: %d e D: %d é %d", a, b, c, d, diferenca);
		
		sc.close();
	}

}