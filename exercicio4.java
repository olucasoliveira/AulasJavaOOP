import javax.swing.JOptionPane;

public class exercicio4 {

	public static void main(String[] args) {
		String temperaturaCel;
		int tempCel, tempFah;
		
		temperaturaCel =JOptionPane.showInputDialog( "Temperatura em Celsius: " );
		tempCel = Integer.parseInt( temperaturaCel );
		
		tempFah = (9 * tempCel+ 160) / 5;
		
		JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit é " + tempFah, "Results", 0);	
		
	}

}
