package Variaveis;

public class Introducao {

	public static void main(String[] args) {
		//Variaveis locais.
		
		int lapis = 0;
		float leite = 4;
		double cafe = 4.5;
		double x = 10.35784;
		
		System.out.println(x);
		System.out.printf("%.2f%n" + "Metros = ", x);
		System.out.printf("%.4f%n", x);
		System.out.printf("Resultado = %.2f metros%n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade ,renda);
	}

}
