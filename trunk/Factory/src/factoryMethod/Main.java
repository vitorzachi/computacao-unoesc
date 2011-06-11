package factoryMethod;

public class Main {

	public static void main(String args[]){
		LojaPizza lojaPizza = new PSPizza();
		lojaPizza.prepararPizza("portuguesa");

		LojaPizza lojaPizza1 = new XXEPizza();
		lojaPizza1.prepararPizza("portuguesa");
	}
}
