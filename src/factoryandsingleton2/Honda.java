package factoryandsingleton2;
import java.util.ArrayList;

public class Honda implements IVehicleMaker{

	/*
	 * Declaração da instância usada para retornar um objeto Honda
	 * no método getInstance().
	 */
	private static Honda instance;
	private ArrayList <City> estoqueCity = new ArrayList<>();
	private ArrayList <Fit> estoqueFit = new ArrayList<>();
	private ArrayList <Civic> estoqueCivic = new ArrayList<>();
	
	/*
	 * Construtor vazio e privado para impedir a sua utilização
	 * com o operador "new", que é utilizada apenas no método
	 * getInstance().
	 */
	private Honda() {
		
	}
	
	/*
	 * O método estático getInstance() assume o papel do construtor e,
	 * como é um método estático, é permitido que ele seja chamado sem
	 * instanciar a classe Toyota. Dessa maneira o método instancia a 
	 * classe Toyota apenas uma vez, mesmo que seja chamado repetidas
	 * vezes, ele irá retornar o objeto já criado.
	 */
	public static Honda getInstance() {
		if(instance == null) instance = new Honda();
		return instance;
	}
	
	/*
	 * Método sobrescrito herdado da interface IVehicleMaker, nele são
	 * criado novos objetos relacionados a classe Honda de acordo com
	 * as regras de negócio do programa: a classe Honda deve criar apenas
	 * objetos City, Civic ou Fit.
	 */
	@Override
	public void makeVehicle(String modelo) {
		if(modelo.equals("City")) {
			estoqueCity.add(new City());
		} else if(modelo.equals("Civic")) {
			estoqueCivic.add(new Civic());
		} else if(modelo.equals("Fit")) {
			estoqueFit.add(new Fit());
		}
	}

	public ArrayList<City> getEstoqueCity() {
		return estoqueCity;
	}

	public ArrayList<Fit> getEstoqueFit() {
		return estoqueFit;
	}


	public ArrayList<Civic> getEstoqueCivic() {
		return estoqueCivic;
	}
	
}
