package aula25.exercicio01;

import java.util.Scanner;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada produto = new Lampada();
		
		produto.marca = "Philips";
		produto.modelo = "Lâmpada";
		produto.cor = "Branca";
		produto.tipo = "Led";
		produto.voltagem = "Bivolt";
		produto.potencia = 9;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite ligar para ligar a lâmpada e desligar para desligar a lâmpada: ");
		
		String acao = input.next();
		
		if(acao.equals("ligar")) {
			produto.ligar();
		} else if(acao.equals("desligar")) {
			produto.desligar();
		}else {
			System.out.println("Tente novamente!\nValor invalido, digite ligar ou desligar");
		}

	}

}
