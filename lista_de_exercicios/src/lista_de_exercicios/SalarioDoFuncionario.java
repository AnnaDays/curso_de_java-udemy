package lista_de_exercicios;

import java.util.Scanner;

public class SalarioDoFuncionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario, numeroHoras;
		double salario, valorHoras;
		
		System.out.println("Digite o número do funcionário:");
		numeroFuncionario = sc.nextInt();
		
		System.out.println("Digite o número de horas trabalhadas:");
		numeroHoras = sc.nextInt();
		
		System.out.println("Digite o valor que recebe por hora:");
		valorHoras = sc.nextDouble();
		
		sc.close();
		
		salario = numeroHoras * valorHoras;
		
		System.out.printf("Número do Funcionário => %d%n", numeroFuncionario);
		System.out.printf("Salário do Funcionário => R$ %.2f", salario);
		
		
	}

}
