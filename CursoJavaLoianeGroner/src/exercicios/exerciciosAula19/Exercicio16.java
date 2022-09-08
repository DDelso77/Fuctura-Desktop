package exercicios.exerciciosAula19;

import java.util.Scanner;

public class Exercicio16 {
	/*16. Criar um vetor A com 10 elementos inteiros. Escrever um programa
que calcule e escreva: a) a soma de elementos armazenados neste
vetor que são inferiores a 15; b) a quantidade de elementos
armazenados no vetor que são iguais a 15; e c) a média dos
elementos armazenados no vetor que são superiores a 15.*/

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Insira o valor na posição "+i+":");
			vetorA[i]=input.nextInt();
		}
		int menor = 0;
		for(int i=0;i<vetorA.length;i++) {
			if(vetorA[i]<15) {
				menor += vetorA[i];
			}
		}
		System.out.println("A soma dos valores inferior a 15 é = "+menor);
		
		int igual =0;
		for(int i=0;i<vetorA.length;i++) {
			if(vetorA[i] == 15) {
				igual += vetorA[i];
			}
		}
		System.out.println("A soma dos valores igual a 15 é = "+igual);
		
		int maior = 0;
		int media = 0;
		for(int i=0;i<vetorA.length;i++) {
			if(vetorA[i]>15) {
				maior += vetorA[i];
				media=vetorA[i]++;
				
			}
		}
		System.out.println("A média dos valores maior que 15 é = "+media);

	}

}
