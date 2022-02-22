package orientado_a_objeto_POO;

public class Chevette {

	public static void main(String[] args) {
		Carro_modelo chevette = new Carro_modelo();
		chevette.ano = 1987;
		chevette.cor = "Azul Metalico";
		System.out.println("Carro : chevette");
		System.out.println("Ano: " + chevette.ano);
		System.out.println("Cor: " + chevette.cor);
		chevette.ligar();
		chevette.acelerar();

	}

}
