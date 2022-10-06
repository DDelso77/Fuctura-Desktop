package aula02;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno:");
		String nome = input.next();
		System.out.println("Digite a nota 1:");
		double nota1 = input.nextDouble();
		System.out.println("Digite a nota 2:");
		double nota2 = input.nextDouble();
		double media = (nota1 + nota2) / 2;
		 System.out.println(media);
		
		 if(media >= 7 && media <= 10) {
			System.out.println("Aprovado");
			
		} else if (media >= 3 && media <= 6.9) {
		System.out.println("Recuperação");
	} else if(media < 3) {
		System.out.println("Reprovado");
	}

}
}
