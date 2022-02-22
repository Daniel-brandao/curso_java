package orientado_a_objeto_POO;

import java.util.Random;

public class Carro_modelo {
	int ano, chassis;
	String cor;
	boolean chassis_boolean;
	
	
	public Carro_modelo() {
		Random gerador = new Random();
		chassis = gerador.nextInt(1000);
		System.out.println("Chassis: " + chassis);
	}
	
	public Carro_modelo(int ano, String cor) {
		Random gerador_AZ = new Random();
		chassis_boolean = gerador_AZ.nextBoolean();
		this.ano = ano;
		this.cor = cor;
		System.out.println("         _______________"    );
		System.out.println("        /     /        \\"   );
		System.out.println(" ______/_____/______    \\ " );
		System.out.println("[0[\\\\[0[___  | -  ___|   |");
		System.out.println("\\_____|/, \\|____|/,\\/   | ");
		System.out.println("  \\\\_ \\\\__/    \\\\__/"  );
		System.out.println("____________________________");
		System.out.println("");
		System.out.println("Chassis: " + chassis_boolean);
		
		if (chassis_boolean = false) {
			System.out.println("Suprimido");
			
		} else {
			System.out.println("Legalizado");
		}
	}
	
	void ligar () {
		System.out.println("Engine on............");
	}
	void desligar () {
		System.out.println("Engine off..........");
	}
	
	void acelerar () {
		System.out.println("Vrummmmmmmmmm");
	}
}
