import classeMetodos.metCalcDois;

public class metodosStaticXObjeto {
	
	public static void main(String[] args) {
		
		//OBS: Consigo utilizar os métodos static sem precisar
		// criar um objeto da clase metCalcDois
		
		float div = metCalcDois.dividir(4, 2);
		float mult = metCalcDois.multiplicar(2, 2);
		float som = metCalcDois.somar(3, 3);
		float sub = metCalcDois.subtrair(3, 2);
		metCalcDois.mensagem("A valor da divisão é: " + div);
		metCalcDois.mensagem("A valor da multiplicação é: " + mult);
		metCalcDois.mensagem("A valor da soma é: " + som);
		metCalcDois.mensagem("A valor da subtração é: " + sub);
		
		metCalcDois.mensagem("");
		
		//OBS: Se quiser utilizar um método que não seja static
		//preciso criar um objeto da classe metCalcDois conforme abaixo
		
		metCalcDois met = new metCalcDois();
		met.escrever("Essa mensagem foi impressa utilizando \n"
				+ "um método não static da classe metCalcDois, o método \n"
				+ "é do tipo void, foi instanciada a classe metCalcDois \n"
				+ "aqui no método main, criando o objeto (met) para imprimir \n"
				+ "essa mensagem.");
		
		//conclusão: Só é possível chamar um método não static se você criar um objeto
		
		
	}

}
