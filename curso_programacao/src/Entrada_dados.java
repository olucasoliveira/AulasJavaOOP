import java.util.Scanner;

public class Entrada_dados {

	public static void main(String[] args) {
		
		
		//Associar ao teclado
		
		Scanner sc = new Scanner(System.in);  //INICIAR
		
		String x;
		System.out.print("Digite um nome:  "); //Parar dar um norte ao usuario
		x= sc.next();
		System.out.println("Você digitou: " +  x);
		
		// sc.next();        para String
		// sc.nextInt();     para inteiro 
		// sc.nextDouble;    para ponto flutuante 
		// sc.nextLine();    para ler o texto até a quebra de linha
		
		String t1, t2, t3;
		
		sc.nextLine(); //Para consumir quebra de linha pendente
		
		System.out.print("Digite algo:  ");
		t1 = sc.nextLine();
		
		System.out.print("Digite algo:  ");
		t2 = sc.nextLine();
		
		System.out.print("Digite algo:  ");
		t3 = sc.nextLine();
		
		System.out.println("Dados digitados:  ");
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		sc.close(); //ENCERRAR

	}

}
