package adapter1;

public class PatoDomestico implements Pato{

	@Override
	public void grasnar() {
		System.out.println("Pato esta grasnando...\n");
	}

	@Override
	public void voar() {
	System.out.println("Pato esta voando...\n");
	}

}
