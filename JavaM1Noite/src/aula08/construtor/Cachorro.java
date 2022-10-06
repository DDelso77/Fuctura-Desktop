package aula08.construtor;

public class Cachorro {
	private String nome;
	private String cor;
	private int idade;
	private float peso;
	
	public Cachorro() {
}
	
	public Cachorro(String nome, String cor, int idade, float peso) {
		this.nome =nome;
		this.cor =cor;
		this.idade =idade;
		this.peso =peso;
		
	}
}
