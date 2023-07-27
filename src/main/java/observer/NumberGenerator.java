package observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class NumberGenerator {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public boolean deleteObserver(Observer observer) {
        return observers.remove(observer);
    }

    public void notifyObserver() {
        Iterator<Observer> ir = observers.iterator();

        while (ir.hasNext()) {
            Observer observer = ir.next();
            observer.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();
}
