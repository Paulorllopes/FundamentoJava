import java.util.Scanner;

public class ScannerNumero {

	public static void main(String[] args) {
		
		System.out.println("Digite um n�mero: ");
		Scanner entrada = new Scanner(System.in); 
		int numero = entrada.nextInt();
		
		System.out.println("O n�mero digitado foi: " + numero);

	}

}
