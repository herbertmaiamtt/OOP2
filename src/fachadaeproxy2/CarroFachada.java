package fachadaeproxy2;

public class CarroFachada {

	Motor motor;
	CintoDeSeguranca cinto;
	Porta porta;
	Farol farol;
	Radio radio;
	
	public CarroFachada(Motor motor, CintoDeSeguranca cinto,
						Porta porta, Farol farol, Radio radio) {
		this.motor = motor;
		this.cinto = cinto;
		this.porta = porta;
		this.farol = farol;
		this.radio = radio;
	}
	
	public void ligarCarro() {
		System.out.println("Ligando carro");
		motor.ligaMotor();
		cinto.travaCintoDeSeguranca();
		porta.trancaPortas();
		farol.acendeFarol();
		radio.ligaRadio();
		radio.sintonizaRadio();
	}
	
	public void desligarCarro() {
		System.out.println("Desligando carro");
		motor.desligaMotor();
		cinto.destravaCintoDeSeguranca();
		porta.destrancaPortas();
		farol.apagaFarol();
		radio.desligaRadio();
	}
	
}
