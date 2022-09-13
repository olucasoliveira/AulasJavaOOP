
public class ex3 {

	public static void main(String[] args) {
		
		int divisores=0;
			
		for(int i = 100; i<150; i++) {
			
			divisores=0;
			
			for (int j = 2; j <= i-1; j++) {
				
				if(i%j == 0) {
					divisores++;
				}
			}
			if (divisores == 0) {
				System.out.println("Numero primo: "+ i);

			}
			
		}
		
	

	}

}
