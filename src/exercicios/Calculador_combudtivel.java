package exercicios;

import java.util.Scanner;

import sun.jvm.hotspot.gc.parallel.PSYoungGen;

public class Calculador_combudtivel {

	public static void main(String[] args) {
		double vr_alcool, vr_gasolina;
		
		Scanner Entra_dados = new Scanner(System.in);
		System.out.println("Informe o valor da gasolina: ");
		vr_gasolina = Entra_dados.nextDouble();
		System.out.println("Informe o valor do alcool: ");
		vr_alcool = Entra_dados.nextDouble();
		
		if (vr_alcool < 0.7 * vr_gasolina) {
			System.out.println("O alcool é mais Vantajoso");
			}else {
			System.out.println("A gasolina é mais vantajosa");
			Entra_dados.close();
		}

	}

}
