// Autor: Vailson dos Santos Silva
import javax.swing.JOptionPane;

public class Tabuada {

	public static void main(String[] args) {
		// Escolha das Operações
		Object[] opcoes = { "Soma", "Subtração", "Multiplicação", "Divisão" };
		String message = "Tabuada de ";
		String operacaoEsc = "";
		int numInt = 0;
		Object x = JOptionPane.showInputDialog(null, "Operações", "Escolha a operação", 3, null, opcoes, "");
		
		// Escolha do número da Tabuada
		String numero = JOptionPane.showInputDialog(null, "Digite um valor entre 1 e 10", "Número", 3);
		
		//verifica se o campo do número está vazio
		while (numero.equals("") || !(numero.matches("[0-9]+"))){
			numero = JOptionPane.showInputDialog(null, "Numero Inválido!!! Digite um valor entre 1 e 10", "Número", 3);
		}
		numInt = Integer.parseInt(numero);
		// Verifica se o número escolhido é maior do que 10 ou menor do que 1
		while(numInt < 1 || numInt >10) {
			numero = JOptionPane.showInputDialog(null, "Número Inválido!!! Digite um valor entre 1 e 10", "Número", 3);
			while (numero.equals("") || !(numero.matches("[0-9]+"))){
				numero = JOptionPane.showInputDialog(null, "Campo vazio!!! Digite um valor entre 1 e 10", "Número", 3);
			}
			numInt = Integer.parseInt(numero);
		}
		
		// Realiza as Operações e Mostra os a Tabuada escolhida	
		if (x.equals("Soma")) {
			operacaoEsc = "Adição";
			message += operacaoEsc + " do numero " + numero + "\n\n";
			for (int i = 0; i <= 10; i++) {
				message += (i < 10?"  "+i:i) + " + " + numero + " = " + (i + numInt) + "\n";
			}
		} else if (x.equals("Subtração")) {
			operacaoEsc = "Subtração";
			message += operacaoEsc + " do numero " + numero + "\n\n";
			for (int i = numInt; i <= numInt+10; i++) {
				message += (i < 10?"  "+i:i) + " - " + numero + " = " + (i - numInt) + "\n";
			}
		} else if (x.equals("Multiplicação")) {
			operacaoEsc = "Multiplicação";
			message += operacaoEsc + " do numero " + numero + "\n\n";
			for (int i = 0; i <= 10; i++) {
				message += (i < 10?"  "+i:i) + " X " + numero + " = " + (i * numInt) + "\n";
			}
		} else {
			operacaoEsc = "Divisão";
			message += operacaoEsc + " do numero " + numero + "\n\n";
			for (int i = numInt; i <= numInt*10; i+=numInt) {
				message += (i < 10 || (numInt == 10 & i<100) ?"  "+i:i) + " / " + numero + " = " + (i / numInt) + "\n";
			}
		} 

		JOptionPane.showMessageDialog(null, message + "\n");
	}

}
