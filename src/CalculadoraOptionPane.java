import javax.swing.JOptionPane;

public class CalculadoraOptionPane {

	public static void main(String[] args) {

		int escolher;

		while (true) {
			escolher = Integer.parseInt(JOptionPane
					.showInputDialog("Você entrou na calculadora! " + "Digite 1 = somar  " + "Digite 2 = subtrair  "
							+ "Digite 3 = multiplicar  " + "Digite 4 = dividir  " + "Digite 5 = sair"));

			if (escolher == 1) {

				int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero da soma:"));
				int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero da soma:")); 
				int valorTotalSoma = soma(valor1, valor2);
				JOptionPane.showMessageDialog(null, "O valor da soma é: " + valorTotalSoma);
				continue;

			}

			else if (escolher == 2) {

				int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero da subtração:"));
				int valor4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero da subtração:"));
				int valorTotalSub = subtrair(valor3, valor4);
				JOptionPane.showMessageDialog(null, "O valor da subtração é: " + valorTotalSub);
				continue;
			}

			else if (escolher == 3) {

				int valor5 = Integer
						.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero da multiplicação:"));
				int valor6 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero da multipicação: "));
				int valorTotalMult = multiplicar(valor5, valor6);
				JOptionPane.showMessageDialog(null, "O valor da multiplicação é: " + valorTotalMult);
				continue;
			}

			else if (escolher == 4) {
				int valor7 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero da divisão:"));
				int valor8 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero da divisão:"));
				int valorTotalDiv = dividir(valor7, valor8);
				JOptionPane.showMessageDialog(null, "O valor da divisão é:" + valorTotalDiv);
				continue;
			}

			else if (escolher == 5) {

				JOptionPane.showMessageDialog(null,
						"Você escolheu a opção 5 para sair! Execute a aplicação novamente.");
				break;
			}

			else {
				JOptionPane.showMessageDialog(null, "Você escolheu um número inválido, escolha um número válido.");
				continue;
			}
		}

	}

	public static int soma(int a, int b) {
		int c = a + b;
		return c;
	}

	public static int subtrair(int a, int b) {
		int c = a - b;
		return c;
	}

	public static int multiplicar(int a, int b) {
		int c = a * b;
		return c;
	}

	public static int dividir(int a, int b) {
		int c = a / b;
		return c;
	}

}
