package aula1;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		System.out.println("Olá Mundo!");
		System.out.println("Hello World!");
		System.out.println(10+5);
		System.out.println("10+5");
		System.out.println("Olá \nMundo!");
				
		//VARIAVEIS:
		
		String nome = "Daniel";
		nome = "Cabral"; // Alterando o valor armazenado na variavel.
		int idade = 45;
		idade = 46;// Alterando o valor armazenado na variavel.
		
		float peso = 1.68f;
		double altura = 1.70;
		char letra = 'D'; // Utiliza-se aspas simples para indicar 
		                  // um caracter
		boolean num = true; // utilizado para indicar uma condição 
		                    // falsa ou verdadeira
		
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(peso);
		System.out.println(altura);
		System.out.println(letra);
		System.out.println(num);
		
		// EXEMPLOS:
		
		int n1 = 5;
		int n2 = 60;
		
		System.out.println(n1+n2);
		
		//Concatenação:
		
		System.out.println("Nome: "+nome+ "\nIdade: "+idade+"\nPeso: "+peso+"\nAltura:"+altura+
				"\nLetra: "+letra+"\nStatus: "+num);
		
		//Operadores aritimeticos:
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		System.out.println(n1 % n2);// Exibe o resto da divisão.
		                            // Pode ser utilizado para verificar
		                            // se o numero é par ou impar.
		                            // Se o resto for igual a 0 o numero será par.
		
		
		
		
		
		
	}
}
