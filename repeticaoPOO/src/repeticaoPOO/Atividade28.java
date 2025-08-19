package repeticaoPOO;
import java.util.Scanner;

public class Atividade28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de temperaturas lidas: ");
		int n = input.nextInt();
		double temp, maior = -9999, menor = 9999, media = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Qual a temperatura " + i + " lida: ");
			temp = input.nextDouble();
			media += temp;
			
			if (temp > maior) {
				maior = temp;
			}
			
			if (temp < menor) {
				menor = temp;
			}
		}
		
		System.out.println("Média das temperaturas lidas: " + (double) media/n);
		System.out.println("Maior temepratura: " + maior);
		System.out.println("Menor temepratura: " + menor);
		
		input.close();
	}

}
