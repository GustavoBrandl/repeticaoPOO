package repeticaoPOO;
import java.util.Scanner;

public class Atividade23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de turmas: ");
		int n = input.nextInt();
		int media = 0;
		int alunos;
		
		for (int i = 1; i <= n; i++) {
			do {
				System.out.print("Quantos alunos tem na turma " + i + " (1-40): ");
				alunos = input.nextInt();
				
				if (alunos < 1 || alunos > 40) {
					System.out.print("As turmas devem ter entre 1 e 40!");
				}
			} while (alunos < 1 || alunos > 40);
			
			media += alunos;
		}
		
		System.out.print("Media de alunos por turma: " + media/n);
		
		input.close();
	}

}
