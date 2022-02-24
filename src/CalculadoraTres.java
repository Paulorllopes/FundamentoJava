import java.util.Scanner;

import classeMetodos.metCalcDois;

public class CalculadoraTres {

	private metCalcDois metcalcdois;

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);

		int escolher;

		while (true) {
			metCalcDois.mensagem("Você entrou na calculadora! \n" + "Digite 1 para somar: \n"
					+ "Digite 2 para subtrair: \n" + "Digite 3 para multiplicar: \n" + "Digite 4 para dividir: \n"
					+ "Digite 5 para sair da calculadora: ");

			escolher = numero.nextInt();

			if (escolher == 1) {

				metCalcDois.mensagem("Você escolheu 1  somar! \n");
				metCalcDois.mensagem("Escolha um número para somar: ");
				float valor1 = numero.nextFloat();
				metCalcDois.mensagem("Escolha outro número para somar: ");
				float valor2 = numero.nextFloat();
				float valorTotalSoma = metCalcDois.somar(valor1, valor2);
				metCalcDois.mensagem("O resultado da soma é: " + valorTotalSoma + "\n");
				continue;

			} else if (escolher == 2) {

				metCalcDois.mensagem("Você escolheu 2 subtrair! \n");
				metCalcDois.mensagem("Escolha um número para subtrair: ");
				float valor3 = numero.nextFloat();
				metCalcDois.mensagem("Escolha outro número para subtrair: ");
				float valor4 = numero.nextFloat();
				float valorTotalSub = metCalcDois.subtrair(valor3, valor4);
				metCalcDois.mensagem("O resultado da subtração é: " + valorTotalSub + "\n");
				continue;

			} else if (escolher == 3) {

				metCalcDois.mensagem("Você escolheu 3 multiplicar! \n");
				metCalcDois.mensagem("Escolha um número para multiplicar: ");
				float valor5 = numero.nextFloat();
				metCalcDois.mensagem("Escolha outro número para multiplicar: ");
				float valor6 = numero.nextFloat();
				float valorTotalMult = metCalcDois.multiplicar(valor5, valor6);
				metCalcDois.mensagem("O resultado da multiplicação é: " + valorTotalMult + "\n");
				continue;
			} else if (escolher == 4) {

				metCalcDois.mensagem("Você escolheu 4 dividir! \n");
				metCalcDois.mensagem("Escolha um número para dividir: ");
				float valor7 = numero.nextFloat();
				metCalcDois.mensagem("Escolha outro número para dividir: ");
				float valor8 = numero.nextFloat();
				float valorTotalDividir = metCalcDois.dividir(valor7, valor8);
				metCalcDois.mensagem("O resultado da divisão é: " + valorTotalDividir + "\n");
				continue;

			} else if (escolher == 5) {

				metCalcDois.mensagem("Você optou por sair da calculadora! \n"
						+ "Reinicie o programa novamente para efetuar novos calcúlos. \n");
				break;

			} else {
				metCalcDois.mensagem(
						"Você escolhou um número inválido! \n" + "Olhe o menu novamente e escolha um número válido! \n");
				continue;
			}
		}

	}

}
