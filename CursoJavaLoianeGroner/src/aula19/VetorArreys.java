package aula19;

public class VetorArreys {

	public static void main(String[] args) {
		// declarando um vetor(Arrey)
		double[] temperatura = new double[365];
		// Acessando uma posição no vetor(Arrey)
		temperatura[0] = 31.3;
		temperatura[1] = 32;
		temperatura[2] = 33.7;
		temperatura[3] = 34;
		temperatura[4] = 33.1;
		//Será exibido o valor 33.7 que está na posição(indice) [2].
		/*System.out.println(temperatura[2]);
		//Será exibido o valor 31.3, 32.0, 33.7 que estão na posição(indice) [0], [1], [2].
		System.out.println(temperatura[0]+", "+temperatura[1]+", "+temperatura[2]);
		//Exibir o tamanho do vetor(Arry)
		System.out.println(temperatura.length+" posições.");
		
		System.out.println("---------------------------------------------------------");
		
		//Exibindo todas as posições do vetor(Arrays):
		for(int i=0;i<temperatura.length;i++) {
			System.out.println("Ovalor da temperatura do dia "+(i+1)+" é: "+temperatura[i]);
		}
		
		for (int i=0;i<temperatura.length;i++) {
			System.out.println("No dia "+(i+1)+" o valor da temperatura é: "+temperatura[i]);
		}
		
		
		 
		 /*for(int i=0;i<temperatura.length;i++){
		System.out.println("A temperatura no dia "+(i+1)+" é: "+temperatura[i]);
		}
		
		for(int i=0;i<temperatura.length;i++){
		System.out.println("Dia "+(i+1)+": "+temperatura[i]);
	*/
		 // FOR melhorado, muito utilizado em vetor(Arrays)
		//Esse for não informa a posição porque não tem a variavel de inicio, no caso "int i=0".
	for(double temp: temperatura) {
		System.out.println(temp);
	}
		 
		 
		 
		 
		
	}

}
