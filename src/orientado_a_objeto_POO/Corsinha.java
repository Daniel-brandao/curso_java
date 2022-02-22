package orientado_a_objeto_POO;

public class Corsinha {

	public static void main(String[] args) {
		Carro_modelo corsinha = new Carro_modelo(2001, "Amarelo");
		System.out.println("Carro : Corsinha");
		System.out.println("Ano: " + corsinha.ano);
		System.out.println("Cor: " + corsinha.cor);
		corsinha.ligar();

	}

}
