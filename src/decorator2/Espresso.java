package decorator2;

public class Espresso implements Cafe{

	@Override
	public double calculaCusto() {
		return 10.0;
	}

	@Override
	public String getDescricao() {
		return "Cafe expresso";
	}
	
}
