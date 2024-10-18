package lista_de_exercicios;

import java.util.Scanner;

public class PedidoDeComida {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int codigo, quantidade;
		double contaTotal = 0;
		
		System.out.println("Digite o código do alimento que você deseja:");
		codigo = sc.nextInt();
		
		System.out.println("Digite a quantidade do alimento que você deseja:");
		quantidade = sc.nextInt();
		
		
		if(codigo == 1) {
			contaTotal = 4.00 * quantidade;
			
		} else if (codigo == 2) {
			contaTotal = 4.50 * quantidade;
			
		} else if (codigo == 3) {
			contaTotal = 5.00 * quantidade;
			
		} else if (codigo == 4) {
			contaTotal = 2.00 * quantidade;
			
		} else if (codigo == 5) {
			contaTotal = 1.50 * quantidade;
			
		} else {
			System.out.println("Digite um código que seja válido!");
		}
		
		System.out.printf("O total a pagar é de: R$%f", contaTotal);
		
		sc.close();

	}

}
