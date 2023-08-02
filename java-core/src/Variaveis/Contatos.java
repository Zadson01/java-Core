package Variaveis;

import java.util.Scanner;

public class Contatos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		String email;
		long telefone;
		char x;
		
		
		System.out.println("Insira o seu nome: ");
		name = sc.next();
		System.out.println("Insira o seu e-mail: ");
		email = sc.next();
		System.out.println("Insira o seu telefone: ");
		telefone = sc.nextLong();
		System.out.printf("Nome: %s %s%n %d%n",name, email, telefone);
        x = sc.next().charAt(0);
		sc.close();
	}

}
