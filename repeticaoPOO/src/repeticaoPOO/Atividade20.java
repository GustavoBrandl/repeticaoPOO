package repeticaoPOO;
import java.util.Scanner;

public class Atividade20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de notas: ");
		int n = input.nextInt();
		double media = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Informe a nota " + i + " do aluno: ");
			media += input.nextDouble();
		}
		
		System.out.print("Media do aluno: " + (double) media/n);
		
		input.close();
	}

}
