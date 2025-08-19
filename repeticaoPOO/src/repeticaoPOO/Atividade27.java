package repeticaoPOO;
import java.util.Scanner;

public class Atividade27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean flag = false;
        double valor, total, troco, pago; 
        
        do {
            total = 0;
            System.out.println("=== Início registro ===\n");
            
            do {
                System.out.print("Informe o valor do item (0 para finalizar): ");
                valor = input.nextDouble();
                total += valor;
            } while (valor != 0);
            
            System.out.println("O total a ser pago foi: R$ " + String.format("%.2f", total));
            
            do {
                System.out.print("\nInforme o valor pago: ");
                pago = input.nextDouble();
                
                if (pago < total) {
                    System.out.println("Valor insuficiente! O pagamento deve ser no mínimo R$ " + String.format("%.2f", total));
                }
            } while (pago < total);
            
            troco = pago - total;
            
            if (troco > 0) {
                System.out.println("\nTroco do troco: R$ " + String.format("%.2f", troco));
            } else {
                System.out.println("\nNão há valor de troco");
            }
            
            System.out.print("\nContinuar para o próximo cliente? 0 - Sim | 1 - Não: ");
            int opcao = input.nextInt();
            
            if (opcao == 1) {
                flag = true;
            }
            
        } while (!flag);
        
        System.out.println("\n=== Caixa encerrado ===");
        input.close();
    }
}
