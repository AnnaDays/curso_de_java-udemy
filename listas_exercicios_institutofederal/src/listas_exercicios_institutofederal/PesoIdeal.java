package listas_exercicios_institutofederal;

import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char sexo;
		double altura, peso;
		
		System.out.println("Digite a altura:");
		altura = sc.nextDouble();
		
		System.out.println("Digite o gênero: [F/M]");
		sexo = sc.next().charAt(0);
		
		if(sexo == 'F' || sexo == 'f') {
			peso = (62.1 * altura) - 44.7;
			System.out.printf("O peso ideal para uma mulher é: %.2f", peso);
			
		} else if(sexo == 'M' || sexo == 'm') {
			peso = (72.7 * altura) - 58;
			System.out.printf("O peso ideal para um homem é: %.2f", peso);
			
		} else {
			System.out.println("Digite uma altura ou gênero válidos!");
		}
		
		sc.close();
	}

}
