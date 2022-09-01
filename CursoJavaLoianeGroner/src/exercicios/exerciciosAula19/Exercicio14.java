package exercicios.exerciciosAula19;

import java.util.Scanner;

public class Exercicio14 {
	/*14. Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a média aritmética simples dos elementos
ímpares armazenados neste vetor.*/

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0;i<vetorA.length;i++) {
			System.out.println("Digite o valor da posição "+i);
			vetorA[i]=input.nextInt();
		}
		System.out.print("Os elementos do vetor A são = ");
		for(int i=0;i<vetorA.length;i++) {
			System.out.print(vetorA[i]+" ");
		}
		
		int impar=0;
		for(int i=0;i<vetorA.length;i++) {
			if(vetorA[i]%2!=0) {
				impar+=vetorA[i];
			}
		}
		System.out.println();
		System.out.println("A soma dos valores dos elementos do vetor A é = "+impar);
		System.out.println("a média aritmética simples dos elementos\r\n"
				+ "ímpares armazenados no vetorA é = "+impar/vetorA.length);
	}

}
