package estruturas_de_repeticao;

import java.util.Scanner;

public class AlturaPessoas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cont = 1;
		double alturaMaior = 0;
		double alturaMenor = 9999;
		
		while(cont <= 15) {
			System.out.printf("Digite a %dº altura:", cont);
			double altura = sc.nextDouble();
			if(altura < alturaMenor) {
				alturaMenor = altura;
			} else if(altura > alturaMaior) {
				alturaMaior = altura;
			}
			
			cont ++;
		}
		System.out.printf("A menor altura digitada foi: %.2f%n", alturaMenor);
		System.out.printf("A maior altura digitada foi: %.2f", alturaMaior);

	}

}
