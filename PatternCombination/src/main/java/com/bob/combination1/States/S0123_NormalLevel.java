package com.bob.combination1.States;
/**
 * 普通用户
 */
public class S0123_NormalLevel implements S0123_MemberLevel{
    @Override
    public double calcRealAmount(double amount) {
        return amount;
    }

    @Override
    public double changeCredit(double amount) {
        return amount / 10;
    }
}
