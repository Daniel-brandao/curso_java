package exercicios;

import java.util.Scanner;

public class Excercicio_2_calculador_de_porcentagem {

	public static void main(String[] args) {
		double vl_inicial, porcent, result;

		Scanner entra_dados = new Scanner(System.in);

		System.out.println("Calculador de porcentagem");
		System.out.print("Digite o valor inicial: ");
		vl_inicial = entra_dados.nextDouble();
		System.out.print("Digite a porcentagem que deseja calcular: ");
		porcent = entra_dados.nextDouble();

		result = (porcent * vl_inicial) / 100;

		System.out.println(porcent + "% de " + vl_inicial + " é " + result + " R$");
		entra_dados.close();

	}

}
