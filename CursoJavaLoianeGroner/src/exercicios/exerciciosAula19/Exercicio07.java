package exercicios.exerciciosAula19;

import java.util.Scanner;

public class Exercicio07 {
	/*7. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a subtração dos respectivos
elementos em A e B, ou seja:
C[i] = A[i] – B[i].*/

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[vetorA.length];
		int vetorC[] = new int[vetorA.length]; 
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Digite o valor da posição "+i+" do vetor A: ");
			vetorA[i] = input.nextInt();
			
		}
		for(int i=0;i<vetorB.length;i++) {
			System.out.println("Digite o valor da posição "+i+" do vetor B:");
			vetorB[i]=input.nextInt();
		}
		for(int i = 0;i<vetorC.length;i++) {
			vetorC[i] = vetorA[i]-vetorB[i];
		}
		
		System.out.print("Os elementos do vetor A são = ");
		for(int i=0;i<vetorA.length;i++) {
			System.out.print(vetorA[i]+" ");
		}
		System.out.println();
		
		System.out.print("Os elementos do vetor B são = ");
		for(int i=0;i<vetorB.length;i++) {
			System.out.print(vetorB[i]+" ");
		}
		System.out.println();
		
		System.out.print("Os elementos do vetor C são = ");
		for(int i=0;i<vetorC.length;i++) {
			System.out.print(vetorC[i]+" ");
		}
		System.out.println();

	}

}
