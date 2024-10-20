package listas_exercicios_institutofederal;

import java.util.Scanner;

public class EstadoCivil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome, estadoCivil;
		char sexo;
		
		System.out.println("Digite o seu nome:");
		nome = sc.next();
		
		System.out.println("Digite o seu gênero: [F/M]");
		sexo = sc.next().charAt(0);
		
		System.out.println("Digite o seu estado civil:");
		estadoCivil = sc.next();
		
		if(sexo == 'F' || sexo == 'f' && estadoCivil == "Casada") {
			System.out.println("Está casada há quanto tempo?");
			int tempoCasamento = sc.nextInt();
			System.out.printf("Seu estado civil é %s, e está há %d anos %s", estadoCivil, tempoCasamento, estadoCivil);
			
		} else {
			System.out.printf("Seu nome é %s, e seu estado civil é %s", nome, estadoCivil);
			
		}
		
		sc.close();
	}

}
