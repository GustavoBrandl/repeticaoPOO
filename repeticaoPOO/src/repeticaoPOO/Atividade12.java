package repeticaoPOO;
import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int iFibonacci = 0;
		int iArmazem = 1;
		int iBuffer;
		
		System.out.print("Qual o n-ésimo numero da serie de Fibonacci: ");
		int iN = input.nextInt();
		
		for (int i = 1; i <= iN; i++) {
			iBuffer = iFibonacci;
			iFibonacci += iArmazem;
			System.out.println(iFibonacci);
			iArmazem = iBuffer;
		}
		
		input.close();
	}

}
