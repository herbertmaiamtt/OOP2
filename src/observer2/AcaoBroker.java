package observer2;

public class AcaoBroker {

	private String nome;
	
	public AcaoBroker(String nome) {
		this.nome = nome;
	}
	
	public void compraAcao(Acao acao, Investidor investidor) {
		System.out.println("O broker " + this.nome + "comprou a acao "
						   + "" + acao.getNomeAcao() + " para o investidor "
						   + "" + investidor.getNomeInvestidor() + "pelo preco de "
						   + "" + acao.getPrecoAcao());
	}
	
	public void vendeAcao(Acao acao, Investidor investidor) {
		System.out.println("O broker " + this.nome + "vendeu a acao "
				   + "" + acao.getNomeAcao() + " para o investidor "
				   + "" + investidor.getNomeInvestidor() + "pelo preco de "
				   + "" + acao.getPrecoAcao());
	}
	
}
