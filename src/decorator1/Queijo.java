package decorator1;

public class Queijo extends Decorator{
	
	public Queijo(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public double precoPizza() {
		return (pizza.precoPizza() + 15.0);
	}
	
	@Override
	public String getTipoPizza() {
		return pizza.getTipoPizza() + " com queijo";
	}
}
