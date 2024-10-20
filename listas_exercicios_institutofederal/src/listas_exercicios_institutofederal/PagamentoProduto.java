package listas_exercicios_institutofederal;

import java.util.Scanner;

public class PagamentoProduto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double preco, precoFinal;
		int codigo;
		
		System.out.println("Digite o preço do produto:");
		preco = sc.nextDouble();
		
		System.out.println("Escolha a condição de pagamento:");
		System.out.println("==============================================================");
		System.out.println("[1] À vista em dinheiro ou cheque, recebe 10% de desconto");
		System.out.println("[2] À vista no cartão de crédito, recebe 15% de desconto");
		System.out.println("[3] Em duas vezes, preço normal de etiqueta sem juros");
		System.out.println("[4] Em duas vezes, preço normal de etiqueta mais juros de 10%");
		System.out.println("==============================================================");
		System.out.println("Digite o código da condição de pagamento (1-4): ");
		codigo = sc.nextInt();
		
		if(codigo == 1) {
			 precoFinal = preco - (preco * 0.10);
	            System.out.printf("O preço original era: R$ %.2f%n", preco);
	            System.out.printf("Com o desconto de 10%%, o valor final a ser pago é: R$ %.2f%n", precoFinal);
			
		} else if(codigo == 2) {
			precoFinal = preco - (preco * 0.15);
			System.out.printf("O preço original era: R$ %.2f%n", preco);
			System.out.printf("O preço com o desconto de 15%% fica %.2f", precoFinal);
			
		} else if(codigo == 3) {
			precoFinal = preco;
			System.out.printf("O preço em duas vezes fica %.2f", precoFinal);
			
		} else if(codigo == 4) {
			precoFinal = preco + (preco * 0.10);
			System.out.printf("O preço original era: R$ %.2f%n", preco);
			System.out.printf("O preço em duas vezes + os juros fica %.2f", precoFinal);
			
		} else {
			System.out.printf("Código inválido!");
		}
		
		sc.close();
	} 

}
