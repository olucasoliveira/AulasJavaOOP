import java.util.Scanner;

public class repeticoes {

	public static void main(String[] args) {
		
		// while ( condi��o ){
		// 		<comando>
		// }
		
		// do {
		// 		<Comando>
		// } while ( condi��o );
		
		
		// for ( inicio ; condi��o ; incremento ){
		// 		< comando >
		// }
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while ( x != 0 ) {
			x = sc.nextInt();
		}
		
		sc.close();
		
		
	}

}
