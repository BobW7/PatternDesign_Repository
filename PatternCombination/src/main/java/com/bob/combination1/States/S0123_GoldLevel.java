package com.bob.combination1.States;

/**
 * 金牌会员
 */
public class S0123_GoldLevel implements S0123_MemberLevel {
    @Override
    public double calcRealAmount(double amount) {
        return amount * 0.8;
    }

    @Override
    public double changeCredit(double amount) {
        return amount / 5;
    }
}
