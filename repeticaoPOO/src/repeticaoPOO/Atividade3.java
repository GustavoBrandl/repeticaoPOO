package repeticaoPOO;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome;
		int tamanho;
		
		do {
			System.out.print("\nInforme seu nome: ");
			nome = input.nextLine();
			tamanho = nome.length();
			
			if(tamanho < 3) {
				System.out.print("Numero de caracteres menor que 3. Tente de novo.\n");
			}
		} while (tamanho < 3);
		
		int idade;
		
		do {
			System.out.print("\nInforme sua idade: ");
			idade = input.nextInt();
			
			if(idade < 0 || idade > 150) {
				System.out.print("Valor invalido. Idade menor que 0 ou maior que 150. Tente de novo.\n");
			}
		} while (idade < 0 || idade > 150);
		
		double salario;
		
		do {
			System.out.print("\nInforme seu salario: ");
			salario = input.nextDouble();
			
			if (salario <= 0) {
				System.out.print("Valor invalido. Salario menor ou igual a 0. Tente de novo.\n");
			}
			
		} while (salario <= 0);
		
		char sexo;
		
		do {
			System.out.print("\nInforme seu sexo (F = feminino OU M = masculino): ");
			sexo = input.next().charAt(0);
			sexo = Character.toUpperCase(sexo);
			
			if (sexo != 'F' && sexo != 'M') {
				System.out.print("Valor invalido. Apenas F ou M\n");
			}
		} while (sexo != 'F' && sexo != 'M');
		
		char estadocivil;
		
		do {
			System.out.print("\nInforme seu estado civil (S = solteiro OU C = casado OU V = viuvo OU D = divorciado): ");
			estadocivil = input.next().charAt(0);
			estadocivil = Character.toUpperCase(estadocivil);
			
			if (estadocivil != 'S' && estadocivil != 'C' && estadocivil != 'V' && estadocivil != 'D') {
				System.out.print("Valor invalido. Apenas S ou C ou V ou D\n");
			}
			
		} while (estadocivil != 'S' && estadocivil != 'C' && estadocivil != 'V' && estadocivil != 'D');
		
		System.out.println("\nCadastro completo.");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + estadocivil);
		
		input.close();
	}

}
