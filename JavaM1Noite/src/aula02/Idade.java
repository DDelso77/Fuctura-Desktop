package aula02;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		int idade = input.nextInt();
		
		if(idade <= 13) {
			System.out.println("Você é menor de idade.");
		} else if(idade > 13 && idade < 18) {
			System.out.println("Você é adolescente");
			
		} else if(idade >= 18 && idade <= 60) {
			System.out.println("Você é maior de idade");
		} else {
			System.out.println("Você está na melhor idade.");
		}

	}
 
}
