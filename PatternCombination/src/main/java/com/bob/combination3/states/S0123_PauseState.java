package com.bob.combination3.states;

public class S0123_PauseState implements S0123_State{
    @Override
    public void performAction() {
        System.out.println("暂停状态：不可以射击，移动，可以重新开始游戏，不可被攻击");
    }
}
