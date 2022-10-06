package atividade1;

import java.util.Scanner;

public class Exercicio06 {
/*6)  Faça um programa que leia dois valores inteiros para as variáveis A e B, 
	em seguida efetuar a troca dos valores das variáveis de modo que a variável A 
	passe a possuir o valor da variável B, e a variável B passe a possuir o valor 
	da variável A. Apresentar os valores trocados.
	*/
	public static void main(String[] args) {
		System.out.println("6)  Faça um programa que leia dois valores inteiros para as variáveis A e B, \r\n"
				+ "	em seguida efetuar a troca dos valores das variáveis de modo que a variável A \r\n"
				+ "	passe a possuir o valor da variável B, e a variável B passe a possuir o valor \r\n"
				+ "	da variável A. Apresentar os valores trocados.");
		Scanner input = new Scanner(System.in);
		
		double a;
		double b;
		
		System.out.println();
		System.out.println("Digite o valor da variavel A: ");
		a = input.nextDouble();
		System.out.println("Digite o valor da variavel B: ");
		b = input.nextDouble();
		
		System.out.println("===========Variaveis===========");
		System.out.println("O valor da variavel A é: "+a);
		System.out.println("O valor da variavel B é: "+b);
		System.out.println("-------------------------------");
		System.out.println();
		System.out.println("======Inversão de valores======");
		System.out.println("O valor da variavel A é: "+b);
		System.out.println("O valor da variavel B é: "+a);
		System.out.println("===============================");
		System.out.println("------Operação finalizada------");
		System.out.println("===============================");
	}

}
