package factoryandsingleton2;

public class Print {

	private static Print instance;
	
	private Print() {
		
	}
	
	public static Print getInstance() {
		if(instance == null) instance = new Print();
		return instance;
	}
	
	public void printCreatedVehicle(String modelo) {
		System.out.println("Modelo " + modelo + " criado com sucesso!\n");
	}
	
}
