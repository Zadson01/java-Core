package EstruturaDecisao;

import java.util.Scanner;

public class Se {

	public static void main(String[] args) {
		  Scanner texto = new Scanner(System.in);

	        double valor01, valor02, valor03, valor04, valor05;

	        System.out.println("Informe o valor01: ");
	        valor01 = texto.nextDouble();

	        if (valor01 == 0) {
	            System.out.println("Não pode informar 0");
	            texto.close(); 
	            return; 
	        }

	        System.out.println("Informe o valor02: ");
	        valor02 = texto.nextDouble();

	        if (valor02 == 0) {
	            System.out.println("Não pode informar 0");
	            texto.close(); 
	            return; 
	        }

	        System.out.println("Informe o valor03: ");
	        valor03 = texto.nextDouble();

	        if (valor03 == 0) {
	            System.out.println("Não pode informar 0");
	            texto.close(); 
	            return; 
	        }

	        System.out.println("Informe o valor04: ");
	        valor04 = texto.nextDouble();

	        if (valor04 == 0) {
	            System.out.println("Não pode informar 0");
	            texto.close(); 
	            return; 
	        }

	        System.out.println("Informe o valor05: ");
	        valor05 = texto.nextDouble();

	        if (valor05 == 0) {
	            System.out.println("Não pode informar 0");
	            texto.close();
	            return; 
	        }

	        
	        System.out.printf("Valor 01: %.1f %n", valor01);
	        System.out.printf("Valor 02: %.1f %n", valor02);
	        System.out.printf("Valor 03: %.1f %n", valor03);
	        System.out.printf("Valor 04: %.1f %n", valor04);
	        System.out.printf("Valor 05: %.1f %n", valor05);

	        texto.close(); 
	    }
	}