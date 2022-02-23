package contas;

public class Conta {
	protected String cliente;
	protected double saldo;
	
	protected Conta() {
		System.out.println("Ag�ncia 0261");
	}
	
	protected void exibir_saldo() {
		System.out.println("Saldo: R$ " + saldo);
	}
	
	void sacar (double valor) {
		saldo -= valor;
		System.out.println("D�bito: R$" + valor);
		
	}
	
	void deposito (double valor) {
		saldo += valor;
		System.out.println("Credito: R$" + valor);
	}
	
	void transferir (Conta destino, double valor) {
		this.sacar(valor);
		destino.deposito(valor);
		System.out.println("Transfer�ncia no valor de R$ " + valor + "Realizada com sucesso!");
		
	}
	
	double soma(double cc1, double cc2) {
		double total = cc1 + cc2;
		return total;		
	}
}
