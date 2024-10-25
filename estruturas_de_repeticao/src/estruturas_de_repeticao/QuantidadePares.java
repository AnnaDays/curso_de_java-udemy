package estruturas_de_repeticao;

import java.util.Scanner;

public class QuantidadePares {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero;
		int somaPar = 0;
		int somaImpar = 0;
		int par = 0;
		int impar = 0;
		double mediaPar = 0;
		double mediaImpar = 0;
		double mediaGeral = 0;
		int soma = 0;
		
		System.out.println("Número:");
		numero = sc.nextInt();
		
		while(numero != 0) {
			if(numero % 2 == 0) {
				somaPar += numero;
				par ++;
				mediaPar = somaPar / par;
			} else {
				somaImpar += numero;
				impar ++;
				mediaImpar = somaImpar / impar;
			}
			
			soma += numero;
			mediaGeral = soma / (par + impar);
			
			numero = sc.nextInt();
		}
		
		System.out.printf("Quantidade de números pares: %d%n", par);
		System.out.printf("Quantidade de números ímpares: %d%n", impar);
		System.out.printf("Média dos valores pares: %.2f%n", mediaPar);
		System.out.printf("Média dos valores ímpares: %.2f%n", mediaImpar);
		System.out.printf("Média geral dos valores: %.2f%n", mediaGeral);

	}

}
