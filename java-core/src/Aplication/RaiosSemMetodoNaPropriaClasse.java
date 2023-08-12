package Aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Calculadora;

public class RaiosSemMetodoNaPropriaClasse {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		
		System.out.println("Enter com o valor do raio: ");
		double raio = sc.nextDouble();
		double c = calc.cincumrencia(raio);
		double v = calc.volume(raio);
		
		System.out.printf("Cincunferencia: %.2f%n",c);
		System.out.printf("Volume: %.2f%n",v);
		System.out.printf("Valor do PI é: %.2f%n",calc.PI);
		
		sc.close();
	}

}
