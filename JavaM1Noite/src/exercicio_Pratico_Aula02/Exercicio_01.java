package exercicio_Pratico_Aula02;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite a primeira nota:");
		double primeiranota = input.nextDouble();
		System.out.println("Digite a segunda nota:");
		double segundanota = input.nextDouble();

		double media = (primeiranota + segundanota)/2;
		System.out.println(media);

		if(media <= 4.0) {
			System.out.println("Reprovado");
		} else if (media <=6.0 && media > 4.0) {
			System.out.println("Recuperação");
		} else if (media > 6.0 && media <= 8.0) {
			System.out.println("Aprovado");
		} else if(media <=10.0 && media > 8.0) {
			System.out.println("Destaque");
		} else {
			System.out.println("Valor invalido! Erro no lançamento das notas.");
		}


	}

}
