package estruturas_de_repeticao;

import java.util.Scanner;

public class QtdDeValores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cont = 1;
		int numero;
		int soma = 0, numeroPositivo = 0, numeroNegativo = 0;
		double media = 0, percentualPositivo = 0, percentualNegativo = 0;
		
		System.out.println("Digite o limite de números que você deseja inserir:");
		int limite = sc.nextInt();
		
		while(cont <= limite) {
			System.out.printf("Digite o %dº número:%n", cont);
			numero = sc.nextInt();
			
			soma += numero;
			media = soma / limite;
			
			if(numero > 0) {
				numeroPositivo ++;
				percentualPositivo = ((double)numeroPositivo / limite) * 100;
			} else if(numero < 0){
				numeroNegativo ++;
				percentualNegativo = ((double)numeroNegativo / limite) * 100;
			}
			
			cont++;
		}
		System.out.printf("Média Aritmética dos valores: %.2f%n", media);
		System.out.printf("Quantidade de valores positivos: %d%n", numeroPositivo);
		System.out.printf("Quantidade de valores negativos: %d%n", numeroNegativo);
		System.out.printf("Percentual de valores positivos: %.2f%n", percentualPositivo);
		System.out.printf("Percentual de valores negativos: %.2f%n", percentualNegativo);
	}

}
