package Entities;

public class Triangulo {
 /*Atributos da classe*/
	
	public double ladoA;
	public double ladoB;
	public double ladoC;
	
	/*Método área*/
	public double area() {
		double pX = (ladoA + ladoB + ladoC)/2;
		/*CALCULAR ÁREA DE X*/
		return Math.sqrt(pX*(pX -ladoA)*(pX - ladoB)*(pX -ladoC));
		
	}
	
}
