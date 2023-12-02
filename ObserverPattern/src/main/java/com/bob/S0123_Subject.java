package com.bob;

/**
 * 被观察者接口
 */
public interface S0123_Subject {
    void registerObserver(S0123_Observer observer);
    void removeObserver(S0123_Observer observer);
    void notifyObservers();
}
