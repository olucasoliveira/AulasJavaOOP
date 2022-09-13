import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		double valor, precoMax= 0, precoMin= 0, valorTotal=0;
		
		Scanner sc = new Scanner (System.in);
		
		for (int i =1; i <= 15; i++) {
			System.out.printf("Digite o valor do produto %d: ", i);
			valor = sc.nextDouble();
			 
			if (valor > precoMax) {
				precoMax = valor;
			}
			if (i == 1) {
				precoMin = valor;
			}
			if(valor < precoMin) {
				precoMin = valor;
			}
			valorTotal=valorTotal+valor;
		}
		double media = valorTotal/15;
		System.out.printf("\n\nDADOS \nMenos valor: %.2f \nMaior valor: %.2f \nMédia de valor: %.2f", precoMin, precoMax, media );
		
		
		sc.close();
	}

}
