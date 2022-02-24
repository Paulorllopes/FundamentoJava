import java.util.Scanner;

import classeMetodos.metCalcDois;

public class CalculadoraTres {

	private metCalcDois metcalcdois;

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);

		int escolher;

		while (true) {
			metCalcDois.mensagem("Voc� entrou na calculadora! \n" + "Digite 1 para somar: \n"
					+ "Digite 2 para subtrair: \n" + "Digite 3 para multiplicar: \n" + "Digite 4 para dividir: \n"
					+ "Digite 5 para sair da calculadora: ");

			escolher = numero.nextInt();

			if (escolher == 1) {

				metCalcDois.mensagem("Voc� escolheu 1  somar! \n");
				metCalcDois.mensagem("Escolha um n�mero para somar: ");
				float valor1 = numero.nextFloat();
				metCalcDois.mensagem("Escolha outro n�mero para somar: ");
				float valor2 = numero.nextFloat();
				float valorTotalSoma = metCalcDois.somar(valor1, valor2);
				metCalcDois.mensagem("O resultado da soma �: " + valorTotalSoma + "\n");
				continue;

			} else if (escolher == 2) {

				metCalcDois.mensagem("Voc� escolheu 2 subtrair! \n");
				metCalcDois.mensagem("Escolha um n�mero para subtrair: ");
				float valor3 = numero.nextFloat();
				metCalcDois.mensagem("Escolha outro n�mero para subtrair: ");
				float valor4 = numero.nextFloat();
				float valorTotalSub = metCalcDois.subtrair(valor3, valor4);
				metCalcDois.mensagem("O resultado da subtra��o �: " + valorTotalSub + "\n");
				continue;

			} else if (escolher == 3) {

				metCalcDois.mensagem("Voc� escolheu 3 multiplicar! \n");
				metCalcDois.mensagem("Escolha um n�mero para multiplicar: ");
				float valor5 = numero.nextFloat();
				metCalcDois.mensagem("Escolha outro n�mero para multiplicar: ");
				float valor6 = numero.nextFloat();
				float valorTotalMult = metCalcDois.multiplicar(valor5, valor6);
				metCalcDois.mensagem("O resultado da multiplica��o �: " + valorTotalMult + "\n");
				continue;
			} else if (escolher == 4) {

				metCalcDois.mensagem("Voc� escolheu 4 dividir! \n");
				metCalcDois.mensagem("Escolha um n�mero para dividir: ");
				float valor7 = numero.nextFloat();
				metCalcDois.mensagem("Escolha outro n�mero para dividir: ");
				float valor8 = numero.nextFloat();
				float valorTotalDividir = metCalcDois.dividir(valor7, valor8);
				metCalcDois.mensagem("O resultado da divis�o �: " + valorTotalDividir + "\n");
				continue;

			} else if (escolher == 5) {

				metCalcDois.mensagem("Voc� optou por sair da calculadora! \n"
						+ "Reinicie o programa novamente para efetuar novos calc�los. \n");
				break;

			} else {
				metCalcDois.mensagem(
						"Voc� escolhou um n�mero inv�lido! \n" + "Olhe o menu novamente e escolha um n�mero v�lido! \n");
				continue;
			}
		}

	}

}
