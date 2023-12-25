package com.bob.combination3.states;

public class S0123_NormalState implements S0123_State{
    @Override
    public void performAction() {
        System.out.println("正常状态：可以射击，移动，被攻击，暂停游戏。");
    }
}
