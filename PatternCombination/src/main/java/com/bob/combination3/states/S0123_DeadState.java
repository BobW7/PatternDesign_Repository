package com.bob.combination3.states;

public class S0123_DeadState implements S0123_State{
    @Override
    public void performAction() {
        System.out.println("阵亡状态：只允许重新开始游戏");
    }
}
