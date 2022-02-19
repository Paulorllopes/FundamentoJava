
public class While {

	public static void main(String[] args) {
		
		//while repeti o comando dentro da regra do algorimo
		//Esse while começa no número zero, ele vai repetir a variavel enquanto 
		// o numero for menor ou igual a vinte
		
		int contador = 0;
		
		while(contador <= 20)
		{
			System.out.println("Numero da repetição: " + contador);
			contador++;
		}
		
		System.out.println("  ");
		
		//esse while começa a repetir a variavel no número vinte, enquanto ela for 
		//menor ou igual a zero ela decrementa
		
		contador = 20;
		
		while(contador >= 0)
		{
			System.out.println("Numero da repetição: " + contador);
			contador--;
		}

	}

}
