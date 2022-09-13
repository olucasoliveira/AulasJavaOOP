import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		int voto, votosTotais, cand1, cand2, cand3, cand4, nulo, branco, votacao;
		
		votosTotais=0;
		cand1=0;
		cand2=0;
		cand3=0;
		cand4=0;
		branco=0;
		nulo=0;
		
		Scanner sc = new Scanner (System.in);

		
		do {
			System.out.printf("\nEscolha sua opção: \n\n[1] Votar no candidato 1 \n[2] Votar no candidato 2 \n[3] Votar no candidato 3 \n[4] Votar no candidato 4 \n[5] Nulo \n[6] Branco \n[0] Finalizar a votação \n\nOpção escolhida: ");
			voto = sc.nextInt();
					
			if(voto == 1) {
				cand1++;
				votosTotais++;
			}
			if(voto == 2) {
				cand2++;
				votosTotais++;
			}
			if(voto == 3) {
				cand3++;
				votosTotais++;
			}
			if(voto == 4) {
				cand4++;
				votosTotais++;
			}
			if(voto == 5) {
				nulo++;
				votosTotais++;
			}
			if(voto == 6) {
				branco++;
				votosTotais++;
			}
			if(voto > 6 && voto <0){
				System.out.printf("Voto invalido, não contabilizado\n");
			}
			
		}while(voto != 0);
		
		double dados1 = (cand1 * 100)/votosTotais;
		System.out.printf("\nCanditado 1: Votos: %d ou %.2f porcento dos votos totais", cand1, dados1);
		
		double dados2 = (cand2 * 100)/votosTotais;
		System.out.printf("\nCanditado 2: Votos: %d ou %.2f porcento dos votos totais", cand2, dados2);
		
		double dados3 = (cand3 * 100)/votosTotais;
		System.out.printf("\nCanditado 3: Votos: %d ou %.2f porcento dos votos totais", cand3, dados3);
		
		double dados4 = (cand4 * 100)/votosTotais;
		System.out.printf("\nCanditado 4: Votos: %d ou %.2f porcento  dos votos totais", cand4, dados4);
		
		double dadosBranco = (branco * 100)/votosTotais;
		System.out.printf("\nBranco     : Votos: %d ou %.2f porcento  dos votos totais", branco, dadosBranco);
		
		double dadosNulo = (nulo * 100)/votosTotais;
		System.out.printf("\nNulo       : Votos: %d ou %.2f porcento  dos votos totais", nulo, dadosNulo);
		
		
		voto = sc.nextInt();
		
		
	
		
		
		
		
		
		sc.close();
	}

}
