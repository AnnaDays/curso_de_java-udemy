package lista_de_exercicios;

import java.util.Scanner;

public class HoraJogo {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	int horaInicial, horaFinal, duracaoJogo;
	
	System.out.println("Digite a hora inicial do jogo:");
	horaInicial = sc.nextInt();
	
	System.out.println("Digite a hora final do jogo:");
	horaFinal = sc.nextInt();
	
	if(horaInicial < horaFinal) {
		duracaoJogo = horaFinal - horaInicial;
	} else {
		duracaoJogo = 24 - horaInicial + horaFinal;
	}
	
	System.out.printf("O jogo durou %d hora(s)", duracaoJogo);
	
	sc.close();
	
  }
	

}
	
