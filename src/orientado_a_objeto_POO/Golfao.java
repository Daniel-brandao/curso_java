package orientado_a_objeto_POO;

public class Golfao {

	public static void main(String[] args) {
		Carro_modelo golfao = new Carro_modelo();
		golfao.ano = 2003;
		golfao.cor = "Preto";
		System.out.println("Carro : Golfão");
		System.out.println("Ano: " + golfao.ano);
		System.out.println("Cor: " + golfao.cor);
		golfao.ligar();
		golfao.acelerar();
	}

}
