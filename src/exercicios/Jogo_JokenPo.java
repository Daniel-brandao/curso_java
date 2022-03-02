package exercicios;

import java.util.Scanner;

public class Jogo_JokenPo {

	public static void main(String[] args) {
		int player, pc;
		Scanner entra_dados = new Scanner(System.in);
		System.out.println("_________JokenPô________");
		System.out.println("");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.print("Digite a opção desejada: ");

		player = entra_dados.nextInt();
		System.out.println("");

		switch (player) {
		case 1:
			System.out.println("Jogador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Jogador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Jogador escolheu TESOURA");
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		}
		pc = (int) (Math.random() * 3 + 1);

		switch (pc) {
		case 1:
			System.out.println("Banca escolhe PEDRA");
			break;
		case 2:
			System.out.println("Banca escolhe PAPEL");
			break;
		case 3:
			System.out.println("Banca escolhe TESOURA");
			break;
		}

		if (player == pc) {
			System.out.println("EMPATE");
		} else {
			if ((player == 1 && pc == 3) || (player == 2 && pc == 1) || (player == 3 && pc == 2)) {
				System.out.println("JOGADOR VENCEU!");
			} else {
				System.out.println("BANCA VENCEU!");

			}
		}
	}

}
