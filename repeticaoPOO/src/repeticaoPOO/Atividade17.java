package repeticaoPOO;
import java.util.Scanner;

public class Atividade17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int num = input.nextInt();
        
        System.out.println(testePrimo(num) ? "\n" + num + " é primo" : "\n" + num + " não é primo");
        
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