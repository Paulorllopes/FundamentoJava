
public class sobrecargaMetodos {

	public static void main(String[] args) {
		
		//ligar tv no canal 3 = canal 3 default
		
		System.out.println("Ligar TV no canal 3 por default: " + LigarTv());
		
		//ligar tv no canal que eu escolher como parâmetro
		
		System.out.println("Ligar TV no canal 100 escolhendo o parâmetro: " +LigarTv(100));
		
		

	}
	
	public static int LigarTv() {
		int canal = 3; // variável int é o default
		return canal;
	}
	
	public static int LigarTv(int a) { // variável int no parâmetro para escolher o canal
		
	int canal = a;
	return canal;
		
	}

}
