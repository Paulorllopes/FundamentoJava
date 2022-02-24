import javax.swing.JOptionPane;

public class OptionPane {

	public static void main(String[] args) {
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero da soma:"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero "));		
		int valorTotal = somar(valor1, valor2);
		JOptionPane.showMessageDialog(null, "Valor da soma é: " + valorTotal);
		
		
		
			
		//String primeiroNumero =  JOptionPane.showInputDialog("Digite o primeiro numero da soma:");		
		//String segundoNumero = JOptionPane.showInputDialog("digite o segundo numero ");
		//Integer.parseInt(primeiroNumero);
		//Integer.parseInt(segundoNumero);
	
		//String valorTotal = primeiroNumero + segundoNumero;
		//mensagem(valorTotal);
			
				
		
		

	}
	
	public static int somar(int a, int b) {
		int c = a + b;
		return c;
	}
	
	
}
