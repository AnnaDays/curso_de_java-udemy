package estruturas_de_repeticao;

public class SomaImpares {

	public static void main(String[] args) {
		
		int cont = 1;
		int soma = 0;
		
		while(cont < 500) {
			cont += 1;
		  if(cont % 2 == 1 && cont % 3 == 0) {
			  soma += cont;
			  System.out.println(soma);
		  }
		}
	}

}
