package exercicios;

public class ArrayMultidimensional_matriz {

	public static void main(String[] args) {
		String[][] agenda ={{"Daniel","4898818-2873","daniel@vialaser.com"},{"Brandao","2222-222","brandao@gmail.com"},{"linus","999-0999","trovalds@gmaii.com"}};
		
		System.out.println(agenda[0][1]);
		System.out.println("A estruturas abaixo percorrem os indices dos arrays");
		
		for (int i = 0; i < agenda.length; i++) {
			System.out.println("_________________________________");
			for (int j = 0; j < agenda.length; j++) {
				System.out.println(agenda[i][j]);
				
			}
			
		}
		
	}

}
