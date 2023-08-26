package factoryandsingleton1;

import java.util.ArrayList;

public class Iphone implements FabricanteCelular{

	private static Iphone instance;
	private Print print = Print.getInstance();
	private ArrayList <IphoneX> estoqueIphoneX = new ArrayList<>();
	private ArrayList <IphoneS> estoqueIphoneS = new ArrayList<>();
	
	private Iphone() {
		
	}
	
	public static Iphone getInstance() {
		if(instance == null) instance  = new Iphone();
		return instance;
	}

	@Override
	public void ConstroiCelular(String modelo) {
		if(modelo.equals("Iphone X")) {
			estoqueIphoneX.add(new IphoneX());
			// Método printModeloCriado não respeita o conceito de responsabilidade única,
			// mantido apenas por questões didáticas.
			print.printModeloCriado(modelo);
		} else if(modelo.equals("Iphone S")) {
			estoqueIphoneS.add(new IphoneS());
			print.printModeloCriado(modelo);
		}
	}
	
}
