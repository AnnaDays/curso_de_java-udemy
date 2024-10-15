package lista_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class NumeroDePecas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, quantidadePeca1, codigoPeca2, quantidadePeca2;
		double valorUnitario1, valorUnitario2, valorTotal;
		
		System.out.println("Digite o código da primeira peça:");
		codigoPeca1 = sc.nextInt();
		System.out.println("Digite a quantidade da primeira peça:");
		quantidadePeca1 = sc.nextInt();
		System.out.println("Digite o valor unitário de cada peça:");
		valorUnitario1 = sc.nextDouble();
		
		System.out.println("Digite o código da segunda peça:");
		codigoPeca2 = sc.nextInt();
		System.out.println("Digite a quantidade da segunda peça:");
		quantidadePeca2 = sc.nextInt();
		System.out.println("Digite o valor unitário de cada peça:");
		valorUnitario2 = sc.nextDouble();
		
		sc.close();
		
		valorTotal = (valorUnitario1 * quantidadePeca1) + (valorUnitario2 * quantidadePeca2);
		
		Locale.setDefault(Locale.US);
		System.out.printf("O valor total é: %.2f", valorTotal);

	}

}
