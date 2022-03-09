package exercicios;

public class Jogo_carta {

	public static void main(String[] args) {
		String naipe, face;
		String[] naipes = { "ouros", "copas", "espadas", "paus" };
		String[] faces = { "Az", "2", "3", "4", "5", "6", "7", "8", "9", "10", "valete", "dama", "rei" };

		System.out.println("Recuperando aleatoriamente o conteúdo dos arrays");
		naipe = naipes[(int) (Math.random() * naipes.length)];
		face = faces[(int) (Math.random() * faces.length)];
		System.out.println(face + " de " + naipe);

	}

}
