package factoryandsingleton1;

public class Print {
	
	private static Print instance;
	
	private Print() {
		
	}
	
	public static Print getInstance() {
		 if(instance == null) instance = new Print();
		 return instance;
	}
	
	public void printModeloCriado(String modelo) {
		System.out.println("Celular " + modelo + " criado com sucesso!\n");
	}
	
}
