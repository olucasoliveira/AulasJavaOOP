import javax.swing.JOptionPane;

public class exercicio2 {

	public static void main(String[] args) {
	 String qtde1, valor1, qtde2, valor2, qtde3, valor3;
	 
	 int quant1, quant2, quant3, val1, val2, val3, resultado;
	 
	 qtde1 =JOptionPane.showInputDialog( "Primeira quantidade: " );
	 valor1 =JOptionPane.showInputDialog( "Primeiro valor:" );
	 qtde2 =JOptionPane.showInputDialog( "Segunda quantidade:" );
	 valor2 =JOptionPane.showInputDialog( "Segundo valor:" );
	 qtde3 =JOptionPane.showInputDialog( "Terceira quantidade:" );
	 valor3 =JOptionPane.showInputDialog( "Terceiro valor: " );
	 
	 quant1 = Integer.parseInt( qtde1 );
	 quant2 = Integer.parseInt( qtde2 );
	 quant3 = Integer.parseInt( qtde3 );
	 val1 = Integer.parseInt( valor1 );
	 val2 = Integer.parseInt( valor2 );
	 val3 = Integer.parseInt( valor3 );
	 
	 resultado = (quant1*val1 )+ (quant2*val2) + (quant3*val3);
	 
	 JOptionPane.showMessageDialog(null, "Resultado é " + resultado, "Results", 0);	

	}

}
