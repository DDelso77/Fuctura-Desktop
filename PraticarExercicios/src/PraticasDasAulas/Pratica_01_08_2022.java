package PraticasDasAulas;

import java.util.Scanner;

public class Pratica_01_08_2022 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		String nome = input.next(); // Quando digito "Daniel Cabral" gera um erro.
		
		System.out.println("Digite sua idade:");
		int idade = input.nextInt();
		
		System.out.println("Digite seu estado civil:");
        String estadocivil = input.next();
        
        System.out.println("Sou "+nome+" tenho "+idade+" anos e sou casado." );
        
        	
		

	}

}
