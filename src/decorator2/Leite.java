package decorator2;

public class Leite extends Decorator{
	
	public Leite(Cafe cafe) {
		super(cafe);
	}
	
	@Override
	public double calculaCusto() {
		return cafe.calculaCusto() + 3.0;
	}
	
	@Override
	public String getDescricao() {
		return cafe.getDescricao() + " com leite";
	}
	
}
