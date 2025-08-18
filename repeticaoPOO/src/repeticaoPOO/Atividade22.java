package repeticaoPOO;
import java.util.Scanner;

public class Atividade22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de votantes: ");
		int n = input.nextInt();
		
		System.out.println("\nCandidatos: 1, 2, 3;\nQualquer outra entrada: nulo\n");
		int cand1 = 0, cand2 = 0, cand3 = 0, voto;
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Informe o voto da pessoa " + i + ": ");
			voto = input.nextInt();
			switch (voto) {
				case 1:
					cand1 ++;
					break;
				case 2:
					cand2 ++;
					break;
				case 3: 
					cand3 ++;
					break;
			}
		}
		
		System.out.println("\nQuantidade de votos candidato 1: " + cand1);
		System.out.println("Quantidade de votos candidato 2: " + cand2);
		System.out.println("Quantidade de votos candidato 3: " + cand3);
		
		input.close();
	}

}
