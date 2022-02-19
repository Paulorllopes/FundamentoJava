
public class Break {

	public static void main(String[] args) {
		
		System.out.println("Entrou no for");
		
		//Comando Break
		
		for(int i = 0; i<=15; i++) {
			if(i==5) {
				System.out.println("Entrou no if e exerceu o break");
				break;
			}
			
			System.out.println(i);
		}
		
		System.out.println("saiu do for");

	}

}
