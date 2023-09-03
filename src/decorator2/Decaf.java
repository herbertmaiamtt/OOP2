package decorator2;

public class Decaf implements Cafe{
	
	@Override
	public double calculaCusto() {
		return 15.0;
	}

	@Override
	public String getDescricao() {
		return "Cafe descafeinado";
	}
	
}
