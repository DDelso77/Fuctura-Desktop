package aula04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o numero maximo de repetição");
		int valor = input.nextInt(); // valor máximo para ser repetido
		System.out.println("Digite o seu nome");
		String nome = input.next();
		
		for(int contador = 1; contador <= valor*2; contador++){
			System.out.println(contador +"- "+nome);
		}
	}

}
