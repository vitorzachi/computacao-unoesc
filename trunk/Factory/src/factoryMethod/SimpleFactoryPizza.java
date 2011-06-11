package factoryMethod;

public class SimpleFactoryPizza {

	public Pizza criarPizza(String tipo){
		Pizza pizza = null;
		if(tipo.equals("portuguesa")){
			pizza = new PizzaPortuguesa();
		}
		if(tipo.equals("quatroQueijos")){
			pizza = new PizzaQuatroQueijos();
		}
		if(tipo.equals("Kiwi")){
			pizza = new PizzaKiwi();
		}
		if(tipo.equals("alho")){
			pizza = new PizzaAlho();
		}
		return pizza;
	}

}
