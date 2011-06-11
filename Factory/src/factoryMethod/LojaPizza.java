package factoryMethod;

public abstract class LojaPizza {

	public final Pizza prepararPizza(String tipo){
		Pizza pizza = criarPizza(tipo);

		pizza.prepare();
		pizza.assar();
		pizza.cortar();
		pizza.empacotar();

		return pizza;
	}

	abstract Pizza criarPizza(String tipo);

}
