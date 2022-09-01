package exercicios.exerciciosAula19;

import java.util.Scanner;

public class Exercicio13 {
	/*13. Criar um vetor A com 10 elementos inteiros. Implementar um programa
que determine a soma dos elementos armazenados neste vetor que
são múltiplos de 5.*/

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] vetorA = new int[10];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Insira o valor da posição "+i);
			vetorA[i]=input.nextInt();
		}
		int multiplos=0;
		for(int i=0;i<vetorA.length;i++) {
			if(vetorA[i]%5==0) {
				multiplos+=vetorA[i];
			}
		}
			System.out.print("Os elementos do vetor A são = ");
			for(int i=0;i<vetorA.length;i++) {
				System.out.print(vetorA[i]+" ");
			}
			System.out.println();
			System.out.println("A soma dos multiplus de 5 do vetor A é = "+multiplos);
		}
		

	}


