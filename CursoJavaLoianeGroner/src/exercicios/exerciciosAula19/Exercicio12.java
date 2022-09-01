package exercicios.exerciciosAula19;

import java.util.Scanner;

public class Exercicio12 {
	/*12. Criar um vetor A com 10 elementos inteiros. Implementar um programa
	que defina e escreva a soma de todos os elementos armazenados
	neste vetor.*/

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Insira o valor da posição "+i);
			vetorA[i]=input.nextInt();
		}
		int soma=0;
		for(int i=0;i<vetorA.length;i++) {
			soma+=vetorA[i];
		}
		System.out.print("Os elementos do vetor A são: ");
		for(int i=0;i<vetorA.length;i++) {
			System.out.println(vetorA[i]+" ");
		}
		System.out.println("A soma dos elementos do vetor A é: ");
		System.out.println(soma);
		

	}

}
