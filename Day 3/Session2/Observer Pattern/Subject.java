package observerPattern;

public abstract class Subject {
	public abstract void attach(Observer o);
	public abstract void detach(Observer o);
	public abstract void notifyUpdate();
}
