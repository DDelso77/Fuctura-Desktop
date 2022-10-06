package aula27;

public class ContaCorrente {
	
	String banco;
	String agencia;
	String conta;
	String titular;
	boolean especial;
	double limiteEspecial;
	double limiteEspecialUsado;
	double saldo;
	
	//1 - METODO PARA SACAR:
	boolean realizarSaque(double valorSacar) {
		//Se tiver saldo na conta:
		if (saldo > valorSacar) {
			saldo -= valorSacar;
			return true;
		} else { // Se não tem saldo na conta ou o saldo for negativo:
			if(especial) {
				double limite = limiteEspecial+saldo;
				if(limite >= valorSacar) {
					saldo -= valorSacar;
					return true;
				} else {
					return false;
				}
				//verificar se o limite especial tem saldo
				
			} else {
				return false;
			}
		}
		
	}
	
	//2 - METODO PARA DEPOSITAR
	void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	//3 - METODO PARA CONSULTAR SALDO
	void consultarSaldo() {
		System.out.println("Saldo atual R$ "+saldo);
	}
	
	// 4 - METODO PARA VERIFICAR SE ESTÁ UTILIZANDO O CHEQUE ESPECIAL:
	
	boolean verificarUsoChequeEspecial() {
		return saldo < 0;
	}
}
