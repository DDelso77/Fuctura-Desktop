package aula27;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiro;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
	System.out.println("Autonomia: "+capCombustivel*consumoCombustivel);
}
	
	double obterAutonomia() {
		System.out.println("O metodo autonomia foi chamado.");
		return capCombustivel*consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
	
}
