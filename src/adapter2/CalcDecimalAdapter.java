package adapter2;

public class CalcDecimalAdapter implements Calculadora{

	CalcDecimal calcDec;
	
	public CalcDecimalAdapter(CalcDecimal calcDec) {
		this.calcDec = calcDec;
	}
	
	@Override
	public String somar(String a, String b) {
		String soma = calcDec.somar(a, b);
		
		return soma;
	}

	@Override
	public String subtrair(String a, String b) {
		String subtrai = calcDec.subtrair(a, b);
		
		return subtrai;
	}

	@Override
	public String multiplicar(String a, String b) {
		String multiplica = calcDec.multiplicar(a, b);
		
		return multiplica;
	}

}
