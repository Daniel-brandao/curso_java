package orientado_a_objeto_POO;

public class Barco {

	public static void main(String[] args) {
		Modelo_Barco barco = new Modelo_Barco();
		barco.ano = 1999;
		barco.cor = "Grey";
		barco.pes = 1500;
		System.out.println("Cor: " + barco.cor);
		System.out.println("Ano: " + barco.ano);
		System.out.println("Pes: " + barco.pes);
		barco.navegar();
		barco.atracar();
		
		
				
		

	}

}
