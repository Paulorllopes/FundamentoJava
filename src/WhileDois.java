import java.util.Scanner;

public class WhileDois {

	public static void main(String[] args) {
		
		//esse while ele usa um scann para receber um n�mero, se o m�mero n�o for zero
		// ele continua no while, se for zero ele para o while

		Scanner entrada = new Scanner(System.in);

		int e;

		System.out.println("Digite 0 para sair");

		while (true) {
			System.out.println("Digite um n�mero inteiro igual ou maior que 1: ");
			e = entrada.nextInt();
			
			if(e == 0)
			{
				System.out.println("Voc� saiu do programa!");
				break;
			}
			else
			{
				System.out.println("Voc� digitou: " + e);
			}
			

		}

	}

}
