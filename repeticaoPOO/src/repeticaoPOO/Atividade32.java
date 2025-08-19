package repeticaoPOO;
import java.util.Scanner;

public class Atividade32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] codCidade = new int[5];
        int[] veiculos = new int[5];
        int[] acidentes = new int[5];

        int somaVeiculos = 0;
        int somaAcidentesMenos2000 = 0;
        int contCidadesMenos2000 = 0;

        int codMaiorIndice = 0, codMenorIndice = 0;
        int maiorIndice = Integer.MIN_VALUE, menorIndice = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.println("\n--- Cidade " + (i + 1) + " ---");
            System.out.print("Código da cidade: ");
            codCidade[i] = input.nextInt();

            System.out.print("Número de veículos de passeio (em 1999): ");
            veiculos[i] = input.nextInt();

            System.out.print("Número de acidentes com vítimas (em 1999): ");
            acidentes[i] = input.nextInt();

            somaVeiculos += veiculos[i];

            if (acidentes[i] > maiorIndice) {
                maiorIndice = acidentes[i];
                codMaiorIndice = codCidade[i];
            }
            if (acidentes[i] < menorIndice) {
                menorIndice = acidentes[i];
                codMenorIndice = codCidade[i];
            }

            if (veiculos[i] < 2000) {
                somaAcidentesMenos2000 += acidentes[i];
                contCidadesMenos2000++;
            }
        }

        double mediaVeiculos = (double) somaVeiculos / 5;
        double mediaAcidentesMenos2000 = (contCidadesMenos2000 > 0) 
            ? (double) somaAcidentesMenos2000 / contCidadesMenos2000 
            : 0;

        System.out.println("\n=== Resultado da pesquisa ===");
        System.out.println("Maior índice de acidentes: " + maiorIndice + " (Cidade " + codMaiorIndice + ")");
        System.out.println("Menor índice de acidentes: " + menorIndice + " (Cidade " + codMenorIndice + ")");
        System.out.println("Média de veículos nas 5 cidades: " + String.format("%.2f", mediaVeiculos));
        if (contCidadesMenos2000 > 0) {
            System.out.println("Média de acidentes nas cidades com menos de 2000 veículos: " 
                + String.format("%.2f", mediaAcidentesMenos2000));
        } else {
            System.out.println("Nenhuma cidade com menos de 2000 veículos.");
        }

        input.close();
    }
}
