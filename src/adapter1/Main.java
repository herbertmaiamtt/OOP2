package adapter1;

public class Main {

	public void funcionamentoAves(Ave ave) {
		ave.emitirSom();
		ave.voar();
	}
	
	public static void main(String[] args) {

		Main main = new Main();
		Pato patoDomestico = new PatoDomestico();
		Ave patoAdapter = new PatoAdapter(patoDomestico);
		Pavao pavaoAzul = new PavaoAzul();
		Ave pavaoAdapter = new PavaoAdapter(pavaoAzul);
		
		main.funcionamentoAves(pavaoAdapter);
		main.funcionamentoAves(patoAdapter);

	}

}
