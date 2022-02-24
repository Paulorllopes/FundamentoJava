import classeMetodos.metCalcDois;

public class metodosStaticXObjeto {
	
	public static void main(String[] args) {
		
		//OBS: Consigo utilizar os m�todos static sem precisar
		// criar um objeto da clase metCalcDois
		
		float div = metCalcDois.dividir(4, 2);
		float mult = metCalcDois.multiplicar(2, 2);
		float som = metCalcDois.somar(3, 3);
		float sub = metCalcDois.subtrair(3, 2);
		metCalcDois.mensagem("A valor da divis�o �: " + div);
		metCalcDois.mensagem("A valor da multiplica��o �: " + mult);
		metCalcDois.mensagem("A valor da soma �: " + som);
		metCalcDois.mensagem("A valor da subtra��o �: " + sub);
		
		metCalcDois.mensagem("");
		
		//OBS: Se quiser utilizar um m�todo que n�o seja static
		//preciso criar um objeto da classe metCalcDois conforme abaixo
		
		metCalcDois met = new metCalcDois();
		met.escrever("Essa mensagem foi impressa utilizando \n"
				+ "um m�todo n�o static da classe metCalcDois, o m�todo \n"
				+ "� do tipo void, foi instanciada a classe metCalcDois \n"
				+ "aqui no m�todo main, criando o objeto (met) para imprimir \n"
				+ "essa mensagem.");
		
		//conclus�o: S� � poss�vel chamar um m�todo n�o static se voc� criar um objeto
		
		
	}

}
