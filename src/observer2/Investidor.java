package observer2;

import java.util.HashMap;

public class Investidor implements Observer{

	private String nomeInvestidor;
	private AcaoBroker broker;
	private HashMap<Acao, Double> limMin;
	private HashMap<Acao, Double> limMax;

	public Investidor(String nomeInvestidor, AcaoBroker broker) {
		this.nomeInvestidor = nomeInvestidor;
		this.broker = broker;
		this.limMin = new HashMap<Acao, Double>();
		this.limMax = new HashMap<Acao, Double>();
	}
	
	@Override
	public void update(Subject subject) {	
		Acao acao = (Acao) subject;
		double preco = acao.getPrecoAcao();
		
		if(preco >= this.limMax.get(acao)) this.broker.vendeAcao(acao, this);
		
		if(preco <= this.limMin.get(acao)) this.broker.compraAcao(acao, this);
	}
	
	public String getNomeInvestidor() {
		return this.nomeInvestidor;
	}
	
	public void setLimMin(Acao acao, double preco) {
		this.limMin.put(acao, preco);
	}
	
	public void setLimMax(Acao acao, double preco) {
		this.limMax.put(acao, preco);
	}
	
}
