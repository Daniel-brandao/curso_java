package java_basico_fundamentos;

import java.util.Iterator;

public class variaveis_fundamentos {

	public static void main(String[] args) {
		String nome;
		int idade;
		int result;
		
		idade = 15;
		nome = "daniel";
		System.out.println("nome" + nome);
		System.out.println("idade" + idade);
		System.out.println(nome +  idade);
		
		if (idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de Idade");		
		}
		
		
		for (int tabuada = 0; tabuada <= 10; tabuada ++) {
			System.out.println("");
			for(int valor = 0; valor <= 40; valor++) {
				result = tabuada * valor;
				System.out.println(tabuada + " X " + valor + " = " + result);
			}
		}
	
		} 
		
	}

