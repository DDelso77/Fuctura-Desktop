package atividade1;

import java.util.Scanner;

public class Exercicio05 {
	/*5)  Declare uma variável para armazenar o salário de uma pessoa e imprima na
	tela o valor do salário acrescido de 10%.
	*/
	public static void main(String[] args) {
		System.out.println("5)  Declare uma variável para armazenar o salário de uma pessoa\r\n" 
				+"    e imprima na tela o valor do salário acrescido de 10%.");
		double salario;
		double acrescimo;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Insira o valor do salario: ");
		salario = input.nextDouble();
		System.out.println("Insira o percentual de acrescimo: ");
		acrescimo = input.nextDouble();
		System.out.println("============== Base de calculo ==============");
		System.out.println("O valor do salario é: R$ "+salario);
		System.out.println("O salário será acrescido de "+acrescimo+"%");
		System.out.println("-------------------------------------------");
		System.out.println();
		System.out.println("==============# Demonstrativo #==============");
		System.out.println("Salário bruto:        R$ "+salario);
		System.out.println("Acrescimo de "+acrescimo+" % : "+"R$ "+(salario*(acrescimo/100)));
		System.out.println("Salário liquído:      R$ "+(salario+(salario*(acrescimo/100))));
		System.out.println("=============================================");
		System.out.println("-------------Operação finalizada-------------");
		System.out.println("=============================================");

	}

}
