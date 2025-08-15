package repeticaoPOO;
import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int iNumero, iPar = 0, iImpar = 0;
		
		for (int i=1; i <= 10; i++) {
			System.out.print("Informe o numeor " + i + ": ");
			iNumero = input.nextInt();
			
			if (iNumero % 2 == 0) {
				iPar ++;
			} else {
				iImpar ++;
			}
		}
		
		System.out.println("\nPares: " + iPar);
		System.out.println("Impares: " + iImpar);
		
		input.close();
	}

}
