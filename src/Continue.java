
public class Continue {

	public static void main(String[] args) {
		// Comand Break and continue
		
		System.out.println("Entrou no for");

		for (int i = 0; i <= 15; i++) {
			if (i == 5) {
				System.out.println("Entrou no if e exerceu o break");
				//break;
				continue;
			}
			
			if (i == 10 || i ==12) {
				System.out.println("Entrou no if e exerceu o break");
				//break;
				continue;
			}

			System.out.println(i);
		}

		System.out.println("saiu d o for");

	}

}
