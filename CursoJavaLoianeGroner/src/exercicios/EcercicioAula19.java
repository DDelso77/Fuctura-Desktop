package exercicios;

public class EcercicioAula19 {

	public static void main(String[] args) {
		System.out.println("---------------------------------- 01 ----------------------------------");
		System.out.println("1.Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo\n  e tamanho e com os \"mesmos\" elementos do vetor A, ou seja, B[i] = A[i]");
		System.out.println("");
		System.out.println("Resposta:");
		int[] vetorA = new int[5];
		vetorA[0]=1;
		vetorA[1]=2;
		vetorA[2]=3;
		vetorA[3]=4;
		vetorA[4]=5;
		System.out.println("Os elementos do vetor A são: "+vetorA[0]+", "+vetorA[1]+", "+vetorA[2]+", "+vetorA[3]+", "+vetorA[4]);

		int[] vetorB = new int[5];
		vetorB[0]=1;
		vetorB[1]=2;
		vetorB[2]=3;
		vetorB[3]=4;
		vetorB[4]=5;
		System.out.println("Os elementos do vetor B são: "+vetorB[0]+", "+vetorB[1]+", "+vetorB[2]+", "+vetorB[3]+", "+vetorB[4]);
		
		System.out.println("");
		System.out.println("---------------------------------- 02 ----------------------------------");
		System.out.println("2. Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e\n   tamanho e com os elementos do vetor A multiplicados por 2, ou seja: B[i] = A[i] * 2.");
		System.out.println("");
		System.out.println("Resposta:");
		int[] tipoA = new int[8];
		tipoA[0]=1;
		tipoA[1]=2;
		tipoA[2]=3;
		tipoA[3]=4;
		tipoA[4]=5;
		tipoA[5]=6;
		tipoA[6]=7;
		tipoA[7]=8;
		
		System.out.println("Os elementos do vetor tipoA são: "+tipoA[0]+", "+tipoA[1]+", "+tipoA[2]+", "+tipoA[3]+", "+tipoA[4]+", "+tipoA[5]+", "+tipoA[6]+", "+tipoA[7]);
		
		int[] tipoB = new int[8];
		tipoB[0]=tipoA[0]*2;
		tipoB[1]=tipoA[1]*2;
		tipoB[2]=tipoA[2]*2;
		tipoB[3]=tipoA[3]*2;
		tipoB[4]=tipoA[4]*2;
		tipoB[5]=tipoA[5]*2;
		tipoB[6]=tipoA[6]*2;
		tipoB[7]=tipoA[7]*2;
		System.out.println("Os elementos do vetor tipoB são: "+tipoB[0]+", "+tipoB[1]+", "+tipoB[2]+", "+tipoB[3]+", "+tipoB[4]+", "+tipoB[5]+", "+tipoB[6]+", "+tipoB[7]);
		
		System.out.println("");
		System.out.println("---------------------------------- 03 ----------------------------------");
		System.out.println("3. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de\r\n"
				+ "   mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá\r\n"
				+ "   ser o quadrado do respectivo elemento de A, ou seja:\r\n"
				+ "   B[i] = A[i] * A[I].");
		System.out.println("");
		System.out.println("Resposta:");
		System.out.println(">>>>>Elementos do vetor arrayA:<<<<<");
		int[] arrayA = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		for(int i=0;i<arrayA.length;i++) {
			System.out.println("Os elementos do vetor arrayA são: "+arrayA[i]);
		}
		
		System.out.println("");
		System.out.println(">>>>>Elementos do vetor arrayB:<<<<<");
		int[] arrayB = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		for(int i=0;i<arrayB.length;i++) {
			System.out.println("Os elementos do vetor arrayB são: "+arrayA[i]*arrayA[i]);
		}
		System.out.println("");
		System.out.println("---------------------------------- 04 ----------------------------------");
		System.out.println("4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de\r\n"
				+ "   mesmo tamanho, sendo que cada elemento do vetor B deverá ser a\r\n"
				+ "   raiz quadrada do respectivo elemento de A, ou seja:\r\n"
				+ "   B[i] = sqrt(A[i]). \r\n"
				+ "");
		System.out.println("");
		System.out.println("Resposta:");
		System.out.println(">>>>>Elementos do vetor caixaA:<<<<<");
		int[] caixaA = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		for(int value01:caixaA) {
		System.out.println("Os elementos do vetor caixaA são: "+value01);
		}
		
		int[] caixaB = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		for(int i =0; i<caixaB.length;i++) {
			System.out.println("Os elementos do vetor caixaB são: "+caixaB[i]);
		}
	}

}