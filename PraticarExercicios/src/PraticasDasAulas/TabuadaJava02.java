package PraticasDasAulas;

import java.util.Scanner;

public class TabuadaJava02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean stop = true;
		do {
			System.out.println("------------------------------------------");
			System.out.println("Digite a opção deseja:"
					+"\n1-Escolher uma tabuada entre 0 e 10."
					+"\n2-Exibir todas as tabuadas entre 0 e 10."
					+"\n3-Finalizar operação");
			
			int operacao = input.nextInt();
		switch (operacao){
			case 1:
				System.out.println("Digite o valor entre 0 e 10 para selecionar a tabuada desejada:");
				int [] vetor = {0,1,2,3,4,5,6,7,8,9,10};
				int n = input.nextInt();
				System.out.println("------------------------------------------");
				if(n<vetor.length) {
				for(int i=0;i<vetor.length;i++) {
				System.out.println(vetor[i]+" x "+vetor[n]+" ="+vetor[i]*vetor[n]);
				} 
					} else {
						System.out.println("Valor invalido, digite um valor entre 0 e 10.");
			}
				break;
			case 2:
				System.out.println("-----------Tabuadas de 0 a 10-----------");
				for(int k =0;k<=10;k++) {
					System.out.println("");
					for(int l=0;l<=10;l++) {
						System.out.println(k+" x "+l+" ="+k*l);
					}
			
				}
				break;
			case 3:
				System.out.println("------- Operação finalizada!!! -------");
				stop = false;
				break;
				default:
				break;
		}
		
	} while (stop);
}
}

	


