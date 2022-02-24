import javax.swing.JOptionPane;

public class CalculadoraOptionPane {

	public static void main(String[] args) {

		int escolher;

		while (true) {
			escolher = Integer.parseInt(JOptionPane
					.showInputDialog("Voc� entrou na calculadora! " + "Digite 1 = somar  " + "Digite 2 = subtrair  "
							+ "Digite 3 = multiplicar  " + "Digite 4 = dividir  " + "Digite 5 = sair"));

			if (escolher == 1) {

				int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero da soma:"));
				int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero da soma:")); 
				int valorTotalSoma = soma(valor1, valor2);
				JOptionPane.showMessageDialog(null, "O valor da soma �: " + valorTotalSoma);
				continue;

			}

			else if (escolher == 2) {

				int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero da subtra��o:"));
				int valor4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero da subtra��o:"));
				int valorTotalSub = subtrair(valor3, valor4);
				JOptionPane.showMessageDialog(null, "O valor da subtra��o �: " + valorTotalSub);
				continue;
			}

			else if (escolher == 3) {

				int valor5 = Integer
						.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero da multiplica��o:"));
				int valor6 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero da multipica��o: "));
				int valorTotalMult = multiplicar(valor5, valor6);
				JOptionPane.showMessageDialog(null, "O valor da multiplica��o �: " + valorTotalMult);
				continue;
			}

			else if (escolher == 4) {
				int valor7 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero da divis�o:"));
				int valor8 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero da divis�o:"));
				int valorTotalDiv = dividir(valor7, valor8);
				JOptionPane.showMessageDialog(null, "O valor da divis�o �:" + valorTotalDiv);
				continue;
			}

			else if (escolher == 5) {

				JOptionPane.showMessageDialog(null,
						"Voc� escolheu a op��o 5 para sair! Execute a aplica��o novamente.");
				break;
			}

			else {
				JOptionPane.showMessageDialog(null, "Voc� escolheu um n�mero inv�lido, escolha um n�mero v�lido.");
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
