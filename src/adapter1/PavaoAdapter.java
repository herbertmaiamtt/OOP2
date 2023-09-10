package adapter1;

public class PavaoAdapter implements Ave{

	private Pavao pavao;
	
	public PavaoAdapter(Pavao pavao) {
		this.pavao = pavao;
	}
	
	@Override
	public void voar() {
		System.out.println("Pavao nao e capaz de voar.\n");
	}

	@Override
	public void emitirSom() {
		pavao.cantar();
	}

}
