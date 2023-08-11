package Test;

import java.util.Scanner;

import Entities.ExploradorRobor;

public class RoboTeste {

	public static void main(String[] args) {
		  Scanner  px = new Scanner(System.in);
		  
		  ExploradorRobor beta = new ExploradorRobor();
		  ExploradorRobor omega = new ExploradorRobor();
		  
		  System.out.println("Qual o nome do robo: ");
		  beta.name = px.next();
		  System.out.println("Qual Status do robô: ");
		  beta.status = px.next();
		  System.out.println("Qual é a velocidade: ");
		  beta.velocidade = px.nextInt();
		  
		  
		  
		  
		  

	}

}
