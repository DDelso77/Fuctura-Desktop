package atividade1;

import java.util.Scanner;

public class Exercicio03 {
/*3) Crie um algoritmo que lê um valor em dólar e converta o valor para Reais. 
Considere que a cotação do dólar é US$ 1.00 = R$ 5,41.
*/
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double cotacao;
		double dollar;
		System.out.println(" 3) Crie um algoritmo que lê um valor em dólar e converta o valor para Reais. \r\n"
				+ "Considere que a cotação do dólar é US$ 1.00 = R$ 5,41.");
		System.out.println("");
		System.out.println("Digite o valor da cotação do Dollar: ");
		cotacao = input.nextDouble();
		
		System.out.println("Digite o valor do dolar para conversão: ");
		dollar = input.nextDouble();
		
		System.out.println("=========== Conversão Dollar x Real ===========");
		System.out.println();
		System.out.println("Valor da cotação do Dollar             US$ "+cotacao);
		System.out.println("Valor do dolar para conversão em Reais US$ "+dollar);
		System.out.println("-----------------------------------------------");
		System.out.println("Valor da conversão para Reais           R$ "+(dollar*cotacao));
		System.out.println("");
		System.out.println("====================================================");
		System.out.println("====================================================");
	}
}
