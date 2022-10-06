package atividade1;

import java.util.Scanner;

public class Exercicio02 {
//2) Crie um algoritmo que leia um número inteiro 
//e mostre na tela o seu sucessor e seu antecessor.

	public static void main(String[] args) {
		System.out.println("  2) Crie um algoritmo que leia um número inteiro"
				+ " e mostre na tela o seu sucessor e seu antecessor.");
		System.out.println();
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Digite um numero inteiro:");
		num = input.nextInt();
		System.out.println("==========================================");
		System.out.println();
		System.out.println("O numero inteiro é: "+num);
		System.out.println("O número sucessor é: "+(num+1));
		System.out.println("O número antecessor é: "+(num-1));
		System.out.println();
		System.out.println("======## Exercicio 01 finalizado ##======");
	}
}
