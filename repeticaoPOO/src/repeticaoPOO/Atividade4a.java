package repeticaoPOO;

public class Atividade4a {

	public static void main(String[] args) {
		
		int paisA = 80000;
		double crescimentoA = 1.03;
		int paisB = 200000;
		double crescimentoB = 1.015;
		
		int anos = 0;
		
		while (paisA <= paisB) {
			paisA = (int) (paisA*crescimentoA);
			paisB = (int) (paisB*crescimentoB);
			anos ++;
		}
		
		System.out.println("Vão demorar " + anos + " anos para o pais A ficar maior que o pais B.");
		
	}

}
