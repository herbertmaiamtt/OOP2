package adapter2;

public class CalcBinarioClass implements CalcBinario{

	@Override
	public String somar(String a, String b) {
		int resultado;
		
		resultado = Integer.parseInt(a) + Integer.parseInt(b);
		
		return Integer.toBinaryString(resultado);
	}

	@Override
	public String subtrair(String a, String b) {
		int resultado;
		
		resultado = Integer.parseInt(a) - Integer.parseInt(b);
		
		return Integer.toBinaryString(resultado);
	}

}
