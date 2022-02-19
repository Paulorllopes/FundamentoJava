
public class ForEach {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		
		String[] nome = {"Paulo", "Robson", "Nascimento", "Lopes"};
		
		
		System.out.println("Array A com a quantidade de: " + a.length + " índices.");
		System.out.println("   ");
		System.out.println("Números");
		System.out.println("   ");
		
		for(int i : a) {
			
			
			System.out.println("Número do array: " + i);
			
		}
		System.out.println("   ");
		System.out.println("Array Nome com a quantidade de: " + nome.length + " índices.");
		System.out.println("   ");
		System.out.println("Nomes: ");
		System.out.println("   ");
		
		for(String n : nome) {
			
			
			System.out.println("Nome do array: " + n);
		}

	}

}
