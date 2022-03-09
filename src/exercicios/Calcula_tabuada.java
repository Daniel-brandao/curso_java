package exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Calcula_tabuada {

	public static void main(String[] args) {
		int vl_tabuada, i;

		Scanner entra_dados = new Scanner(System.in);
		System.out.println("Calculador de tabuada");
		System.out.println("______________________");
		System.out.print("Informe o valor da tabuada que deseja calcular: ");
		vl_tabuada = entra_dados.nextInt();

		for (i = 0; i <= 10; i++) {
			System.out.println(vl_tabuada + " X " + i + " = " + (vl_tabuada * i));
		}

	}

}
