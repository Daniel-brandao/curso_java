package exercicios;

import java.util.Scanner;

import sun.jvm.hotspot.gc.parallel.PSYoungGen;

public class Calcula_hora_servico {

	public static void main(String[] args) {
		double remu_mensal, impostos, custo_op, investimento, hora_mensal, result;
		
		Scanner Entra_dados = new Scanner(System.in);
		 System.out.println("Calculador de valor hora trabalhadas");
		 System.out.print("Informe o custo de opração: ");
		 custo_op = Entra_dados.nextDouble();
		 System.out.print("Informe a remuneração mensal: ");
		 remu_mensal = Entra_dados.nextDouble();
		 System.out.print("Informe a carga horaria mensal: ");
		 hora_mensal = Entra_dados.nextDouble();
		 impostos = (30.0/100.0)* remu_mensal;
		 investimento = (20.0/100.0)* remu_mensal;
		 
		 result = (remu_mensal + impostos + custo_op + investimento)/hora_mensal;
		 
		 System.out.println("Valor R$ horas: " +result);
	}

}
