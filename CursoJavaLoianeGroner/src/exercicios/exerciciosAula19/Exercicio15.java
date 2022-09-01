package exercicios.exerciciosAula19;

import java.util.Scanner;

public class Exercicio15 {
	/*15. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que defina o percentual de elementos pares e ímpares,
respectivamente, armazenados neste vetor.*/

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int[] vetorA = new int[10];
	
	for(int i=0;i<vetorA.length;i++) {
		System.out.println("Digite o valor da posição "+i+":");
		vetorA[i]=input.nextInt();
	}
	double quantpar=0;
	for(int i=0;i<vetorA.length;i++) {
		if(vetorA[i]%2==0) {
			quantpar++;
		}
	}
	
	double quantimpar=0;
	for(int i=0;i<vetorA.length;i++) {
		if(vetorA[i]%2!=0) {
			quantimpar++;
		}
	}
	System.out.println();
	System.out.println("A média de elementos par no vetor A é =  "+(quantpar/vetorA.length)*100+" %");
	System.out.println("A média de elementos impar no vetor A é = "+(quantimpar/vetorA.length)*100+" %");

	}

}
