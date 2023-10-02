package observer2;

import java.util.ArrayList;

public class Acao implements Subject{

	private double precoAcao;
	private String nomeAcao;
	private ArrayList<Observer> observer;
	
	public Acao(double precoAcao, String nomeAcao) {
		this.nomeAcao = nomeAcao;
		this.precoAcao = precoAcao;
		this.observer = new ArrayList<Observer>();
	}
	
	@Override
	public void registraObserver(Observer observer) {
		this.observer.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observer.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for(Observer obs : this.observer) {
			obs.update(this.observer);
		}
	}
	
	public double getPrecoAcao() {
		return this.precoAcao;
	}
	
	public String getNomeAcao() {
		return this.nomeAcao;
	}
	
	public void setPrecoAcao(double precoAcao) {
		this.precoAcao = precoAcao;
		this.notifyObserver();
	}
	
}
