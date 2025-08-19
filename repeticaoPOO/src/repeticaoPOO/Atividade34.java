package repeticaoPOO;
import java.util.Scanner;

public class Atividade34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] contadores = {0, 0, 0, 0};
        String[] intervalos = {"[0-25]", "[26-50]", "[51-75]", "[76-100]"};

        while (true) {
            System.out.print("Digite um número positivo (ou negativo para sair): ");
            int numero = input.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero <= 25) {
                contadores[0]++;
            } else if (numero <= 50) {
                contadores[1]++;
            } else if (numero <= 75) {
                contadores[2]++;
            } else if (numero <= 100) {
                contadores[3]++;
            }
        }

        System.out.printf("%-15s %-15s%n", "Intervalo", "Quantidade");
        for (int i = 0; i < intervalos.length; i++) {
            System.out.printf("%-15s %-15d%n", intervalos[i], contadores[i]);
        }

        input.close();
    }
}
