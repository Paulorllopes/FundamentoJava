
public class returnEmMetodos {

	public static void main(String[] args) {

		System.out.println(numeroInteiro());
		System.out.println(soma());
		System.out.println(retornaVariavel());
		System.out.println(retornaString() + " Ok!");
		System.out.println(retornaStringDois("Paulo", "Robson"));

	}

	public static int numeroInteiro() {

		return 1;
	}

	public static int soma() {

		return 1 + 5;
	}

	public static int retornaVariavel() {

		int a = 100;
		return a;
	}
	
	public static String retornaString() {
		String sobrenome = "Lopes";
		return "Paulo " + sobrenome;
	}
	
	public static String retornaStringDois(String Nome, String Sobrenome) {
		return Nome + " " + Sobrenome;
	}

}
