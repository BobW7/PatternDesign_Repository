package com.bob.test;

import com.bob.S0123_ConcreteObserver;
import com.bob.S0123_ConcreteSubject;
import com.bob.S0123_Observer;
import org.junit.Test;

public class ObserverPattern_Test {
    @Test
    public void Test() {
        S0123_ConcreteSubject mateX = new S0123_ConcreteSubject();
        S0123_Observer user1 = new S0123_ConcreteObserver(mateX, "User1");
        S0123_Observer user2 = new S0123_ConcreteObserver(mateX, "User2");
        S0123_Observer user3 = new S0123_ConcreteObserver(mateX, "User3");

        //模拟手机到货状态更新
        mateX.setStatus(true);//到货
        System.out.println();
        mateX.setStatus(false);//售罄
    }
}
