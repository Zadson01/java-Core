package Entities;

public class Triangulo {
 /*Atributos da classe*/
	
	public double ladoA;
	public double ladoB;
	public double ladoC;
	
	/*Método área*/
	public double area() {
		double pX = (ladoA + ladoB + ladoC)/2;
		return Math.sqrt(pX*(pX -ladoA)*(pX - ladoB)*(pX -ladoC));
		
	}
	public void triangulolados() {
		 if (ladoA == ladoB && ladoB == ladoC) {
	        System.out.println("O triangulo é equilatero");
	        }
		 else if (ladoA == ladoB || ladoA==ladoC|| ladoC == ladoB ) {
	            System.out.println("O triangulo é Isoceles ");
	        }
		 else{
	            System.out.println("Isso é um escaleno");
	        }
	}
	
	
}
