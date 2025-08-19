package repeticaoPOO;
import java.util.Scanner;

public class Atividade30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigo;
        double altura, peso;
        double somaAlturas = 0, somaPesos = 0;
        int contador = 0;

        int codMaisAlto = 0, codMaisBaixo = 0, codMaisGordo = 0, codMaisMagro = 0;
        double maiorAltura = Double.MIN_VALUE, menorAltura = Double.MAX_VALUE;
        double maiorPeso = Double.MIN_VALUE, menorPeso = Double.MAX_VALUE;

        do {
            System.out.print("Digite o código do cliente (0 para encerrar): ");
            codigo = input.nextInt();

            if (codigo != 0) {
                System.out.print("Digite a altura do cliente: ");
                altura = input.nextDouble();

                System.out.print("Digite o peso do cliente: ");
                peso = input.nextDouble();

                somaAlturas += altura;
                somaPesos += peso;
                contador++;

                if (altura > maiorAltura) {
                    maiorAltura = altura;
                    codMaisAlto = codigo;
                }
                if (altura < menorAltura) {
                    menorAltura = altura;
                    codMaisBaixo = codigo;
                }
                if (peso > maiorPeso) {
                    maiorPeso = peso;
                    codMaisGordo = codigo;
                }
                if (peso < menorPeso) {
                    menorPeso = peso;
                    codMaisMagro = codigo;
                }
            }
        } while (codigo != 0);

        if (contador > 0) {
            double mediaAltura = somaAlturas / contador;
            double mediaPeso = somaPesos / contador;

            System.out.println("\n=== Resultado do Senso ===");
            System.out.println("Mais alto: Código " + codMaisAlto + " com " + maiorAltura + "m");
            System.out.println("Mais baixo: Código " + codMaisBaixo + " com " + menorAltura + "m");
            System.out.println("Mais gordo: Código " + codMaisGordo + " com " + maiorPeso + "kg");
            System.out.println("Mais magro: Código " + codMaisMagro + " com " + menorPeso + "kg");
            System.out.println("Média das alturas: " + String.format("%.2f", mediaAltura));
            System.out.println("Média dos pesos: " + String.format("%.2f", mediaPeso));
        } else {
            System.out.println("Nenhum cliente foi registrado.");
        }

        input.close();
    }
}
