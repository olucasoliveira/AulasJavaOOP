import javax.swing.JOptionPane;

public class exercicio5 {

	public static void main(String[] args) {
		String num;
		int numero, resultado;
		
		num = JOptionPane.showInputDialog( "Digite um numero: " );
		numero = Integer.parseInt( num );
		
		resultado = numero * numero;
		
		JOptionPane.showMessageDialog(null, "O numero elevado ao quadrado é " + resultado, "Results", 0);	

	}

}
