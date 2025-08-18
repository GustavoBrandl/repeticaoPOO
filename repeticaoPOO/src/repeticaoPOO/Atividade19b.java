package repeticaoPOO;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Atividade19b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
        int p = input.nextInt();
        List<Integer> prime_list = new ArrayList<Integer>();

        boolean is_prime;
        int division_count = 0;
        System.out.print("Primos entre 1 e "+ p +": ");
        for (int i = 2; i <= p; i++) {
            is_prime = true;
            for (int divider : prime_list) {
                if (divider > Math.sqrt(i)) {
                    break;
                }
                division_count++;
                if (i % divider == 0) {
                    is_prime = false;
                    break;
                }
            }
            if (is_prime) {
                prime_list.add(i);
                System.out.print("["+ i +"]");
            }
        }
        System.out.print("\nQuantidade de divisões realizadas: "+ division_count);
        
        input.close();
	}

}
