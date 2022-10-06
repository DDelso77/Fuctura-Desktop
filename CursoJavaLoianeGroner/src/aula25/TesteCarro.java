package aula25;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.1;
		
		System.out.println("Marca do veículo: "+van.marca);
		System.out.println("Modelo do veículo: "+van.modelo);
		
		van.exibirAutonomia();
				
				

	}

}
