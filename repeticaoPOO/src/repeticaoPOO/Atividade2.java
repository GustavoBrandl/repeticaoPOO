package repeticaoPOO;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe seu nome de usuario: ");
		String username = input.nextLine();
		
		System.out.print("Informe sua senha: ");
		String password = input.nextLine();
		
		while (username.equals(password)) {
			System.out.print("\nNome de usuario igual a senha. Mude!\n");
			
			System.out.print("Informe seu nome de usuario: ");
			username = input.nextLine();
			
			System.out.print("Informe sua senha: ");
			password = input.nextLine();
		}
		
		System.out.println("\n\nUsuario criado com suscesso!");
		
		input.close();
	}

}
