import java.util.Scanner;

public class repeticoes {

	public static void main(String[] args) {
		
		// while ( condição ){
		// 		<comando>
		// }
		
		// do {
		// 		<Comando>
		// } while ( condição );
		
		
		// for ( inicio ; condição ; incremento ){
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
