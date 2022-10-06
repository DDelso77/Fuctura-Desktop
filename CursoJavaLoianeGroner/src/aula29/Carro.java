package aula29;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//METODO PARA EXIBIR A AUTONOMIA:
	void exibirAutonomia() {
		System.out.println("Autonomia: "+capCombustivel*consumoCombustivel);
	}
	
	double obterAutonomia() {
		return capCombustivel*consumoCombustivel;
	}
	
	//METODO PARA CALCULAR QUANTIDADE DE COMBUSTIVEL
	double calcularCombustivel(double km){
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
}
