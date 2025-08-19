package repeticaoPOO;
import java.util.Scanner;

public class Atividade37b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] gabarito = new String[10];

        System.out.println("Professor, digite o gabarito da prova:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Questão " + (i + 1) + ": ");
            gabarito[i] = input.next().toUpperCase();
        }

        int maiorAcerto = 0;
        int menorAcerto = 10;
        int totalAlunos = 0;
        int somaNotas = 0;

        boolean maisAlunos = true;

        while (maisAlunos) {
            int acertos = 0;
            System.out.println("\nResponda a prova:");

            for (int i = 0; i < 10; i++) {
                System.out.print("Questão " + (i + 1) + ": ");
                String resposta = input.next().toUpperCase();
                if (resposta.equals(gabarito[i])) {
                    acertos++;
                }
            }

            System.out.println("Total de acertos: " + acertos);
            System.out.println("Nota: " + acertos);

            totalAlunos++;
            somaNotas += acertos;

            if (acertos > maiorAcerto) {
                maiorAcerto = acertos;
            }
            if (acertos < menorAcerto) {
                menorAcerto = acertos;
            }

            System.out.print("Outro aluno vai utilizar o sistema? (S/N): ");
            String respostaAluno = input.next().toUpperCase();
            if (respostaAluno.equals("N")) {
                maisAlunos = false;
            }
        }

        System.out.println("\nRelatório da Turma:");
        System.out.println("Maior acerto: " + maiorAcerto);
        System.out.println("Menor acerto: " + menorAcerto);
        System.out.println("Total de alunos: " + totalAlunos);
        System.out.printf("Média das notas: %.2f%n", (somaNotas * 1.0 / totalAlunos));

        input.close();
    }
}
