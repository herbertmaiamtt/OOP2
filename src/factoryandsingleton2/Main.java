package factoryandsingleton2;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * A utilização do padrão de projeto Singleton garante que a classe Toyota ou Honda sejam instanciadas
		 * apenas uma vez na classe main, mesmo que o método getInstance() seja chamado novamente, o que da mais
		 * controle para a utilização de váriaveis.
		 */
		Toyota toyota = Toyota.getInstance();
		Honda honda = Honda.getInstance();
		
		/*
		 * A utilização do padrão de projeto Factory permite adicionar novas subclasses de produtos sem
		 * necessariamente modificar o restante do código, necessitando apenas de adicionar a subclasse 
		 * ao método makeVehicle.
		 */
		toyota.makeVehicle("Hilux");
		honda.makeVehicle("Civic");
		
		if(toyota.getEstoqueHilux() != null && honda.getEstoqueCivic() != null) {
			System.out.println("Veiculos criados com sucesso!");
		}
		
	}

}
