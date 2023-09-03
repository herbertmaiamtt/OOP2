package decorator2;

public class Canela extends Decorator{
	
	public Canela(Cafe cafe) {
		super(cafe);
	}
	
	@Override
	public double calculaCusto() {
		return cafe.calculaCusto() + 5.0;
	}
	
	@Override
	public String getDescricao() {
		return cafe.getDescricao() +" com canela";
	}
	
}
