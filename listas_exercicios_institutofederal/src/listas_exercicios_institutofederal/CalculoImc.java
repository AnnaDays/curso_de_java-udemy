package listas_exercicios_institutofederal;

import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double peso, altura, imc;
		
		System.out.println("Digite o seu peso:");
		peso = sc.nextDouble();
		
		System.out.println("Digite a sua altura:");
		altura = sc.nextDouble();
		
		imc = peso / Math.pow(altura, 2);
		
		if(imc < 18.5) {
			System.out.printf("Seu IMC é: %.2f -> Abaixo do peso", imc);
			
		} else if(imc >= 18.5 && imc <= 25) {
			System.out.printf("Seu IMC é: %.2f -> Peso normal", imc);
			
		} else if(imc >= 25 && imc <= 30) {
			System.out.printf("Seu IMC é: %.2f -> Sobrepeso", imc);
			
		} else {
			System.out.printf("Seu IMC é: %.2f -> Obeso", imc);
		}
		
		sc.close();

	}

}
