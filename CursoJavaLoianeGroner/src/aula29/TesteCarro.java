package aula29;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros= 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.15;
		
		System.out.println("Marca: "+van.marca);
		System.out.println("Modelo: "+van.modelo);
		
		van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do veiculo é de: "+autonomia+" km/l");
		
		System.out.println("Combustivel: "+van.calcularCombustivel(30)+" litros");
	}

}
