package contas;

public class Pessoa_fisica {

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.setCliente("Daniel Ramos");
		cc1.setSaldo(10000);
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibir_saldo();
		cc1.sacar(1500);
		cc1.exibir_saldo();
		System.out.println("---------------------------------------------");
		
		Conta cc2 = new Conta();
		cc2.setCliente("Aline Ramos");
		cc2.setSaldo(2500);
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibir_saldo();
		cc2.deposito(2500);
		cc2.exibir_saldo();
		System.out.println("---------------------------------------------");
		System.out.println("Tranferencia");
		System.out.println("Cliente: " + cc1.getCliente());
		System.out.println("Favorecido: " + cc2.getCliente());
		cc1.transferir(cc2, 2000);
		System.out.println("");
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibir_saldo();
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibir_saldo();
		System.out.println("---------------------------------------------");
		System.out.println("Relatório gerencial");
		Conta gerente = new Conta();
		double relatorio = gerente.soma(cc1.getSaldo(), cc2.getSaldo());
		System.out.println("Saldo total nas contas R$" + relatorio);
				
		
	}

}
