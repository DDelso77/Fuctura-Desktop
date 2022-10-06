package atividade1;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
	//1) Crie um algoritmo que imprima na tela o seu nome 
	//e em outra linha o seu sobrenome.
		System.out.println("   1) Crie um algoritmo que imprima na tela o seu nome e em outra linha o seu sobrenome.");
		System.out.println();
		String nome;
		String sobrenome;
		System.out.println("Digite seu nome:");
		Scanner input = new Scanner(System.in);
		nome = input.next();
		System.out.println("Digite seu sobrenome: ");
		sobrenome = input.next();
		System.out.println("Meu nome é: "+nome);
		System.out.println("Meu sobrenome é: "+sobrenome);
		
//---------------------------## ou ##--------------------------------
		
		System.out.println("==========================================");
		System.out.println();
		String nome1 = "Daniel";
		String sobrenome2 = "Cabral";
		
		System.out.println("Meu nome é: "+nome1);
		System.out.println("Meu sobrenome é: "+sobrenome2);
		System.out.println();
		System.out.println("======## Exercicio 01 finalizado ##======");
	}
}
