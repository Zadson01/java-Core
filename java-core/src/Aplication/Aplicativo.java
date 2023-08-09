package Aplication;

import java.util.Scanner;

import Entities.Triangulo;

public class Aplicativo {

	public static void main(String[] args) {
		double pX;
		double areaX;
    Scanner entrada = new Scanner (System.in);
		Triangulo X = new Triangulo();
		Triangulo Y = new Triangulo();

		System.out.println("Informe o lado A do traingulo X: ");
		X.ladoA = entrada.nextDouble();
		System.out.println("Informe o lado B do traingulo X: ");
		X.ladoB =  entrada.nextDouble();
		System.out.println("Informe o lado C do traingulo X: ");
		X.ladoC =  entrada.nextDouble();
		double areaDeX = X.area();
		System.out.printf("Área: %.2f",areaDeX);
		
		
		/*Interação do triâgulo Y*/
		System.out.println("Informe o lado A do traingulo Y: ");
		Y.ladoA = entrada.nextDouble();
		System.out.println("Informe o lado B do traingulo Y: ");
		Y.ladoB =  entrada.nextDouble();
		System.out.println("Informe o lado C do traingulo Y: ");
		Y.ladoC =  entrada.nextDouble();
		double areaDeY = Y.area();
		System.out.printf("Área: %.2f",areaDeY);
		
		entrada.close();
		
		
		
	}

}
