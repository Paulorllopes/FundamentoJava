
public class For {

	public static void main(String[] args) {
		
		System.out.println("For com incremento: ");
		
		for(int i = 0; i <= 10; i++) {
			
			System.out.println("N�mero: " + i);
		}
		
		System.out.println("     ");
		
		System.out.println("For com decremento: ");
		
		for(int i = 10; i >= 0; i-- )
		{
			System.out.println("N�mero: " + i);
			
		}
		
		//For dentro de outro for
		
		System.out.println("     ");
		
		System.out.println("Um for dentro de outro for: ");
		
		for(int i = 0; i <= 4; i++) {
			
			System.out.println("N�meros da istring I: " + i);
			
			for(int a = 4; a >= 0; a--) {
				System.out.println("N�meros da istring A: " + a);
			}
			
		}
		

	}

}
