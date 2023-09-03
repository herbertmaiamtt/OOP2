package decorator1;

public class Pizzaria {

	public static void main(String[] args) {

		Pizza pizza1 = new MassaExpessa();
		Pizza pizza2 = new MassaFina();
		
		Pizza pizzaQueijo = new Queijo(pizza1);
		Pizza pizzaTomate = new Tomate(pizza2);
		
		System.out.println(pizzaQueijo.getTipoPizza());
		System.out.println(pizzaQueijo.precoPizza());
		System.out.println(pizzaTomate.getTipoPizza());
		System.out.println(pizzaTomate.precoPizza());
		
	}

}
