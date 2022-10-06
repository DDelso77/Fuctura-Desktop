package aula06;

import java.util.Scanner;

public class CachorroTeste {

	public static void main(String[] args) {
		Cachorro bob = new Cachorro();
		Cachorro tob = new Cachorro();
		
		
		bob.nome = "Caramelo";
		bob.cor = "caramelo";
		bob.idade = 19;
		bob.peso = 1.5f;
		
		tob.nome = "Pretinho"; 
		tob.cor = "Preto";
		tob.idade = 7;
		
		System.out.println("");
		System.out.println("-------------------------Bob------------------------");
		System.out.println("Nome:"+bob.nome+"\nCor:"+bob.cor+"\nIdade:"+bob.idade);
		System.out.println("");
		System.out.println("-------------------------Tob------------------------");
		System.out.println("Nome:"+tob.nome+"\nCor:"+tob.cor+"\nIdade:"+tob.idade);
		

	}

}
