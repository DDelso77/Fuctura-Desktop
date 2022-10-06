package aula04;

import java.util.Scanner;

public class Exercicio_Pratico_Aula04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("--- Mercadinho Fuctura ---\n");
		System.out.println("Escolha a lista de compras:"
				+"\n1 - Lista 01"
				+"\n2 - Lista 02"
				+"\n3 - Lista 03");
		System.out.println("                          ");
		System.out.println("Digite a opção para lista desejada:");
		int lista = input.nextInt();
		
		switch(lista){
			case 1: 
				String banana = "Banana";
				String maca = "Maça";
				String melao = "Melão";
				String goiaba = "Goiaba";
				String mamao = "Mamão";
				
				System.out.println("--- Lista 01 ---");
				System.out.println("Digite a quantidade de "+banana+":");
				double quantidadeBanana = input.nextDouble();
				System.out.println("Digite o preço unitário:");
				double precoBanana = input.nextDouble();
				double total1 = (quantidadeBanana * precoBanana);
				System.out.println("--- Mercadinho Fuctura ---\n");
				System.out.println("Quant."+"  Descrição"+"    Valor unit."+" Total");
				System.out.println(quantidadeBanana+"     "+banana+"   "+"      "+precoBanana+"        "+total1);
				
					System.out.println("Digite a quantidade de "+maca+":");
					double quantidadeMaca = input.nextDouble();
					System.out.println("Digite o preço unitário:");
					double precoMaca = input.nextDouble();
					double total2 = (quantidadeMaca * precoMaca);
					System.out.println("--- Mercadinho Fuctura ---\n");
					System.out.println("Quant."+"  Descrição"+"    Valor unit."+" Total");
					System.out.println(quantidadeBanana+"     "+banana+"   "+"    "+precoBanana+"         "+total1);
					System.out.println(quantidadeMaca+"     "+maca+"   "+"      "+precoMaca+"         "+total2);
				
					System.out.println("Digite a quantidade de "+melao+":");
					double quantidadeMelao = input.nextDouble();
					System.out.println("Digite o preço unitário:");
					double precoMelao = input.nextDouble();
					double total3 = (quantidadeMelao * precoMelao);
					System.out.println("--- Mercadinho Fuctura ---\n");
					System.out.println("Quant."+"  Descrição"+"    Valor unit."+" Total");
					System.out.println(quantidadeBanana+"     "+banana+"   "+"    "+precoBanana+"         "+total1);
					System.out.println(quantidadeMaca+"     "+maca+"   "+"      "+precoMaca+"         "+total2);
					System.out.println(quantidadeMelao+"     "+melao+"   "+"      "+precoMelao+"         "+total3);
				
					System.out.println("Digite a quantidade de "+goiaba+":");
					double quantidadeGoiaba = input.nextDouble();
					System.out.println("Digite o preço unitário:");
					double precoGoiaba = input.nextDouble();
					double total4 = (quantidadeGoiaba * precoGoiaba);
					System.out.println("--- Mercadinho Fuctura ---\n");
					System.out.println("Quant."+"  Descrição"+"    Valor unit."+" Total");
					System.out.println(quantidadeBanana+"     "+banana+"   "+"    "+precoBanana+"         "+total1);
					System.out.println(quantidadeMaca+"     "+maca+"   "+"      "+precoMaca+"         "+total2);
					System.out.println(quantidadeMelao+"     "+melao+"   "+"      "+precoMelao+"         "+total3);
					System.out.println(quantidadeGoiaba+"     "+goiaba+"   "+"      "+precoGoiaba+"         "+total4);
				
					System.out.println("Digite a quantidade de "+mamao+":");
					double quantidadeMamao = input.nextDouble();
					System.out.println("Digite o preço unitário:");
					double precoMamao = input.nextDouble();
					double total5 = (quantidadeMamao * precoMamao);
					System.out.println("--- Mercadinho Fuctura ---\n");
					System.out.println("Quant."+"  Descrição"+"    Valor unit."+" Total");
					System.out.println(quantidadeBanana+"     "+banana+"   "+"    "+precoBanana+"         "+total1);
					System.out.println(quantidadeMaca+"     "+maca+"   "+"      "+precoMaca+"         "+total2);
					System.out.println(quantidadeMelao+"     "+melao+"   "+"     "+precoMelao+"         "+total3);
					System.out.println(quantidadeGoiaba+"     "+goiaba+"   "+"    "+precoGoiaba+"         "+total4);
					System.out.println(quantidadeMamao+"     "+mamao+"   "+"     "+precoMamao+"         "+total5);
				double totalCompra1 = total1 + total2 + total3 + total4 + total5;
				System.out.println("Valor total da compra ------- R$ "+totalCompra1);
				System.out.println("Operaçao encerrada!");
				
				break;
			case 2:
				String cadeira = "Cadeira";
				String mesa = "Mesa";
				String rolpao = "Rolpão";
				String oculos = "Óculos";
				
				System.out.println("--- Lista 01 ---");
				System.out.println("Digite a quantidade de "+cadeira+":");
				double quantidadeCadeira = input.nextDouble();
				System.out.println("Digite o preço unitário:");
				double precoCadeira = input.nextDouble();
				double total6 = (quantidadeCadeira * precoCadeira);
				System.out.println("--- Mercadinho Fuctura ---\n");
				System.out.println("Quant."+"  Descrição"+"    Valor unit."+" Total");
				System.out.println(quantidadeCadeira+"     "+cadeira+"   "+"      "+precoCadeira+"        "+total6);
				
				System.out.println("Digite a quantidade de "+mesa+":");
				double quantidadeMesa = input.nextDouble();
				System.out.println("Digite o preço unitário:");
				double precoMesa = input.nextDouble();
				double total7 = (quantidadeMesa * precoMesa);
				System.out.println("--- Mercadinho Fuctura ---\n");
				System.out.println("Quant."+"  Descrição"+"    Valor unit."+" Total");
				System.out.println(quantidadeCadeira+"     "+cadeira+"   "+"    "+precoCadeira+"         "+total6);
				System.out.println(quantidadeMesa+"     "+mesa+"   "+"      "+precoMesa+"         "+total7);
				
				System.out.println("Digite a quantidade de "+rolpao+":");
				double quantidadeRolpao = input.nextDouble();
				System.out.println("Digite o preço unitário:");
				double precoRolpao = input.nextDouble();
				double total8 = (quantidadeRolpao * precoRolpao);
				System.out.println("--- Mercadinho Fuctura ---\n");
				System.out.println("Quant."+"  Descrição"+"    Valor unit."+" Total");
				System.out.println(quantidadeCadeira+"     "+cadeira+"   "+"    "+precoCadeira+"         "+total6);
				System.out.println(quantidadeMesa+"     "+mesa+"   "+"      "+precoMesa+"         "+total7);
				System.out.println(quantidadeRolpao+"     "+rolpao+"   "+"      "+precoRolpao+"         "+total8);
				
				System.out.println("Digite a quantidade de "+oculos+":");
				double quantidadeOculos = input.nextDouble();
				System.out.println("Digite o preço unitário:");
				double precoOculos = input.nextDouble();
				double total9 = (quantidadeOculos * precoOculos);
				System.out.println("--- Mercadinho Fuctura ---\n");
				System.out.println("Quant."+"  Descrição"+"    Valor unit."+" Total");
				System.out.println(quantidadeCadeira+"     "+cadeira+"   "+"    "+precoCadeira+"         "+total6);
				System.out.println(quantidadeMesa+"     "+mesa+"   "+"      "+precoMesa+"         "+total7);
				System.out.println(quantidadeRolpao+"     "+rolpao+"   "+"      "+precoRolpao+"         "+total8);
				System.out.println(quantidadeOculos+"     "+oculos+"   "+"      "+precoOculos+"         "+total9);
				double totalCompra2 = total6 + total7 + total8 + total9;
				System.out.println("Valor total da compra ------- R$ "+totalCompra2);
				System.out.println("Operaçao encerrada!");
				break;
			case 3:
				String tinta = "Tinta";
				String pincel = "Pincel";
				String balde = "Balde plastico";
				String escada = "Escada";
				String martelo = "Martelo";
				
				System.out.println("--- Lista 01 ---");
				System.out.println("Digite a quantidade de "+tinta+":");
				double quantidadeTinta = input.nextDouble();
				System.out.println("Digite o preço unitário:");
				double precoTinta = input.nextDouble();
				double total10 = (quantidadeTinta * precoTinta);
				System.out.println("--- Mercadinho Fuctura ---\n");
				System.out.println("Quant."+"  Descrição"+"    Valor unit."+" Total");
				System.out.println(quantidadeTinta+"     "+tinta+"   "+"      "+precoTinta+"        "+total10);
				
					System.out.println("Digite a quantidade de "+pincel+":");
					double quantidadePincel = input.nextDouble();
					System.out.println("Digite o preço unitário:");
					double precoPincel = input.nextDouble();
					double total11 = (quantidadePincel * precoPincel);
					System.out.println("--- Mercadinho Fuctura ---\n");
					System.out.println("Quant."+"  Descrição"+"    Valor unit."+" Total");
					System.out.println(quantidadePincel+"     "+tinta+"   "+"    "+precoTinta+"         "+total10);
					System.out.println(quantidadePincel+"     "+pincel+"   "+"      "+precoPincel+"         "+total11);
				
					System.out.println("Digite a quantidade de "+balde+":");
					double quantidadeBalde = input.nextDouble();
					System.out.println("Digite o preço unitário:");
					double precoBalde = input.nextDouble();
					double total12 = (quantidadeBalde * precoBalde);
					System.out.println("--- Mercadinho Fuctura ---\n");
					System.out.println("Quant."+"  Descrição"+"    Valor unit."+" Total");
					System.out.println(quantidadeTinta+"     "+tinta+"   "+"    "+precoTinta+"         "+total10);
					System.out.println(quantidadePincel+"     "+pincel+"   "+"      "+precoPincel+"         "+total11);
					System.out.println(quantidadeBalde+"     "+balde+"   "+"      "+precoBalde+"         "+total12);
				
					System.out.println("Digite a quantidade de "+escada+":");
					double quantidadeEscada = input.nextDouble();
					System.out.println("Digite o preço unitário:");
					double precoEscada = input.nextDouble();
					double total13 = (quantidadeEscada * precoEscada);
					System.out.println("--- Mercadinho Fuctura ---\n");
					System.out.println("Quant."+"  Descrição"+"    Valor unit."+" Total");
					System.out.println(quantidadeTinta+"     "+tinta+"   "+"    "+precoTinta+"         "+total10);
					System.out.println(quantidadePincel+"     "+pincel+"   "+"      "+precoPincel+"         "+total11);
					System.out.println(quantidadeBalde+"     "+balde+"   "+"      "+precoBalde+"         "+total12);
					System.out.println(quantidadeEscada+"     "+escada+"   "+"      "+precoEscada+"         "+total13);
				
					System.out.println("Digite a quantidade de "+martelo+":");
					double quantidadeMartelo = input.nextDouble();
					System.out.println("Digite o preço unitário:");
					double precoMartelo = input.nextDouble();
					double total14 = (quantidadeMartelo * precoMartelo);
					System.out.println("--- Mercadinho Fuctura ---\n");
					System.out.println("Quant."+"  Descrição"+"    Valor unit."+" Total");
					System.out.println(quantidadeTinta+"     "+tinta+"   "+"    "+precoTinta+"         "+total10);
					System.out.println(quantidadePincel+"     "+pincel+"   "+"      "+precoPincel+"         "+total11);
					System.out.println(quantidadeBalde+"     "+balde+"   "+"      "+precoBalde+"         "+total12);
					System.out.println(quantidadeEscada+"     "+escada+"   "+"      "+precoEscada+"         "+total13);
					System.out.println(quantidadeMartelo+"     "+martelo+"   "+"     "+precoMartelo+"         "+total14);
				double totalCompra3 = total10 + total11 + total12 + total13 + total14;
				System.out.println("Valor total da compra ------- R$ "+totalCompra3);
				System.out.println("Operaçao encerrada!");
				break;
				
				
		}
		
	}

}
