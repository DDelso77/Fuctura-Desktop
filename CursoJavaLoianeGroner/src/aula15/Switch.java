package aula15;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// Exibir os dias da semana com if e else if: 
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o dia da semana (1-7):");
		int diadasemana = input.nextInt();
		
		if(diadasemana == 1) {
			System.out.println("Domingo");
		} else if(diadasemana == 2) {
			System.out.println("Segunda");
		}else if(diadasemana == 3) {
			System.out.println("Terça");
		}else if(diadasemana == 4) {
			System.out.println("Quarta");
		}else if(diadasemana == 5) {
			System.out.println("Quinta");
		}else if(diadasemana == 6) {
			System.out.println("Sexta");
		}else if(diadasemana == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Digite um valor valido (1-7):");
		}
		
		//Exibir dia da semana usando o switch case:
				System.out.println("Digite um dia da semana (1-7):");
				int diadasemana02 = input.nextInt();
				switch(diadasemana02) {
				case 1: System.out.println("Domingo"); break;
				case 2: System.out.println("Segunda"); break;
				case 3: System.out.println("Terça"); break;
				case 4: System.out.println("Quarta"); break;
				case 5: System.out.println("Quinta"); break;
				case 6: System.out.println("Sexta"); break;
				case 7: System.out.println("Sábado"); break;
				default: System.out.println("Digite um valor valido entre (1-7).");
				} 
				

	}

}
		

		
