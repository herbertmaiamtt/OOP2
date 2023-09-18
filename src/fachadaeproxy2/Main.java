package fachadaeproxy2;

public class Main {

	public static void main(String[] args) {
	
		Motor motor = new Motor();
		Porta porta = new Porta();
		Farol farol = new Farol();
		Radio radio = new Radio();
		CintoDeSeguranca cinto = new CintoDeSeguranca();
		
		CarroFachada carro = new CarroFachada(motor, cinto, porta, farol, radio);
	
		carro.ligarCarro();
		carro.desligarCarro();
	}
}
