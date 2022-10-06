package aula02;
import java.util.Scanner;

public class Aula_09_08_2022 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		int idade = input.nextInt();
		
		if(idade >=18) {
			System.out.println("Você é maior de idade!");
		} else if (idade >=14 && idade <=17) {
			System.out.println("Você é um adolescente!");
		} else {
			System.out.println("Você é uma criança!");
		}
		
		

}
	
}
