package repeticaoPOO;
import java.util.Scanner;

public class Atividade24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de CD's: ");
		int n = input.nextInt();
		double valor = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Qual o preço do CD " + i + ": ");
			valor += input.nextDouble();
		}
		
		System.out.println("Preço total gasto: " + valor);
		System.out.println("Media de alunos por CD: " + (double) valor/n);
		
		input.close();
	}

}
