package decorator1;

public class Decorator implements Pizza{

	Pizza pizza;
	
	public Decorator(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public double precoPizza() {
		return pizza.precoPizza();
	}

	@Override
	public String getTipoPizza() {
		return pizza.getTipoPizza();
	}

}
