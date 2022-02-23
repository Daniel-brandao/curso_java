package contas;

public class Pessoa_fisica {

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.cliente = "Daniel Ramos";
		cc1.saldo = 10000;
		System.out.println("Cliente: " + cc1.cliente);
		cc1.exibir_saldo();
		cc1.sacar(1500);
		cc1.exibir_saldo();
		System.out.println("---------------------------------------------");
		
		Conta cc2 = new Conta();
		cc2.cliente = "Aline Ramos";
		cc2.saldo = 2500;
		System.out.println("Cliente: " + cc2.cliente);
		cc2.exibir_saldo();
		cc2.deposito(2500);
		cc2.exibir_saldo();
		System.out.println("---------------------------------------------");
		System.out.println("Tranferencia");
		System.out.println("Cliente: " + cc1.cliente);
		System.out.println("Favorecido: " + cc2.cliente);
		cc1.transferir(cc2, 2000);
		System.out.println("");
		System.out.println("Cliente: " + cc1.cliente);
		cc1.exibir_saldo();
		System.out.println("Cliente: " + cc2.cliente);
		cc2.exibir_saldo();
		
		
	}

}
