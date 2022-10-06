package aula02;

import java.util.Scanner;

public class UsandoScanner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro:");
		int valor1 = input.nextInt(); // variavel inteira
		System.out.println("Digite um valor do tipo real:");
		float valor2 = input.nextFloat(); // variavel do tipo real (float)
		System.out.println("Digite um valor real com 4 casas decimais:");
		double valor3 = input.nextDouble(); // variavel do tipo real (double)
		System.out.println("Digite seu nome:");
		String nome = input.next(); // variavel com dados literais
		System.out.println("Digite um valor booleano verdadeiro");
		boolean valor4 = input.nextBoolean(); // false ou true
		System.out.println("Digite um valor booleano falso");
		boolean valor5 = input.nextBoolean();
		
		System.out.println("Variavel inteira: "+valor1);
		System.out.println("Variavel real do tipo float: "+valor2);
		System.out.println("Variavel real do tipo double: "+valor3);
		System.out.println("Meu nome é: "+nome);
		System.out.println("Variavel do tipo boolean: "+valor4);
		System.out.println("Variavel do tipo boolean: "+valor5);
		System.out.println(valor2+valor3);
		System.out.println(valor1+valor3);
		System.out.println(valor1*valor3);
		System.out.println(valor1/valor3);
	}

}
