package aula_Sabado_13_08_22;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número de 1 a 4");
		int condicao = input.nextInt();
		
		switch(condicao) {
		case 1:
			System.out.println("Acessou o primeiro bloco");
			break;
		case 2:
			System.out.println("Acessou o segundo bloco");
			break;
		case 3:
			System.out.println("Acessou o terceiro bloco");
			break;
		case 4:
			System.out.println("Acessou o quarto bloco");
			break;
		default:
			System.out.println("Você digitou um número diferente de 1 a 4");
			break;
		}

	}

}
