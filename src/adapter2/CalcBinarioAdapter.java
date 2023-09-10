package adapter2;

public class CalcBinarioAdapter implements Calculadora{

	CalcBinario calcBin;
	
	public CalcBinarioAdapter(CalcBinario calcBin) {
		this.calcBin = calcBin;
	}
	
	@Override
	public String somar(String a, String b) {
		String soma = calcBin.somar(a, b);
		
		return soma;
	}

	@Override
	public String subtrair(String a, String b) {
		String subtrai = calcBin.subtrair(a, b);
		
		return subtrai;
	}

	@Override
	public String multiplicar(String a, String b) {
		return "Esta calculadora nao multiplica valores em binario\n";
	}

}
