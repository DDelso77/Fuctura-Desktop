package exercicio_Pratico_Aula02;

import java.util.Scanner;

public class Exercicio_01_01 {

	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 double primeiranota, segundanota, media = 0;
	 
	 System.out.println("Digite a primeira nota:");
		primeiranota = input.nextDouble();
		
	System.out.println("Digite a segunda nota:");
	   segundanota = input.nextDouble();
	   
	media = (primeiranota + segundanota)/2;
	
	System.out.println("Média do aluno: "+media);
		

	}

}
