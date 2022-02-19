
public class tranningMetodos {

	public static void main(String[] args) {
		nome();
		numeroSoma();
		passarValor();
		mensagem();
	}

	public static String nome() {
		String str = "Paulo";
		System.out.println(str);
		return str;
	}

	public static void numeroSoma() {
		int a = 9;
		int b = 3;
		int c = a + b;
		System.out.println(c);
	}

	static int passarValor() {
		int a = 8;
		int b = 2;
		int c = a + b;
		System.out.println(c);
		return c;
	}

	static void mensagem() {
		System.out.print("Hello Word!");
	}

}
