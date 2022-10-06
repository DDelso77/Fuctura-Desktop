package aula27;

import java.util.Scanner;

public class TesteCarro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Carro fusca = new Carro();
		
		fusca.marca = "VolksWagem";
		fusca.modelo = "Fusca";
		fusca.numPassageiro = 5;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;
		
		System.out.println("Marca: "+fusca.marca);
		System.out.println("Modelo: "+fusca.modelo);
		
		fusca.exibirAutonomia();
		
		double autonomia = fusca.obterAutonomia();
		
		System.out.println("A autonomia do veículo é: "+autonomia+" km/l");
		
		System.out.println("Favor informar a distância:");
		
		double kilometros = input.nextDouble();
		
		double qtdCombustivel = fusca.calcularCombustivel(kilometros);
		
		System.out.println("Combustivel necessario: "+qtdCombustivel+" litros");

	}
	

}
