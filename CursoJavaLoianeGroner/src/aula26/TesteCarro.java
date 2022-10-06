package aula26;

public class TesteCarro {

	public static void main(String[] args) {
		
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
		System.out.println("Autonomia 01: "+ autonomia+" km/l");
		System.out.println("Autonomia 02: "+ fusca.obterAutonomia()+" km/l");
	}
}
