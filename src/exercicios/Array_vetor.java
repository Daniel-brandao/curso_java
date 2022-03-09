package exercicios;

import java.util.Iterator;

public class Array_vetor {

	public static void main(String[] args) {
		String[] carros = { "ferrari", "fusca", "camaro", "uno" };

		System.out.println("Tamanho do array: " + carros.length);
		System.out.println("Carro: " + carros[2]);
		carros[2] = "golf";
		System.out.println("Carro: " + carros[2]);
		System.out.println("______________________");
		System.out.println("Carros: ");
		for (int i = 0; i < carros.length; i++) {
			System.out.println(carros[i]);
		}
	}

}
