package exercicios;

import java.util.Scanner;

public class Lança_dado_6_faces {

	public static void main(String[] args) {
		char opcao = 's';
		int dado;
		Scanner entra_dados = new Scanner(System.in);

		while (opcao == 's') {
			System.out.println("joga dado....");
			dado = (int) (Math.random() * 6 + 1);
			System.out.println("Face " + dado);
			System.out.print("Deseja jogar novamente (s/n)? ");
			opcao = entra_dados.next().charAt(0);
		}

		System.out.println("Jogo interrompido!");

	}

}
