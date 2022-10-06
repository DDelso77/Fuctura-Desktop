package atividade1;

import java.util.Scanner;

public class Exercicio04 {
/*4) Escreva um programa que Imprima na tela o seu  nome, a soma, a subtração, 
a multiplicação e a divisão de dois valores inteiros.

5)  Declare uma variável para armazenar o salário de uma pessoa e imprima na
tela o valor do salário acrescido de 10%.

6)  Faça um programa que leia dois valores inteiros para as variáveis A e B, 
em seguida efetuar a troca dos valores das variáveis de modo que a variável A 
passe a possuir o valor da variável B, e a variável B passe a possuir o valor 
da variável A. Apresentar os valores trocados.
*/

	public static void main(String[] args) {
		System.out.println(" 4) Escreva um programa que Imprima na tela o seu  nome, a soma, a subtração, \r\n"
				+ "a multiplicação e a divisão de dois valores inteiros.");
		Scanner input = new Scanner(System.in);
		
		String nome;
		int valor1;
		int valor2;
		
		System.out.println();
		System.out.println("Digite seu nome: ");
		nome = input.next();
		System.out.println();
		System.out.println("Digite o primeiro valor: ");
		valor1 = input.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor2 = input.nextInt();
		System.out.println();
		System.out.println("=============== Impressão dos resultados ===============");
		System.out.println("Nome: "+nome);
		System.out.println("------------------------Operações-----------------------");
		System.out.println("Adição        ====>"+valor1+" + "+valor2+" = "+(valor1+valor2));
		System.out.println("Subtração     ====>"+valor1+" - "+valor2+" = "+(valor1-valor2));
		System.out.println("Multiplicação ====>"+valor1+" / "+valor2+" = "+(valor1/valor2));
		System.out.println("Divisão       ====>"+valor1+" * "+valor2+" = "+(valor1*valor2));
		System.out.println("=============================================================");
		System.out.println("     -------------Operação finalizada-------------");
		System.out.println("=============================================================");
		
		
		


	}

}
