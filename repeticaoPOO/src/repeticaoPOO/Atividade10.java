package repeticaoPOO;
import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Informe a base: ");
		int iBase = input.nextInt();
		
		System.out.print("Informe o expoente: ");
		int iExpoente = input.nextInt();
		
		int iResultado = 1;
		
		for (int i=1; i <= iExpoente; i++) {
			iResultado *= iBase; 
		}
		
		System.out.print("\nResultado: " + iResultado);
		
		input.close();
	}

}
