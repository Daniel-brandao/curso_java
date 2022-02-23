package orientado_a_objeto_POO;

public class Clio {

	public static void main(String[] args) {
		Carro_modelo clio = new Carro_modelo();
		System.out.println("Carro : clio");
		System.out.println("Ano: " + clio.ano);
		System.out.println("Cor: " + clio.cor);
		clio.ligar();
		clio.acelerar();
		clio.desligar();

	}

}
