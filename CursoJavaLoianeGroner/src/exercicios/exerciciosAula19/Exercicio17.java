package exercicios.exerciciosAula19;

import java.util.Scanner;

public class Exercicio17 {
	/*17. Ler um vetor A com 10 elementos inteiros correspondentes as idades
de um grupo de pessoas. Escreva um programa que determine e
escreva a quantidade de pessoas que possuem idade superior a 35
anos.*/

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int[] vetorA = new int[10];
	
	for(int i=0;i<vetorA.length;i++) {
		System.out.println("Digite a idade na posição "+i+":");
		vetorA[i]=input.nextInt();
	}
	int maior = 0;
	for(int i=0;i<vetorA.length;i++) {
		if(vetorA[i]>35) {
			maior++;
			
		}
	}
	System.out.println("A quantidade de pessoas maior que 35 anos é: "+maior);

	}

}
