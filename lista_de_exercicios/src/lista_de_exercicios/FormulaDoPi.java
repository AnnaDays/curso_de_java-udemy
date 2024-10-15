package lista_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class FormulaDoPi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double area, raio;
		double pi = 3.14159;
		
		System.out.println("Digite o valor do raio:");
		Locale.setDefault(Locale.US);
		raio = sc.nextDouble();
		
		sc.close();
		
		area = pi * (Math.pow(raio, 2.0));
		
		System.out.printf("O valor da área do círculo é: %.4f", area);

	}

}
