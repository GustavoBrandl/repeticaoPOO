package repeticaoPOO;
import java.util.Scanner;

public class Atividade21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de pessoas: ");
		int n = input.nextInt();
		int media = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Informe a idade da pessoa " + i + ": ");
			media += input.nextDouble();
		}
		
		System.out.println("Media de idade: " +  media/n);
		
		if (media <= 25) {
			System.out.print("Turma jovem");
		} else {
			if (media >= 26 && media <= 60) {
				System.out.print("Turma adulta");
			} else {
				System.out.print("Turma idosa");
			}
		}
		
		input.close();
	}

}
