package negocio;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Observer> vetObserver;

    public Subject() {
        this.vetObserver = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        this.vetObserver.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.vetObserver.remove(observer);
    }

    public void removeObserver(int pos) {
        this.vetObserver.remove(pos);
    }

    protected void notifyObservers() {
        for (Observer observer : vetObserver) {
            observer.update(this);
        }
    }

}
