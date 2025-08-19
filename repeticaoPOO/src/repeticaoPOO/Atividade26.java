package repeticaoPOO;
import java.text.DecimalFormat;

public class Atividade26 {
    public static void main(String[] args) {
        
        System.out.println("Panificadora Pão de Ontem - Tabela preços");
        double preco = 0;
        DecimalFormat df = new DecimalFormat("0.00");
        
        for (int i = 1; i <= 50; i++) {
            preco += 0.18;
            System.out.println(i + " - R$ " + df.format(preco));
        }
    }
}