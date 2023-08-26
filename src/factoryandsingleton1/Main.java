package factoryandsingleton1;

public class Main {

	public static void main(String[] args) {
		Samsung sam = Samsung.getInstance();
		Iphone iph = Iphone.getInstance();
		
		sam.ConstroiCelular("Galaxy 8");
		sam.ConstroiCelular("Galaxy 20");
		
		iph.ConstroiCelular("Iphone X"); 
		iph.ConstroiCelular("Iphone S"); 
	}

}
