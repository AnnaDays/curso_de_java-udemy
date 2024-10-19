package lista_de_exercicios;

import java.util.Scanner;

public class IntervaloDeUmValor {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		double valor;
		
		System.out.println("Digite um valor");
		valor = sc.nextDouble();
		
		if(valor < 0 || valor > 100) {
			System.out.println("Fora de intervalo");
			
		} else if(valor <= 25.00) {
			System.out.println("Intervalo [0,25]");
			
		} else if(valor <= 50.00) {
			System.out.println("Intervalo (25,50]");
			
		} else if(valor <= 100.00) {
			System.out.println("Intervalo (75,100]");
			
		} else {
			System.out.println("Inválido!");
		}
		
		sc.close();
	}

}
