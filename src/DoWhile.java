
public class DoWhile {

	public static void main(String[] args) {
		
		//estrutura de repeticao do while
		//o DoWhile faz a comparacao apenas no final do codigo
		//o while primeiro faz a compraracao depois roda o codigo
		
		int contador = 0;
		
		do {
			
			System.out.println(contador);
			contador++;
			
		}while(contador <= 20);
		
		//exercicio de comparacao
		
		int i = 0;
		
		System.out.println("   ");
		
		System.out.println("Estrutura do while:");
		
		while(i <= 5) {
			System.out.println("Interaçãao " + ++i);
		}
		
		// i++ ele incrementa posteriormente
		// ++i primeiro incrementa
		
		System.out.println("   ");
		
		System.out.println("Estrutura do while:");
		
		i = 5;
		
		do {
			System.out.println("Interaçãao " + i--);
		}while(i >= 0);
		

	}

}
