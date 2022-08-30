package aula16;

public class LoopsWhileDoWhile {

	public static void main(String[] args) {
		
		// Utilizando o while(enquanto):
		System.out.println("Exibindo os números de 0 a 10:");
		int i = 1;
		int max1 = 10;
		while(i<=max1) {
			System.out.println("O valor de i:"+i);
			i++;
		}
		System.out.println("");
		System.out.println("O valor de i após a condição do while ser falsa é: "+i);
		System.out.println("-------------------------------------------------------");
		System.out.println("");
	
		System.out.println("Exibindo os valores após o while ser falso e o do whilw for menor ou igual 15: ");
		int max2 = 15;
		do {
			i++;
			System.out.println("O valor de i: "+i);
		} while(i<=max2);
		System.out.println("--------------------------------------------------------------------------------");
	}

}
