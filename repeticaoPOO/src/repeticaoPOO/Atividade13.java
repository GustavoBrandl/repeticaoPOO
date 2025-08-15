package repeticaoPOO;
import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Informe o numero para fazer o fatorial: ");
		int iN = input.nextInt();
		int iFatorial = iN;
		
		for (int i = iN-1; i > 0; i --) {
			iFatorial *= i;
		}
		
		System.out.print(iFatorial);
		
		input.close();
	}

}
