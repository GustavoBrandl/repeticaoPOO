package repeticaoPOO;
import java.util.Scanner;

public class Atividade16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o total N de numeros do conjunto: ");
        int n = input.nextInt();
        int menor = 100000;
        int maior = -100000;
        int soma = 0;
        int num;
        
        for (int i = 1; i <=n; i++) {
        	System.out.print("Informe o numero " + i + " do conjunto: ");
        	num = input.nextInt();
        	
        	soma += num;
        	
        	if (num > maior) {
        		maior = num;
        	}
        	if (num < menor) {
        		menor = num;
        	}
        }
        
        System.out.println("Soma: " + soma);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        
        input.close();
    }
}