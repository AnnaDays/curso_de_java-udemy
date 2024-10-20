package listas_exercicios_institutofederal;

import java.util.Scanner;

public class MediaAproveitamento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id;
		double nota1, nota2, nota3, media, mediaEx;	
		
		System.out.println("Digite o número de identificação do aluno:");
		id = sc.nextInt();
		
		System.out.println("Digite a 1º nota:");
		nota1 = sc.nextDouble();
		
		System.out.println("Digite a 2º nota:");
		nota2 = sc.nextDouble();
		
		System.out.println("Digite a 3º nota:");
		nota3 = sc.nextDouble();
		
		System.out.println("Digite a média dos exercícios:");
		mediaEx = sc.nextDouble();
		
		media = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaEx)/7;
		
		System.out.println("==========================================");
		System.out.println("           INFORMAÇÕES DO ALUNO           ");
		System.out.println("==========================================");
		System.out.printf("O número de identificação do Aluno é: %d%n", id);
		System.out.printf("Nota 1: %.1f%n", nota1);
		System.out.printf("Nota 2: %.1f%n", nota2);
		System.out.printf("Nota 3: %.1f%n", nota3);
		System.out.printf("Média dos Exercícios: %.2f%n", mediaEx);
		System.out.printf("Média de Aproveitamento: %.2f%n", media);
		
		if(media >= 10) {
			System.out.println("Aluno Aprovado!");
			System.out.println("Conceito: [A]");
			
		} else if(media >= 7 && media < 10) {
			System.out.println("Aluno Aprovado!");
			System.out.println("Conceito: [B]");
			
		} else if(media >= 6 && media < 7) {
			System.out.println("Aluno Aprovado!");
			System.out.println("Conceito: [C]");
			
		} else if(media >= 4 && media < 6) {
			System.out.println("Aluno Reprovado!");
			System.out.println("Conceito: [D]");
			
		} else {
			System.out.println("Aluno Reprovado!");
			System.out.println("Conceito: [E]");
		}
		
		sc.close();
	}

}
