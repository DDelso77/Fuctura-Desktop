package aula04;

public class EstruturaDoWhile {

	public static void main(String[] args) {
		
		int contador = 1; // contador / inicialização
		
		do{
			System.out.println(contador); // corpo
			contador += 1; // iteração
			if(contador > 5) {
				System.out.println("Contador já é mior do que 5.");
			}
			
		} while(contador <= 5); // condição de parada
			
		

	}

}
