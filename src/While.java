
public class While {

	public static void main(String[] args) {
		
		//while repeti o comando dentro da regra do algorimo
		//Esse while come�a no n�mero zero, ele vai repetir a variavel enquanto 
		// o numero for menor ou igual a vinte
		
		int contador = 0;
		
		while(contador <= 20)
		{
			System.out.println("Numero da repeti��o: " + contador);
			contador++;
		}
		
		System.out.println("  ");
		
		//esse while come�a a repetir a variavel no n�mero vinte, enquanto ela for 
		//menor ou igual a zero ela decrementa
		
		contador = 20;
		
		while(contador >= 0)
		{
			System.out.println("Numero da repeti��o: " + contador);
			contador--;
		}

	}

}
