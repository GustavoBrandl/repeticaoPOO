package repeticaoPOO;
import java.util.Scanner;

public class Atividade18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int num = input.nextInt();
        
        if (testePrimo(num)) {
            System.out.println("\n" + num + " é primo");
        } else {
            System.out.println("\n" + num + " não é primo");
            System.out.print("\nDivisores: ");
            
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        
        input.close();
    }
    
    static boolean testePrimo(int n) {
    	if (n < 2) return false;
    	if (n % 2 == 0) return n == 2;
    	if (n % 3 == 0) return n == 3;
    	
    	for (int i = 5; i <= n / i; i+= 6) {
    		if (n % i == 0 || n % (i + 2) == 0) return false;
    	}
    	
    	return true;
    }
}