package decorator1;

public class MassaFina implements Pizza{

	@Override
	public double precoPizza() {
		return 55.0;
	}

	@Override
	public String getTipoPizza() {
		return "Pizza massa fina";
	}

}
