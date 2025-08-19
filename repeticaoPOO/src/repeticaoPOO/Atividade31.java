package repeticaoPOO;
import java.util.Scanner;

public class Atividade31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int codigo, altura, codigoAlto = 0, alturaAlto = Integer.MIN_VALUE, codigoBaixo = 0, alturaBaixo = Integer.MAX_VALUE;
		
		for (int i = 1; i <= 10; i ++) {
			codigo = i;
			System.out.print("Informe a altura (em CM) do aluno " + codigo + ": ");
			altura = input.nextInt();
			
			if (altura > alturaAlto) {
				codigoAlto = codigo;
				alturaAlto = altura;
			}
			
			if (altura < alturaBaixo) {
				codigoBaixo = codigo;
				alturaBaixo = altura;
			}
		}
		
		System.out.println("\nAluno mais alto: aluno - " + codigoAlto + " / " + alturaAlto + " cm");
		System.out.println("Aluno mais baixo: aluno - " + codigoBaixo + " / " + alturaBaixo + " cm");
		
        input.close();
	}

}
