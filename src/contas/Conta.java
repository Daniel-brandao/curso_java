package contas;

public class Conta {
	protected String cliente;
	protected double saldo;
	
	protected Conta() {
		System.out.println("Agência 0261");
	}
	
	protected void exibir_saldo() {
		System.out.println("Saldo: R$ " + saldo);
	}
}
