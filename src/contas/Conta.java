package contas;

public class Conta {
	private String cliente;
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
		
	}
	private double saldo;
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		
	}
	
	protected Conta() {
		System.out.println("Agência 0261");
	}
	
	protected void exibir_saldo() {
		System.out.println("Saldo: R$ " + saldo);
	}
	
	void sacar (double valor) {
		saldo -= valor;
		System.out.println("Débito: R$" + valor);
		
	}
	
	void deposito (double valor) {
		saldo += valor;
		System.out.println("Credito: R$" + valor);
	}
	
	void transferir (Conta destino, double valor) {
		this.sacar(valor);
		destino.deposito(valor);
		System.out.println("Transferência no valor de R$ " + valor + "Realizada com sucesso!");
		
	}
	
	double soma(double cc1, double cc2) {
		double total = cc1 + cc2;
		return total;		
	}
}
