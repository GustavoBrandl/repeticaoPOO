package repeticaoPOO;
import java.util.Scanner;

public class Atividade36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] candidatos = new String[4];
        int[] votosCandidatos = {0, 0, 0, 0};
        int votosNulos = 0;
        int votosBrancos = 0;
        int totalVotos = 0;

        for (int i = 0; i < candidatos.length; i++) {
            System.out.print("Digite o nome do candidato " + (i + 1) + ": ");
            candidatos[i] = input.nextLine();
        }

        System.out.println("\nCódigos dos candidatos:");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println((i + 1) + " - " + candidatos[i]);
        }
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto em Branco");

        while (true) {
            System.out.print("\nDigite o código do voto (0 para encerrar): ");
            int codigo = input.nextInt();

            if (codigo == 0) {
                break;
            }

            if (codigo >= 1 && codigo <= 4) {
                votosCandidatos[codigo - 1]++;
                totalVotos++;
            } else if (codigo == 5) {
                votosNulos++;
                totalVotos++;
            } else if (codigo == 6) {
                votosBrancos++;
                totalVotos++;
            } else {
                System.out.println("Código inválido!");
            }
        }

        System.out.println("\nResultado da Eleição:");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.printf("%-15s: %d votos%n", candidatos[i], votosCandidatos[i]);
        }
        System.out.printf("Votos Nulos    : %d%n", votosNulos);
        System.out.printf("Votos Brancos  : %d%n", votosBrancos);

        if (totalVotos > 0) {
            double percNulos = (votosNulos * 100.0) / totalVotos;
            double percBrancos = (votosBrancos * 100.0) / totalVotos;
            System.out.printf("Percentual de votos nulos  : %.2f%% %n", percNulos);
            System.out.printf("Percentual de votos brancos: %.2f%% %n", percBrancos);
        }

        input.close();
    }
}
