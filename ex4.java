import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		double valorCarro, valorTotal, valorParcela;
		int j = 3, parcela;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor do carro: ");
		valorCarro = sc.nextDouble();
		
		System.out.println("Parcelas disponiveis: \n");
		System.out.println("[0] À vista - 20% desconto ");
		
		for(int i= 6 ; i <=60; i +=6) {
			
			System.out.println(i+ " parcelas - juros: "+ j + " %");
			j += 3;
		}
		
		System.out.println("Digite quantas parcelas: ");
		parcela = sc.nextInt();
		j = 0;
		
		if(parcela == 0) {
			
			valorTotal = valorCarro * 0.8;
			System.out.printf("Valor total: %.2f  \n ", valorTotal);
			
			
		}else {
			
			for(int i= 6 ; i <= 60; i +=6) {
				
				j += 3;
				
				if (i == parcela) {
					int juros = 100 + j;
					valorTotal = (valorCarro * juros) /100;
					valorParcela = valorTotal/parcela;
					System.out.printf("Valor total: %.2f \nParcelas: %d \nValor da Parcela: %.2f \nJuros: %d porcento", valorTotal, i, valorParcela, juros);
					
				}
			}
		}
		
		
		
	}

}
