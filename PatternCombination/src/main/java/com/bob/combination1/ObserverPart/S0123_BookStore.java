package com.bob.combination1.ObserverPart;

import java.util.ArrayList;
import java.util.List;

public class S0123_BookStore implements S0123_Subject{
    private List<S0123_Observer> observers;
    public S0123_BookStore() {
        this.observers = new ArrayList<>();
    }
    @Override
    public void addObserver(S0123_Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(S0123_Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for(S0123_Observer observer : observers) {
            observer.update(message);
        }
    }

    public void sendNotification(String message) {
        System.out.println("发通知: " + message + " ...");
        notifyObservers(message);
    }
}
