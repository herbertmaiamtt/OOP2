package decorator1;

public class Tomate extends Decorator{
	
	public Tomate(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public double precoPizza() {
		return pizza.precoPizza() + 10.0;
	}
	
	@Override
	public String getTipoPizza() {
		return pizza.getTipoPizza() + " com tomate";
	}
	
}
