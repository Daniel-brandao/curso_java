package exercicios;

import java.util.Scanner;

public class PDV_ponto_de_vendas {

	public static void main(String[] args) {
		double total,desconto, result_desc, result_total, vl_recebido, troco;
		String nm_produto;
		
		Scanner Entra_dados = new Scanner(System.in);
		
		System.out.println("calculador de deconto PDV");
		System.out.println("");
		System.out.print("Digite o nome do produto: ");
		nm_produto = Entra_dados.next();
		System.out.print("Digite o valor total do produto: ");
		total = Entra_dados.nextDouble();
		System.err.println("Digite o valor da porcetagem de desconto");
		desconto = Entra_dados.nextDouble();
		
		result_desc = (total * desconto) / 100;
		result_total = total - result_desc;
		
		System.out.println("Descrição do Porduto: " + nm_produto);
		System.out.println("Valor Bruto do produto: " + total);
		System.out.println("Porcentagem de desconto: " + desconto + "%");
		System.out.println("Valor do desconto em R$: " + result_desc);
		System.out.println("Valor liquido do produto: " +result_total );
		System.out.println("------------------------------------------");
		System.out.print("Digite o valor recebido: ");
		vl_recebido = Entra_dados.nextDouble();
		
		troco = vl_recebido - result_total;
		
		System.out.println("valor de troco: " + troco);
		Entra_dados.close();
		
	}

}
