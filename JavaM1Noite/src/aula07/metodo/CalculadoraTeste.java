package aula07.metodo;

public class CalculadoraTeste {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int num1 = 4;
		int num2 = 2;
		calc.somarDoisNumeros();
		calc.subtrairDoisNumeros(num1, num2);
		
		//double resultado = calc.multiplicarDoisNumeros();
		//System.out.println(resultado*5);
		
		double retorno = calc.multiplicarDoisNumeros(num1, num2);
		System.out.println(retorno);
		

	}

}
