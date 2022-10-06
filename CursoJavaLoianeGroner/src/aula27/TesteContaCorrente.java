package aula27;

public class TesteContaCorrente {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.banco = "Fuctura Banck";
		conta.agencia = "1632";
		conta.conta = "06024-8";
		conta.titular = "Daniel D. S. Cabral Filho";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.saldo = -10;
		conta.limiteEspecialUsado = 0;
		
		System.out.println("---------# "+conta.banco+" #---------");
		System.out.println("Agencia: "+conta.agencia);
		System.out.println("Conta nº "+conta.conta);
		System.out.println("Titular: "+conta.titular);
		
		//CHAMANDO METODO PARA REALIZAR UM SAQUE:
		boolean saqueEfetuado = conta.realizarSaque(10);
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso!");
			System.out.println("Saldo atual = R$"+conta.saldo);
		} else {
			System.out.println("Saque não autorizado, saldo insuficiente!");
		}
		//CHAMANDO METODO PARA DEPOSITAR UM VALOR:
		conta.depositar(500);
		System.out.println("Valor depositado R$ 500");
		//CHAMANDO O METODO CONSULTAR SALDO:
		conta.consultarSaldo();
		//Ou podemos utilizar assim para exibir o saldo:
		//System.out.println("Saldo atual R$ "+conta.saldo);
		
		
		//CHAMANDO O METODO PARA VERIFICAR SE O CHEQUE ESPECIAL FOI UTILIZADO:
		if(conta.verificarUsoChequeEspecial()) {
			System.out.println("Cheque Especial Utilizado!");
		}else {
			System.out.println("Chque Especial Não Utilizado!");
		}
	}
	

}
