package exercicio_Pratico_Aula02;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário base:");
		double salbase = input.nextDouble();
		
		System.out.println("Digite o valor da gratificação:");
		double gratif = input.nextDouble();
		
		double salbruto = salbase + gratif;
		System.out.println("O valor do salário bruto é: R$ "+salbruto);
		
		if(salbruto < 1000) {
		double ir = salbruto*0.15;
		System.out.println("Imposto de Renda deduzido R$ "+ir);
		double salliq = salbruto-ir;
		System.out.println("Salario liquido a receber R$ "+salliq);
			
		} else {
			double ir = salbruto*0.20;
			System.out.println("Imposto de Renda deduzido R$ "+ir);
			double salliq = salbruto-(salbruto*0.20);
			System.out.println("Salario liquido a receber R$ "+salliq);
			
		}
	}
	
}