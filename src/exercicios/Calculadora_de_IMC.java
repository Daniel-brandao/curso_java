package exercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculadora_de_IMC {

	public static void main(String[] args) {
		double peso, altura, result;
		Scanner entra_dados = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("Calculadora de IMC");
		System.out.print("Informe seu peso: ");
		peso = entra_dados.nextDouble();
		System.out.print("Informe sua altura: ");
		altura = entra_dados.nextDouble();

		result = peso / (altura * altura);

		if (result < 18.5) {
			System.out.println("IMC: " + formatador.format(result) + " Voc� est� abaixo do Peso ideal");
		} else if (result < 25) {
			System.out.println("IMC: " + formatador.format(result) + " Voc� esta no peso ideal");
		} else if (result < 30) {
			System.out.println("IMC: " + formatador.format(result) + " Voc� est� levemente acima do peso ideal");
		} else if (result < 35) {
			System.out.println("IMC: " + formatador.format(result) + " Voc� esta com obesidade nivel I");
		} else if (result < 40) {
			System.out.println("IMC: " + formatador.format(result) + " Voc� est� com obesidade nivel II (Severa)");
		} else {
			System.out.println("IMC: " + formatador.format(result) + " Voc� esta com obseidade nivel III (M�rbida)");
		}

	}

}
