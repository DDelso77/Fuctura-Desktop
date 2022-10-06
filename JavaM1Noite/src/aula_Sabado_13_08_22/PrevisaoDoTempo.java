package aula_Sabado_13_08_22;

import java.util.Scanner;

public class PrevisaoDoTempo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("por favor digite:"
				+"\n1 - Domingo"
				+"\n2 - Segunda-feira"
				+"\n3 - Terça-feira"
				+"\n4 - Quarta-feira"
				+"\n5 - Quinta-feira"
				+"\n6 - Sexta-feira"
				+"\n7 - Sábado");
			int dia = input.nextInt();

			switch(dia) {
			case 1:
				System.out.println("Hoje é Domingo" + "sol - nublado - chuvoso");
							
				break;
			case 2:
				System.out.println("Hoje é Segunda-feira");
			case 3:
				System.out.println("Hoje é Terça-feira");
				break;
			case 4:
				System.out.println("Hoje é Quarta-feira");
				break;
			case 5:
				System.out.println("Hoje é Quinta-feira");
				break;
			case 6:
				System.out.println("Hoje é Sexta-feira");
			case 7:
				System.out.println("Hoje é Sábado");
				break;
			default:
				System.out.println("Valor invalido!");
				break;
			}
			}

		}
