package aula08.construtor;

public class CachorroTeste {

	public static void main(String[] args) {
		Cachorro bob = new Cachorro("Tody", "Branco", 3, 4.5f);
		Cachorro tob = new Cachorro();
		
		String nome = "Pretinho";
		tob.(nome);
		tob.setCor("Preto");
		tob.setIdade(7);
		
		System.out.println("Nome: "+bob.getNome()+"\nIdade: "+bob.getIdade()+"\nCor do pelo: "+bob.getCor()+"\nPeso:"+bob.getPeso()+"\n");
		System.out.println("Nome:"+tob.getNome()+"\nIdade: "+tob.getIdade()+"\nCor do pelo:"+"\nPeso: "+tob.getPeso()+"n");
		

	}

}
