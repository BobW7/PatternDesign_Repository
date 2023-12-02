package com.bob;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体被观察者
 */
public class S0123_ConcreteSubject implements S0123_Subject {
    private List<S0123_Observer> observers = new ArrayList<>();
    private boolean available = true;// 被观察者状态

    @Override
    public void registerObserver(S0123_Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(S0123_Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (S0123_Observer observer : observers) {
            observer.update(available);
        }
    }

    /**
     * 模拟手机库存状态更新
     *
     * @param newStatus 新的状态
     */
    public void setStatus(boolean newStatus) {
        available = newStatus;
        System.out.println("华为MateX系列手机状态更新为：" + (available ? "到货" : "售罄"));
        notifyObservers();
    }
}
