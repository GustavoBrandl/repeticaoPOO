package repeticaoPOO;
import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int iNumero;
		
		do {
			System.out.print("Qual numero de 1 a 10 deseja ver a taboada: ");
			iNumero = input.nextInt();
			
			if (iNumero < 0 || iNumero > 10) {
				System.out.print("O numero precisa estar entre 1 e 10\n\n");
			}
		} while (iNumero < 0 || iNumero > 10);
		
		for (int i=1; i<=10; i++) {
			System.out.println(iNumero + " x " + i + " = " + iNumero*i);
		}
		input.close();
	}

}
