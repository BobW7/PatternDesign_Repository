package com.bob;

/**
 * 具体观察者
 */
public class S0123_ConcreteObserver implements S0123_Observer {
    private S0123_Subject subject;
    private String observerName;

    public S0123_ConcreteObserver(S0123_Subject subject, String observerName) {
        this.subject = subject;
        this.observerName = observerName;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(boolean available) {
        if (available) {
            System.out.println(observerName + ": 收到通知，华为MateX系列最新款手机已经到货！！");
        } else {
            System.out.println(observerName + ": 收到通知，华为MateX系列最新款手机已售罄。");
        }
    }
}
