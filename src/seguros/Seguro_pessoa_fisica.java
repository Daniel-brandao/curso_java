package seguros;

import contas.Conta;

public class Seguro_pessoa_fisica extends Conta {

	public static void main(String[] args) {
		Seguro_pessoa_fisica cc3 = new Seguro_pessoa_fisica();
		cc3.setCliente("Daniel Brandão");
		cc3.setSaldo(10000);
		System.out.println("Cliente: " + cc3.getCliente());
		cc3.exibir_saldo();
		
		
	}

}
