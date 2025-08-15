package repeticaoPOO;
import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Informe um numero: ");
		int iNumeroA = input.nextInt();
		
		System.out.print("Informe um numero: ");
		int iNumeroB = input.nextInt();
		
		int iSoma = 0;
		
		for(int i = iNumeroA; i <= iNumeroB; i++) {
			System.out.println(i);
			iSoma += i;
		}
		
		System.out.print("Soma final: " + iSoma);
		
		input.close();
	}

}
