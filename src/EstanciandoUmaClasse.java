import classeMetodos.metCalcDois;

public class EstanciandoUmaClasse {

	public static void main(String[] args) {

		// estanciando a classe "metCalcDois" e utilizando os metodos "soma" e
		// "mensagem"
		// ao estanciar a classe "metCalcDois" eu criei o objeto "calc"
		// posso criar mais que um objeto, assim como criei o objeto "calculo" abaixo

		metCalcDois calc = new metCalcDois();

		float valor1 = 10;
		float valor2 = 5;

		float valorTotalSoma = calc.somar(valor1, valor2);

		calc.mensagem("Valor da soma é: " + valorTotalSoma);

		metCalcDois calculo = new metCalcDois();

		float valorTotalSomaDois = calculo.somar(valor1, valor2);

		calculo.mensagem("Valor da soma dois é: " + valorTotalSomaDois);

	}

}
