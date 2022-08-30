package exercicios.exerciciosAula19;

import java.util.Scanner;

public class Exercicio10 {
	/*10.Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
seja: B[i] := A[i] % 2.*/

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Digite o valor da posição "+i+":");
			vetorA[i]=input.nextInt();
			vetorB[i]=vetorA[i]%2;
		}
		System.out.println("//////////////////////////////////////////");
		
		System.out.print("Os elementos do vetor A são = ");
		for(int i=0;i<vetorA.length;i++) {
			System.out.print(vetorA[i]+" ");
		}
		System.out.println();
		
		System.out.print("Os elementos do vetor B são = ");
		for(int i=0;i<vetorB.length;i++) {
			System.out.print(vetorB[i]+" ");
		}

	}

}
