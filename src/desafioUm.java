

public class desafioUm {
	
	public static void main(String[] args) {	
		
//		String str = "kitten";
//		int n = 2;
//		String texto = str;
		//texto = missingChar(str, 0) + missingChar(str, 3);
		//texto = str.substring(0, n) + str.substring(n+1);
//		missingChar("kitten", 1);		
		//texto = texto.replace(0, 0)
		
		missingChar("kitten", 2);
		
		System.out.println(missingChar("kitten", 2));		
		
		
	}
	public static String missingChar(String str, int n) {
		
		return str.substring(0, n) + str.substring(n+1);
		
	}
	
	
	
	
	
	
}
