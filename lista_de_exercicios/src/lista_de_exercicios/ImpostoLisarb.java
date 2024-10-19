package lista_de_exercicios;

import java.util.Scanner;

public class ImpostoLisarb {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salario, imposto;
		
		System.out.println("Digite o salário:");
		salario = sc.nextDouble();
		
		if(salario <= 2000.00) {
			System.out.println("Isento");
			
		} else if(salario <= 3000.00) {
			imposto = (salario - 2000.00) * 0.08;
			System.out.printf("R$ %.2f", imposto);
			
		} else if(salario <= 4500.00) {
			imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
			System.out.printf("R$ %.2f", imposto);
			
		} else if(salario > 4500.00) {
			imposto = (salario - 4500.00) * 0.28 +1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.printf("R$ %.2f", imposto);
		}
		
		sc.close();
	}

}
