package observer2;

public interface Subject {

	public void registraObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObserver();
	
}
