package repeticaoPOO;
import java.util.Scanner;

public class Atividade35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] codigos = {100, 101, 102, 103, 104, 105};
        String[] produtos = {"Cachorro Quente", "Bauru Simples", "Bauru com ovo", "Hambúrguer", "Cheeseburguer", "Refrigerante"};
        double[] precos = {1.20, 1.30, 1.50, 1.20, 1.30, 1.00};

        double totalGeral = 0;

        while (true) {
            System.out.print("Digite o código do item (ou 0 para encerrar): ");
            int codigo = input.nextInt();

            if (codigo == 0) {
                break;
            }

            int indice = -1;
            for (int i = 0; i < codigos.length; i++) {
                if (codigos[i] == codigo) {
                    indice = i;
                    break;
                }
            }

            if (indice == -1) {
                System.out.println("Código inválido!");
                continue;
            }

            System.out.print("Digite a quantidade desejada: ");
            int quantidade = input.nextInt();

            double valorItem = precos[indice] * quantidade;
            totalGeral += valorItem;

            System.out.printf("%-20s x%-3d R$ %-7.2f%n", produtos[indice], quantidade, valorItem);
        }

        System.out.printf("Total geral: R$ %.2f%n", totalGeral);

        input.close();
    }
}
