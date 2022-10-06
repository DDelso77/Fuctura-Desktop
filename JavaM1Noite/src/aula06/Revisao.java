package aula06;

public class Revisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tipos primitivos:
		/*short s;
		int n;
		long l;
		float f;
		double d;
		boolean b;
		char c;
		
		//operadores de atribuição:
		int contador = 0;
		contador++;*/
		
		//FOR
		System.out.println("--------FOR----------");
		int[] vetor2 = {1,35,355,68};
		for(int i=0;i< vetor2.length;i++) {
			System.out.println(vetor2[i]);
		}
		
		
		//Forech
		System.out.println("-------FORECH----------");
		int[] vetor3 = {1,35,355,68};
		for(int posicao : vetor3) {
			System.out.println(posicao);
		}
	}

}
