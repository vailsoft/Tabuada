// Autor: Vailson dos Santos Silva
import javax.swing.JOptionPane;

public class Tabuada {

	public static void main(String[] args) {
		// Escolha das Opera��es
		Object[] opcoes = { "Soma", "Subtra��o", "Multiplica��o", "Divis�o" };
		String message = "Tabuada de ";
		String operacaoEsc = "";
		int numInt = 0;
		Object x = JOptionPane.showInputDialog(null, "Opera��es", "Escolha a opera��o", 3, null, opcoes, "");
		
		// Escolha do n�mero da Tabuada
		String numero = JOptionPane.showInputDialog(null, "Digite um valor entre 1 e 10", "N�mero", 3);
		
		//verifica se o campo do n�mero est� vazio
		while (numero.equals("") || !(numero.matches("[0-9]+"))){
			numero = JOptionPane.showInputDialog(null, "Numero Inv�lido!!! Digite um valor entre 1 e 10", "N�mero", 3);
		}
		numInt = Integer.parseInt(numero);
		// Verifica se o n�mero escolhido � maior do que 10 ou menor do que 1
		while(numInt < 1 || numInt >10) {
			numero = JOptionPane.showInputDialog(null, "N�mero Inv�lido!!! Digite um valor entre 1 e 10", "N�mero", 3);
			while (numero.equals("") || !(numero.matches("[0-9]+"))){
				numero = JOptionPane.showInputDialog(null, "Campo vazio!!! Digite um valor entre 1 e 10", "N�mero", 3);
			}
			numInt = Integer.parseInt(numero);
		}
		
		// Realiza as Opera��es e Mostra os a Tabuada escolhida	
		if (x.equals("Soma")) {
			operacaoEsc = "Adi��o";
			message += operacaoEsc + " do numero " + numero + "\n\n";
			for (int i = 0; i <= 10; i++) {
				message += (i < 10?"  "+i:i) + " + " + numero + " = " + (i + numInt) + "\n";
			}
		} else if (x.equals("Subtra��o")) {
			operacaoEsc = "Subtra��o";
			message += operacaoEsc + " do numero " + numero + "\n\n";
			for (int i = numInt; i <= numInt+10; i++) {
				message += (i < 10?"  "+i:i) + " - " + numero + " = " + (i - numInt) + "\n";
			}
		} else if (x.equals("Multiplica��o")) {
			operacaoEsc = "Multiplica��o";
			message += operacaoEsc + " do numero " + numero + "\n\n";
			for (int i = 0; i <= 10; i++) {
				message += (i < 10?"  "+i:i) + " X " + numero + " = " + (i * numInt) + "\n";
			}
		} else {
			operacaoEsc = "Divis�o";
			message += operacaoEsc + " do numero " + numero + "\n\n";
			for (int i = numInt; i <= numInt*10; i+=numInt) {
				message += (i < 10 || (numInt == 10 & i<100) ?"  "+i:i) + " / " + numero + " = " + (i / numInt) + "\n";
			}
		} 

		JOptionPane.showMessageDialog(null, message + "\n");
	}

}
