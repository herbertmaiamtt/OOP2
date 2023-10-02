package observer2;

public class Main {

	public static void main(String[] args) {
		
		Acao acao1 = new Acao(25.0, "ACAO1");
		Acao acao2 = new Acao(50.0, "ACAO2");
		
		AcaoBroker marco = new AcaoBroker("Marco");
		AcaoBroker julia = new AcaoBroker("Julia");
		
		Investidor sofia = new Investidor("Sofia", marco);
		Investidor junior = new Investidor("Junior", julia);
		
		sofia.setLimMin(acao1, 20.0);
		sofia.setLimMax(acao1, 30.0);
		sofia.setLimMin(acao2, 40.0);
		sofia.setLimMax(acao2, 60.0);
		
		junior.setLimMin(acao1, 20.0);
		junior.setLimMax(acao1, 30.0);
		junior.setLimMin(acao2, 40.0);
		junior.setLimMax(acao2, 60.0);
		
		acao1.registraObserver(sofia);
		acao1.registraObserver(junior);
		acao2.registraObserver(sofia);
		acao2.registraObserver(junior);
		

	}

}
