package orientado_a_objeto_POO;

public class aviao_cessna {

	public static void main(String[] args) {
		sub_classe_avisao cessna = new sub_classe_avisao();
		cessna.ano = 2015;
		cessna.cor = "White";
		cessna.envergadura = 11;
		System.out.println("Avisão: Cessna");
		System.out.println("Ano: " + cessna.ano);
		System.out.println("cor: " + cessna.cor);
		System.out.println("Envergadura: " + cessna.envergadura + "m");
		cessna.ligar();
		cessna.desligar();
		cessna.ligar();
		cessna.acelerar();
		
		//testando commit git2
		

	}

}
