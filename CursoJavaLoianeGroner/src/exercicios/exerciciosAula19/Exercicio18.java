package exercicios.exerciciosAula19;

import java.util.Scanner;

public class Exercicio18 {
	/*18. Ler um vetor A com 10 elementos inteiros correspondentes as idades
de um grupo de pessoas. Escreva um programa que determine e
escreva a menor e a maior idades e suas respectivas posições.*/

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] idades = new int[10];
		
		for(int i=0;i<idades.length;i++) {
			System.out.println("Insira a idade correspondente a posição "+i+":");
			idades[i]=input.nextInt();
		}
		
		int maior = idades[0];
		int indexMaior = 0;
		int menor = idades[0];
		int indexMenor = 0;
		
		for(int i = 1;i<idades.length;i++) {
			if(idades[i]>maior) {
				maior=idades[i];
				indexMaior=i;
			}else if(idades[i]<menor) {
				menor=idades[i];
				indexMenor=i;
			}
		}
		System.out.print("Os elementos do vetor idade são = ");
		for(int i=0;i<idades.length;i++) {
			System.out.print(idades[i]+" ");
		}
		System.out.println();
		System.out.println("Maior idade = "+maior);
		System.out.println("Localizado no index = "+indexMaior);
		System.out.println("Menor idade = "+menor);
		System.out.println("Localizado no index = "+indexMenor);

	}
}
