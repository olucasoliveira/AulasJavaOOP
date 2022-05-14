import java.util.Locale;

public class Saida_dados {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 1000.345678;
		String nome = "Maria";
		
		
		
		
		//Imprimir
		
		System.out.println("Hello Word"); //Retire o ln para não quebrar linha 
		System.out.println(y);
		System.out.println(x); //Imprime o numero inteiro 
		
		// Controlar casas decimais 
		
		System.out.printf("%.2f%n", x); // f de formatado, .2f é duas casas decimais 
		
		//Trocar separador decimal de virgular por ponto 
		
		Locale.setDefault(Locale.US);  //Chamar a classe ( java.util.Locale; )
		System.out.printf("%.2f%n", x);
		
		//Concatenar dados com print e println 
		
		System.out.println("Resultado = " + y + " Metros");
		
		//Concatenar dados com printf 
		
		System.out.printf("Resultado = %.2f metros%n", x);
		System.out.printf("Resultado = %.2f metros%n", x);
		
		// %f para ponto flutuante
		// %d para inteiro
		// %s para String
		// %n para quebra de texto
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, y, x);
		
		
		
	}

}
