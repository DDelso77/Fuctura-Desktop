package aula25;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("Autonomia do veículo: "+capCombustivel*consumoCombustivel+" km/l");
	}
}
