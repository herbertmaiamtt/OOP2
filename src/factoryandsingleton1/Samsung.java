package factoryandsingleton1;

import java.util.ArrayList;

public class Samsung implements FabricanteCelular{
	
	private static Samsung instance;
	private Print print = Print.getInstance();
	private ArrayList <Galaxy8> estoqueGalaxy8 = new ArrayList<>();
	private ArrayList <Galaxy20>estoqueGalaxy20 = new ArrayList<>();
	
	private Samsung() {
		
	}
	
	public static Samsung getInstance() {
		if(instance == null) instance = new Samsung();
		return instance;
	}

	@Override
	public void ConstroiCelular(String modelo) {
		if(modelo.equals("Galaxy 8")) {
			estoqueGalaxy8.add(new Galaxy8());
			// Método printModeloCriado não respeita o conceito de responsabilidade única,
			// mantido apenas por questões didáticas.
			print.printModeloCriado(modelo);
			
		} else if(modelo.equals("Galaxy 20")) {
			estoqueGalaxy20.add(new Galaxy20());
			print.printModeloCriado(modelo);
		}
	}
	
}
