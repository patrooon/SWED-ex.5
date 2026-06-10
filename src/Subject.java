import java.util.ArrayList;

public interface Subject {
    public ArrayList<Observer> observers = new ArrayList<Observer>();
    public void attach(Observer observer);
    public void detach(Observer observer);
    public void doNotification();
}
