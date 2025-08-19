package repeticaoPOO;
import java.util.Scanner;

public class Atividade38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = input.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido!");
        } else {
            int invertido = 0;
            int temp = numero;

            while (temp > 0) {
                int digito = temp % 10;
                invertido = invertido * 10 + digito;
                temp /= 10;
            }

            System.out.println("Número invertido: " + invertido);
        }

        input.close();
    }
}
