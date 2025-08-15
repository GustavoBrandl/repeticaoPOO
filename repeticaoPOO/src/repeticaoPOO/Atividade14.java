package repeticaoPOO;
import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Qual o n-ésimo termo: ");
		int j = input.nextInt();
		int iN = 0;
		int iM = 0;
		
		System.out.print("S = ");
		
		for (int i = 1; i <=j; i++) {
			iN = i;
			iM = 2 * iN - 1;
			System.out.print(iN + "/" + iM + " + ");
		}
		
		System.out.print("... + n/m");

		input.close();
	}

}
