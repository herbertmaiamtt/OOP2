package adapter1;

public class PatoAdapter implements Ave{

	private Pato pato;
	
	public PatoAdapter(Pato pato) {
		this.pato = pato;
	}

	@Override
	public void voar() {
		pato.voar();
	}

	@Override
	public void emitirSom() {
		pato.grasnar();
	}
	
	
	
}
