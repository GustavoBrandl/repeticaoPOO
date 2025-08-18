package repeticaoPOO;
import java.util.Scanner;

public class Atividade19a {
    static int divisoes = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int num = input.nextInt();

        for (int i = 2; i <= num; i++) {
            if (testePrimo(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("Foram necessárias: " + divisoes + " divisões (operacoes de %).");

        input.close();
    }

    static boolean testePrimo(int n) {
        if (n < 2) return false;

        divisoes++;     
        if (n % 2 == 0) return n == 2;
        
        divisoes++;
        if (n % 3 == 0) return n == 3;

        for (int i = 5; i <= n / i; i += 6) {
            divisoes++;            
            if (n % i == 0) return false;

            divisoes++;
            if (n % (i + 2) == 0) return false;
        }
        return true;
    }
}