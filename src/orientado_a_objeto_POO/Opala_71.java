package orientado_a_objeto_POO;

public class Opala_71 {

	public static void main(String[] args) {
		Carro_modelo opala = new Carro_modelo();
		opala.ano = 1971;
		opala.cor = "Azul";
		System.out.println("Carro : Opala");
		System.out.println("Ano: " + opala.ano);
		System.out.println("Cor: " + opala.cor);
		opala.ligar();
		opala.acelerar();
		opala.desligar();

	}

}
