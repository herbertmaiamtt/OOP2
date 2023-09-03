package decorator2;

public class Cafeteria {

	public static void main(String[] args) {
		
		Cafe cafe1 = new Espresso();
		Cafe cafe2 = new Decaf();
		
		Cafe cafeComLeite = new Leite(cafe1); 
		Cafe cafeComCanela = new Canela(cafe2);
		
		System.out.println(cafeComLeite.calculaCusto());
		System.out.println(cafeComLeite.getDescricao());
		
		System.out.println(cafeComCanela.calculaCusto());
		System.out.println(cafeComCanela.getDescricao());
		
	}

}
