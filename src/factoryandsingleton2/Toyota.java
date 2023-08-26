package factoryandsingleton2;
import java.util.ArrayList;

public class Toyota implements IVehicleMaker{

	/*
	 * Declaração da instância usada para retornar um objeto Toyota
	 * no método getInstance().
	 */
	private static Toyota instance;
	private ArrayList <Corolla> estoqueCorolla = new ArrayList<>();
	private ArrayList <Hilux> estoqueHilux = new ArrayList<>();
	private ArrayList <Etios> estoqueEtios = new ArrayList<>();
	
	/*
	 * Construtor vazio e privado para impedir a sua utilização
	 * com o operador "new", que é utilizada apenas no método
	 * getInstance().
	 */
	private Toyota() {
		
	}
	
	/*
	 * O método estático getInstance() assume o papel do construtor e,
	 * como é um método estático, é permitido que ele seja chamado sem
	 * instanciar a classe Toyota. Dessa maneira o método instancia a 
	 * classe Toyota apenas uma vez, mesmo que seja chamado repetidas
	 * vezes, ele irá retornar o objeto já criado.
	 * 
	 */
	public static Toyota getInstance() {
		if(instance == null) instance = new Toyota();
		return instance;
	}

	/*
	 * Método sobrescrito herdado da interface IVehicleMaker, nele são
	 * criado novos objetos relacionados a classe Toyota de acordo com
	 * as regras de negócio do programa: a classe Toyota deve criar apenas
	 * objetos Corolla, Hilux ou Etios.
	 */
	@Override
	public void makeVehicle(String modelo) {
		if(modelo.equals("Corolla")) {
			estoqueCorolla.add(new Corolla());
		} else if(modelo.equals("Hilux")) {
			estoqueHilux.add(new Hilux());
		} else if(modelo.equals("Etios")) {
			estoqueEtios.add(new Etios());
		}
	}
	
	public ArrayList<Corolla> getEstoqueCorolla() {
		return estoqueCorolla;
	}

	public ArrayList<Hilux> getEstoqueHilux() {
		return estoqueHilux;
	}

	public ArrayList<Etios> getEstoqueEtios() {
		return estoqueEtios;
	}
	
}
