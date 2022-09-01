package exercicios.exerciciosAula19;

import java.util.Scanner;

public class Exercicio11 {
	/*11. Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a quantidade de elementos armazenados neste
vetor que são pares.*/

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Digite o valor da posição "+i+" do vetor A:");
			vetorA[i] = input.nextInt();
		}
		
		int qtdpares = 0;
		for(int i =0;i<vetorA.length;i++) {
			if(vetorA[i]%2==0) {
				qtdpares++;
			}
		}
		
		System.out.println("///////////////////////////////////////////////////");
		System.out.print("Os valores do vetor A são: ");
		for(int i = 0;i<vetorA.length;i++) {
			System.out.print(vetorA[i]+" ");
		}
		System.out.println("///////////////////////////////////////////////////");
		System.out.print("A quantidade de valores par no vetor A são: "+qtdpares);
		
		}
		

	}


