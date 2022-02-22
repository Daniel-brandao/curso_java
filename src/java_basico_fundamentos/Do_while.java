package java_basico_fundamentos;

public class Do_while {

	public static void main(String[] args) {
		System.out.println("Uso do while");
		int contador = 1;
		char novo_jogo;
		
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		
		System.out.println("Uso da estrutura do while");
		System.out.println("");
		
		do {
			System.out.println("Deseja jogar novamente (s/n)?");
			novo_jogo = 's';
		} while (novo_jogo == 's');
		System.out.println("GAME OVER!");
		
	}

}
