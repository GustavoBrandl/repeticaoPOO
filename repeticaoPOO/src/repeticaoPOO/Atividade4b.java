package repeticaoPOO;
import java.util.Scanner;

public class Atividade4b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int paisA;
		
		do {
			System.out.print("\nInforma a população do pais A: " );
			paisA = input.nextInt();
			
			if (paisA < 0) {
				System.out.println("A população precisa ser maior que 0. Tente de novo.");
			}
		} while (paisA < 0);
		
		double crescimentoA;
		
		do{
			System.out.print("\nInforma a taxa de crescimento do pais A: " );
			crescimentoA = input.nextDouble();
			
			if (crescimentoA < 1) {
				System.out.println("A taxa precisa ser descrita como 1.xx. Tente de novo.");
			}
		} while (crescimentoA < 1);
		
		int paisB;
		
		do {
			System.out.print("\nInforma a população do pais B: " );
			paisB = input.nextInt();
			
			if (paisB < 0) {
				System.out.println("A população precisa ser maior que 0. Tente de novo.");
			}
		} while (paisB < 0);
		
		double crescimentoB;
		
		do{
			System.out.print("\nInforma a taxa de crescimento do pais B: " );
			crescimentoB = input.nextDouble();
			
			if (crescimentoB < 1) {
				System.out.println("A taxa precisa ser descrita como 1.xx. Tente de novo.");
			}
		} while (crescimentoB < 1);
		
		int anos = 0;
		
		if (paisA > paisB) {
			int iAux = paisA;
			paisA = paisB;
			paisB = iAux;
			
			double dAux = crescimentoA;
			crescimentoA = crescimentoB;
			crescimentoB = dAux;
			
			System.out.print("\nNumeros alterado. País A tem a menor população. País B tem a maior.\n");
		}
		
		if (crescimentoA >= crescimentoB) {
			
			while (paisA <= paisB) {
				paisA = (int) (paisA*crescimentoA);
				paisB = (int) (paisB*crescimentoB);
				anos ++;
			}
		
			System.out.println("Vão demorar " + anos + " anos para o país A ficar maior que o país B.");
		
		} else {
			System.out.println("Progama impossivel. A taxa de crescimento do país A é menor que a do país B. Assim é impossivel país A ficar maior que o país B.");
		}
		
		input.close();
	}

}
