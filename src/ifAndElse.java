
public class ifAndElse {

	public static void main(String[] args) {
		
		// if
		System.out.println("         ");
		int a = 10;
		if(a == 10)
		{
			System.out.println("A é igual a 10");
		}
		
		// if
		System.out.println("         ");
		if(a != 11)
		{
			System.out.println("A é diferente de 11");
		}
		
		//if and else
		System.out.println("         ");
		
		String nome = "Paulo";
		if(nome == "Paulo")
		{
			System.out.println("My name is Paulo");
		}
		else
		{
			System.out.println("My name is not Paulo");
		}
		
		//if and else
		System.out.println("         ");
		
		int valor1 = 1;
		int valor2 = 2;
		
		if(valor1 > valor2)
		{
			System.out.println("valor 1 maior");
		}
		else
		{
			System.out.println("valor 2 é maior");
		}
		
		//if and else mixed
		System.out.println("         ");
		
		double score = 9.5;
		char graduacao;
		
		if(score >= 9.5) {
			graduacao = 'A';
			System.out.println("A sua média de nota é igual a " + score + ", a sua graduação é do tipo " 
			+ graduacao + ", você é acima da média, quase um gênio!");
		}
		
		else if(score >= 7.5)
		{
			graduacao = 'B';
			System.out.println("A sua média de nota é igual a " + score + ", a sua graduação é do tipo " 
			+ graduacao + ", você passou bem!");
	
		}
		else if(score >= 5)
		{
			graduacao = 'C';
			System.out.println("A sua média de nota é igual a " + score + ", a sua graduação é do tipo " 
			+ graduacao + ", você passou com a corda no pescoço!");
		}
		else if(score < 5)
		{
			graduacao = 'D';
			System.out.println("A sua média de nota é igual a " + score + ", a sua graduação é do tipo " 
			+ graduacao + ", Você não é graduado, você foi pro bar!");
		}
		
		System.out.println("         ");
		
		//if e else normal sem chaves {}
		
		a = 3; 
		int b = 2;
		 
		if(a > b)
			System.out.println("A é maior");
		else
			System.out.println("B é maior");
		
		System.out.println("         ");
		
		//if and else com operador tenário ?
		
		System.out.println(a > b ? "A é maior" : "B é maior");
		
		System.out.println("         ");
		
		//outra forma de usar if and else com operador tenário
		String c = (a > b) ? "A é maior" : "B é maior";
		System.out.println(c);
		
		System.out.println("         ");
		
		//operadores logicos e relacionais
		
		double salario = 750;
		
		if(salario < 500)
			salario = salario + 50; //soma salario mais 50
		else if ((salario >= 500) && (salario < 600))
			salario += 100; //soma salario mais 100
		else if((salario >= 600) && (salario < 700))
			salario = salario + 110; //soma salario mais 110
		else
			salario +=250; //soma salario mais 250
		System.out.println(salario);
		
		System.out.println("         ");
		
		
		
		

	}

}