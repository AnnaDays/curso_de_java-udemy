package estruturas_de_repeticao;

public class Impares {

	public static void main(String[] args) {
		int cont = 100;
		
		while(cont < 200) {
			cont += 1;
			if(cont % 2 == 1) {
				System.out.println(cont);
			}
		}

	}

}
