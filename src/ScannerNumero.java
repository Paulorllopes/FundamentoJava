import java.util.Scanner;

public class ScannerNumero {

	public static void main(String[] args) {
		
		System.out.println("Digite um número: ");
		Scanner entrada = new Scanner(System.in); 
		int numero = entrada.nextInt();
		
		System.out.println("O número digitado foi: " + numero);

	}

}
