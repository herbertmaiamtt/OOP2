package decorator1;

public class MassaExpessa implements Pizza{

	@Override
	public double precoPizza() {
		return 65.0;
	}

	@Override
	public String getTipoPizza() {
		return "Pizza massa expessa";
	}
	
}
