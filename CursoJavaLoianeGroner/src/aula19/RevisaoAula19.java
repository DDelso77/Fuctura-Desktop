package aula19;

public class RevisaoAula19 {

	public static void main(String[] args) {
		// REVISÃO AULA 19 VETORES(ARRAYS):

		// Declarando um Vetor(Array):
		int[] vetor = new int[4];
		vetor[0] = 1;
		vetor[1] = 2;
		vetor[2] = 3;
		vetor[3] = 4;

		// Exibir um elemento de acordo com sua posição(indice):
		System.out.println("---------------------------------- 01 ----------------------------------");
		System.out.println("Exibir um elemento de acordo com sua posição(indice):");
		System.out.println("");
		System.out.println("Na posição de indice " + (vetor[0] - 1) + " temos o elemento " + vetor[0] + ".");
		System.out.println("Na posição de indice " + (vetor[1] - 1) + " temos o elemento " + vetor[1] + ".");
		System.out.println("Na posição de indice " + (vetor[2] - 1) + " temos o elemento " + vetor[2] + ".");
		System.out.println("Na posição de indice " + (vetor[3] - 1) + " temos o elemento " + vetor[3] + ".");
		System.out.println("---------------------------------- 02 ----------------------------------");
		// Exibir os elementos do vetor(Array):
		System.out.println("Exibir os elementos do vetor(Array):");
		System.out.println("");
		System.out.println(
				"Os elementos do vetor são: {" + vetor[0] + ", " + vetor[1] + ", " + vetor[2] + ", " + vetor[3] + "}");
		System.out.println("---------------------------------- 03 ----------------------------------");
		// Exibir o tamanho do vetor:
		System.out.println("Exibir o tamanho do vetor:");
		System.out.println("");
		System.out.println("O vetor tem: " + vetor.length + " elementos.");
		System.out.println("---------------------------------- 04 ----------------------------------");

		// Exibindo vetor usando o FOR:
		System.out.println("Exibindo os vetores e suas posições utilizando o FOR:");
		System.out.println("");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Na posição de indice " + (vetor[i] - 1) + " temos o elemento " + vetor[i]);
		}
		//Exibir vetor utilizando o FOR melhorado:
		System.out.println("---------------------------------- 05 ----------------------------------");
		System.out.println("Exibir vetor utilizando o FOR melhorado:");
		System.out.println("");
		for(int exib: vetor) {
			System.out.println(exib);
			}
	}

}
