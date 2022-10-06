package aula_Sabado_13_08_22;

import java.util.Scanner;

class Media_Aluno {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome do aluno:");
		String nome = entrada.next();
		System.out.println("Digite a primeira nota:");
		double nota1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota:");
		Double nota2 = entrada.nextDouble();
		
	 double media = (nota1 + nota2)/2;
	 System.out.println("A média aritimetica é: %2f\n"+ media);
		
	if(media >= 0.0 && media <=10) {
		System.out.println(nome + ", você está aprovado!");
	}	else if(media >=3 && media <= 6.9) {
		System.out.println(nome + ", você está em recuperação, estude!");
	} else {
		System.out.println(nome + ", você está reprovado!");
	}
		

	}

}
