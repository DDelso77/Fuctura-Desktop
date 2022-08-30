package exercicios.exerciciosAula19;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*3. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o quadrado do respectivo elemento de A, ou seja:
B[i] = A[i] * A[I].*/
		
		Scanner input = new Scanner(System.in);
		
		int vetorA[] = new int[15];
		int vetorB[] = new int[vetorA.length];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Digite o valor da posição "+i);
			vetorA[i] = input.nextInt();
			vetorB[i] = vetorA[i]*vetorA[i];
		}
		System.out.println();
		System.out.print("Os elementos do vetor A = ");
		for(int i = 0; i<vetorA.length;i++) {
			System.out.print(vetorA[i]+" ");
		}
		System.out.println();
		System.out.print("Os elementos do vetor B = ");
		for(int i=0;i<vetorB.length;i++) {
			System.out.print(vetorB[i]+" ");
		}
		
	}

}
