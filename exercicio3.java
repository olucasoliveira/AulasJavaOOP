import javax.swing.JOptionPane;

public class exercicio3 {

	public static void main(String[] args) {
		String valor1, valor2, valor3;
		 
		 int val1, val2, val3, media, somatoria;
		 
		 valor1 =JOptionPane.showInputDialog( "Primeiro valor:" );
		 valor2 =JOptionPane.showInputDialog( "Segundo valor:" );
		 valor3 =JOptionPane.showInputDialog( "Terceiro valor: " );
		 
		 val1 = Integer.parseInt( valor1 );
		 val2 = Integer.parseInt( valor2 );
		 val3 = Integer.parseInt( valor3 );
		 
		 media = (val1+ val2 + val3)/3;
		 somatoria = val1 + val2 + val3;
		 
		 JOptionPane.showMessageDialog(null, "Media é " + media + "\nSomatoria é "+ somatoria, "Results", 0);	
		 

	}

}
