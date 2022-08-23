//   1) Escreva um programa que leia três nomes e em
//   seguida os imprima na tela.


import javax.swing.JOptionPane;

public class exercicio {

	public static void main(String[] args) {
		String nome1, nome2, nome3, nomes;
		
		nome1 =JOptionPane.showInputDialog( "Primeiro nome:" );
		nome2 =JOptionPane.showInputDialog( "Segundo nome:" );
		nome3 =JOptionPane.showInputDialog( "Terceiro nome:" );
		
		nomes = nome1 +", "+nome2+", "+nome3;
		
		JOptionPane.showMessageDialog(null, "Os nomes são: " + nomes, "Results", 0);

	}

}
