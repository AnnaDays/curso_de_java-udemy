package lista_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalculoGeometrico {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		double a, b, c, areaTriangulo, areaCirculo, 
		areaTrapezio, areaQuadrado, areaRetangulo;
		double pi = 3.14159;
		
		System.out.println("Digite o valor de A:");
		a = sc.nextDouble();
		System.out.println("Digite o valor de B:");
		b = sc.nextDouble();
		System.out.println("Digite o valor de C:");
		c = sc.nextDouble();
		
		sc.close();
		
		areaTriangulo = (a * c) / 2;
		areaCirculo = pi * (Math.pow(c, 2.0));
		areaTrapezio = ((a + b) * c) / 2;
		areaQuadrado = Math.pow(b, 2);
		areaRetangulo = a * b;
		
		Locale.setDefault(Locale.US);
		System.out.printf("A área do triângulo: %.3f%n", areaTriangulo);
		System.out.printf("A área do círculo: %.3f%n", areaCirculo);
		System.out.printf("A área do trapézio: %.3f%n", areaTrapezio);
		System.out.printf("A área do quadrado: %.3f%n", areaQuadrado);
		System.out.printf("A área do retângulo: %.3f%n", areaRetangulo);
	}

}
