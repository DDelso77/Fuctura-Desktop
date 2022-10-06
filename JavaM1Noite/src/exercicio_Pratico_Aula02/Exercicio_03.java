package exercicio_Pratico_Aula02;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor cobrado por quilo exedente:");
		double valorpesoexedente = input.nextDouble();
		
		System.out.println("Digite o peso máxixo:");
		double pesomaximo = input.nextDouble();
		
		System.out.println("Digite o peso pescado:");
		double pesopescado = input.nextDouble();
		
		
		
		double e = (pesopescado) - (pesomaximo);
		double m = e*valorpesoexedente;

		if(pesomaximo < pesopescado) {
			System.out.println("O peso excedido é de "+e+"Kg");
			System.out.println("Valor da multa a ser paga é de R$ "+m);
		} else {
			System.out.println("Peso excedido é 0.0Kg");
			System.out.println(e+"kg abaixo do limite de peso,isento de multa.");
 		    System.out.println("Valor da multa a ser paga é de R$ 0.00");
			
		}
		

	}

}
