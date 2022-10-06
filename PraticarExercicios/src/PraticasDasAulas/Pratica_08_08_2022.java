package PraticasDasAulas;

import java.util.Scanner;

public class Pratica_08_08_2022 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char valor2;
		double valor1 , valor3;
		
		System.out.println("Digite o valor desejado:");
		valor1 = input.nextDouble();
		System.out.println("Digite a operação desejada:");
		valor2 = input.next().charAt(0);
		System.out.println("Digite outro valor:");
		valor3 = input.nextDouble();
		
		if(valor2 == '+') {
			double resultado1 = valor1 + valor3;
			System.out.println("Total é " + resultado1);
		} else if(valor2 == '-'){
			double resultado2 = valor1 - valor3;
			System.out.println("Total é "+ resultado2);
		} else if(valor2 == '*') {
			double resultado3 = valor1 * valor3;
			System.out.println("Total é "+ resultado3);
		} else if(valor2 == '/') {
			double resultado4 = valor1/valor3;
			System.out.println("Total é "+ resultado4);
		} else {
			System.out.println("Valor invalido!");
		}
		
		
	}

}
