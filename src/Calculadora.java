import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);

		int escolher;

		while (true) {
			Mensagem("Escolha 1 para Somar: \n" + "Escolha 2 para subtrair: \n" + "Escolha 3 para multiplicar: \n"
					+ "Escolha 4 para dividir:\n" + "Escolha 5 para parar a calculadora: \n");

			escolher = numero.nextInt();

			if (escolher == 1) {

				// Parte da calculadora que soma

				Mensagem("Digite um n�mero inteiro para somar: ");
				float valor1 = numero.nextFloat();
				Mensagem("Digite outro n�mero inteiro para somar: ");
				float valor2 = numero.nextFloat();
				float valorTotal = SomarNumeros(valor1, valor2);
				Mensagem("O n�mero da soma �: " + valorTotal + "\n");
				continue;

			}

			else if (escolher == 2) {

				// Parte da calculadora que subtrair

				Mensagem("Digite um n�mero inteiro para subtrair: ");
				float valor3 = numero.nextFloat();
				Mensagem("Digite outro n�mero inteiro para Subtrair: ");
				float valor4 = numero.nextFloat();
				float valorTotalSub = subtrairNumeros(valor3, valor4);
				Mensagem("O n�mero Total da subtra��o �: " + valorTotalSub + "\n");
				continue;

			} else if (escolher == 3) {

				// Parte da calculadora que Multiplica

				Mensagem("Digite um n�mero inteiro para multiplicar: ");
				float valor5 = numero.nextFloat();
				Mensagem("Digite outro n�mero inteiro para multiplicar: ");
				float valor6 = numero.nextFloat();
				float valorTotalMult = multiplicarNumeros(valor5, valor6);
				Mensagem("O n�mero Total da multiplica��o �: " + valorTotalMult + "\n");
				continue;

			} else if (escolher == 4) {

				// Parte da calculadora que dividi

				Mensagem("Digite um n�mero para dividir: ");
				float valor7 = numero.nextFloat();
				Mensagem("Digite outro n�mero para dividir: ");
				float valor8 = numero.nextFloat();
				float valorTotalDiv = dividirNumeros(valor7, valor8);
				Mensagem("O valor Total da divis�o �: " + valorTotalDiv + "\n");
				continue;

			} else if (escolher == 5) {
				Mensagem("Voc� optou por sair da calculadora! " + "\n" + "Execute-a novamente para reinicia-l�" + "\n");
				break;

			}

			else {
				Mensagem("Voc� n�o digitou um n�mero v�lido! " + "\n");
				continue;
			}
		}

	}

	static void Mensagem(String m) {

		System.out.println(m);
	}

	static float SomarNumeros(float a, float b) {
		float c = a + b;
		return c;
	}

	static float subtrairNumeros(float a, float b) {
		float c = a - b;
		return c;
	}

	static float multiplicarNumeros(float a, float b) {
		float c = a * b;
		return c;
	}

	static float dividirNumeros(float a, float b) {
		float c = a / b;
		return c;
	}

}
