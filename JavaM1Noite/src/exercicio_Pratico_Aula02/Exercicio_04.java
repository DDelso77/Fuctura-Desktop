package exercicio_Pratico_Aula02;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite as horas trabalhadas:");
		double n = input.nextDouble();
		System.out.println("Digite o valor da hora trabalhada:");
		double valorhoratrabalhada = input.nextDouble();
		System.out.println("Digite o valor da hora excedente:");
		double valorhoraexcedente = input.nextDouble();
		System.out.println("Digite o limite de horas trabalhada:");
		double limiteht = input.nextDouble();
		
		if(n>limiteht) {
			double horanormaltrabalhada = (n - (n-limiteht));
			System.out.println("Foram "+horanormaltrabalhada+" horas normais trabalhadas");
			double salbase = horanormaltrabalhada*valorhoratrabalhada;
			System.out.println("Salário base R$ "+salbase);
			double horasexcedentes = n - limiteht;
			System.out.println("Foram realizadas " + horasexcedentes+" horas excedentes.");
			double receberhe = horasexcedentes*valorhoraexcedente;
			System.out.println("Valor de horas excedentes a receber R$ "+receberhe);
			double saltotal = salbase+receberhe;
			System.out.println("Salário total a receber R$ "+saltotal);
			
		} else {
			double horanormaltrabalhada = limiteht-(limiteht-n);
			System.out.println("Foram "+horanormaltrabalhada+" horas normais trabalhadas");
			System.out.println("Não foram realizadas horas excedentes.");
			double salbase = horanormaltrabalhada*valorhoratrabalhada;
			System.out.println("Salário total a receber R$ "+salbase);
			
		}
		
		

	}

}
