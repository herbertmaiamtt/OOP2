package decorator2;

public class Decorator implements Cafe{

	Cafe cafe;
	
	public Decorator(Cafe cafe) {
		this.cafe = cafe;
	}
	
	@Override
	public double calculaCusto() {
		return cafe.calculaCusto();
	}

	@Override
	public String getDescricao() {
		return cafe.getDescricao();
	}

	
	
}
