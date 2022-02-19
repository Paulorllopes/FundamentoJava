
public class metodoQPassaVlr {

	public static void main(String[] args) {
		Mensagem("Soma: ");
		int valorTotal = soma(1, 2);
		Mensagem("O resultado da soma é: " + Integer.toString(valorTotal));

	}

	static void Mensagem(String m) {
		System.out.println(m);
	}

	static int soma(int a, int b) {
		int c = a + b;
		return c;
	}

}
