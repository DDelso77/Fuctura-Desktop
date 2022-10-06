package aula_Sabado_13_08_22;

import java.util.Scanner;

public class BancoFuctura {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	System.out.println("Digite o seu nome:");
	String nome = input.next();
	System.out.println("Digite o numero da conta:");
	String conta = input.next();
	System.out.println("Faça um depósito para criar a conta:");
	double saldo = input.nextDouble();
	System.out.println("Digite sua senha de 4 digitos:");
	int senha = input.nextInt();
	
	System.out.println("Por favor digite:"
			+"\n1 - Consultar conta"
			+"\n2 - Fazer depósito"
			+"\n3 - Consultar saque"
			+"\n4 - Finalizar");
	
	int opcao = input.nextInt();
	
	switch(opcao) {
	case 1:
		System.out.println("------BANCO FUCTURA-----");
		System.out.println("Dados do cliente: \nNome: "
				+ nome + "\nNúmero da conta: " + conta );
		System.out.printf("Saldo R$ %.2f", saldo);
		System.out.println("\n-----------------------");
		break;
	case 2:
		System.out.println("Por favor digite sua senha:");
		int senha2 = input.nextInt();
		if(senha == senha2) {
		System.out.println("Digite o quanto você quer depositar");
		double valorD = input.nextDouble();
		saldo += valorD;
		System.out.printf("Seu novo saldo é: %.2f", saldo);
		} else {
			System.out.println("Senha incorreta!");
		}
		break;
	case 3:
		System.out.println("Digite o valor do saque");
		double valorS = input.nextDouble();
		saldo -= valorS;
		System.out.printf("Seu novo saldo é: %.2f", saldo);
		break;
	case 4:
		System.out.println("Finalizar");
		break;
	}
	

	}

}
