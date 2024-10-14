

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		String x;
		int y;
		double z;
		char w;
		
		x = sc.next(); //inserir uma string
		y = sc.nextInt(); //inserir um int
		z = sc.nextDouble(); //inserir um double
		w = sc.next().charAt(0); //inserir um caractere
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);
		
		sc.close();v 

	}

}
