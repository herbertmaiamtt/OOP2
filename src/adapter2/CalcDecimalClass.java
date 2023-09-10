package adapter2;

public class CalcDecimalClass implements CalcDecimal{

	@Override
	public String somar(String a, String b) {
		int soma;
		
		soma = Integer.parseInt(a) + Integer.parseInt(b);
		String resultado = Integer.toString(soma);
		
		return resultado;
	}

	@Override
	public String subtrair(String a, String b) {
		int resultado;
		
		resultado = Integer.parseInt(a) - Integer.parseInt(b);
		
		return Integer.toString(resultado);
	}

	@Override
	public String multiplicar(String a, String b) {
		int resultado;
		
		resultado = Integer.parseInt(a) * Integer.parseInt(b);
		
		return Integer.toString(resultado);
	}

}
