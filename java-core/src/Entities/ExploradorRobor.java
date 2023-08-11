package Entities;

public class ExploradorRobor {

	public String status;
	public int velocidade;
	public double temperatura;
	public String name;
	
	public void  verificarTemperatura() {
		if (temperatura > 45) {
			status = "Retorne para a base";
			velocidade = 5;
		}
	}
	public void exibirAtributos() {
		System.out.println("Status: " + status);
		System.out.println("Status: " + velocidade);
		System.out.println("Status: " + temperatura);
		System.out.println("Status " + status);
	}
}
