package adapter2;

public class Main {

	public static void main(String[] args) {
		
		CalcDecimal calcDec = new CalcDecimalClass();
		Calculadora calcDecAdapter = new CalcDecimalAdapter(calcDec);
		CalcBinario calcBin = new CalcBinarioClass();
		Calculadora calcBinAdapter = new CalcBinarioAdapter(calcBin);
		
		System.out.println(calcDecAdapter.somar("5", "3"));
		System.out.println(calcDecAdapter.subtrair("5", "3"));
		System.out.println(calcDecAdapter.multiplicar("5", "3"));
		System.out.println("\n");
		System.out.println(calcBinAdapter.somar("5", "3"));
		System.out.println(calcBinAdapter.subtrair("5", "3"));
		System.out.println(calcBinAdapter.multiplicar("5", "3"));
		

	}

}
