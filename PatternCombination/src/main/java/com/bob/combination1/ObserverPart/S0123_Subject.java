package com.bob.combination1.ObserverPart;

/**
 * 主题接口
 */
public interface S0123_Subject {
    void addObserver(S0123_Observer observer);
    void removeObserver(S0123_Observer observer);
    void notifyObservers(String message);
}
