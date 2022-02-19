
import java.util.Calendar;
import java.util.Scanner;

public class ScannerIdade {

	public static void main(String[] args) {
		
		System.out.println("Digite sua idade: ");
		
		Scanner idade = new Scanner(System.in);
		Calendar calendario = Calendar.getInstance();
		
		System.out.println("Você nasceu no ano: " + (calendario.get(Calendar.YEAR) - idade.nextInt()));
	}
	
	

}
