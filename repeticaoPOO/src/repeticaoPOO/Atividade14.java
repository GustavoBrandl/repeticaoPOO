package repeticaoPOO;
import java.util.Scanner;

public class Atividade14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o n-ésimo termo: ");
        int j = input.nextInt();

        System.out.print("S = ");
        double dSoma = 0;

        for (int i = 1; i <= j; i++) {
            int iN = i;
            int iM = 2 * iN - 1;
            dSoma += (double) iN/iM;

            if (i < j) {
                System.out.print(iN + "/" + iM + " + ");
            } else {
                System.out.print(iN + "/" + iM);
            }
        }
        
        System.out.println("\n\nSoma: " + dSoma);

        input.close();
    }
}