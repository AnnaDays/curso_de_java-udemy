package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		double x = 10.35784;
		int y = 32;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade, renda);
		
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f METROS%n", x);
		
		System.out.println("Olá Mundo!!");
		System.out.println("Bom dia!!");
	}

}
