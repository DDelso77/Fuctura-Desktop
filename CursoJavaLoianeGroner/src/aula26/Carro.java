package aula26;

public class Carro {
	String marca;
	String modelo;
	int numPassageiro;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("Autonomia: "+capCombustivel*consumoCombustivel+"km/l");
	}
	
	double obterAutonomia() {
		System.out.println("O metodo obterAutonomia foi chamado.");
		return capCombustivel*consumoCombustivel;
	}

}
