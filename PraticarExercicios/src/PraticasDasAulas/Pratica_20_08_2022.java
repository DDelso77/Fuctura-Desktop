package PraticasDasAulas;

import java.util.Iterator;

public class Pratica_20_08_2022 {

	public static void main(String[] args) {
		String [] carros = {"Ferrari", "Fusca","Camaro", "Uno"};
		// Exibe o tamanho a Arry(vetor).
		System.out.println("Tamanho do Array: "+carros.length); 
		// Exibe um item especifico de acordo com o indice especificado, no caso o indice zero [0].
		System.out.println("Tipo de carro: "+carros [0]); 
		// Alterar o intem de acordo com o indice especificado, no caso o indice zero [0].
		carros[0] = "Porsch";
		System.out.println("Tipo de carro: "+carros [0]);
       // Imprimir todos os itens
		System.out.println("Todos os itens do vetor(Array) são:");
		for(int i=0;i<carros.length;i++) {
			System.out.println(carros[i]);
		}
		
	}

}
