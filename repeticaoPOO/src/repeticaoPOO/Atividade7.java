package repeticaoPOO;
import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Informe um numero: ");
		int iNumeroA = input.nextInt();
		
		System.out.print("Informe um numero: ");
		int iNumeroB = input.nextInt();
		
		for(int i = iNumeroA; i <= iNumeroB; i++) {
			System.out.println(i);
		}
		
		input.close();
	}

}
