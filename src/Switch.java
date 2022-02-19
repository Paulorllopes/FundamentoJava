
public class Switch {

	public static void main(String[] args) {

		// switch normal

		int a = 15;
		int b = 2;

		switch (a % b) {
		case 0:
			System.out.println("é par");
			break;
		case 1:
			System.out.println("é impar");
			break;
		}

		// switch com default

		System.out.println("      ");

		int idade = 20;

		switch (idade) {
		case 18:
			System.out.println("Tem 18!");
			break;

		case 19:
			System.out.println("Tem 19!");
			break;

		case 20:
			
			idade += 2;//inserindo um incremento de dois 
			System.out.println("Tem " + idade + "!");
			break;

		default:
			System.out.println("Não tem 18, 19 e nem 20, " + "Você tem " + idade + "!");

		}

	}
}
