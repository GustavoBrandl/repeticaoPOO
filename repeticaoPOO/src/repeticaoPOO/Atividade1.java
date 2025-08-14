package repeticaoPOO;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int nota;
		
		do {
			System.out.print("Digite uma nota em 0 e 10: " );
			nota = input.nextInt();
		} while (nota < 0 || nota > 10);
		
		System.out.println("Progama finalizado!");
		
		input.close();
	}

}
