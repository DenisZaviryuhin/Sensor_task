package app;

import java.util.ArrayList;
import java.util.List;

public class Substance {
    private final List<Observer> observers = new ArrayList<>();
    private int weight;
    private String color;

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        notifyAllObservers();
    }

    public void setWeight(int weight) {
        this.weight = weight;

    }

    public void attach(Observer observer) {
        observers.add(observer);

    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}



