package Aplication;

import Entities.ExploradorRobor;

public class StartRobot {

	public static void main(String[] args) {

		ExploradorRobor alpha = new ExploradorRobor();
		alpha.status = "Explorando";
		alpha.velocidade = 7;
		alpha.temperatura = 20;
		System.out.println("_______________________");
		alpha.exibirAtributos();
		System.out.println("Aumentado a velocidade para 8");
		alpha.velocidade = 8;
	    alpha.exibirAtributos();
	    System.out.println("alterar a temperatura para 47");
	    alpha.temperatura = 47;
	    alpha.verificarTemperatura();
	    alpha.exibirAtributos();
		
	}

}
