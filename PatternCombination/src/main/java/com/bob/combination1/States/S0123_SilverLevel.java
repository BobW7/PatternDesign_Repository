package com.bob.combination1.States;
/**
 * 白银会员
 */
public class S0123_SilverLevel implements S0123_MemberLevel {
    @Override
    public double calcRealAmount(double amount) {
        return amount * 0.9;
    }

    @Override
    public double changeCredit(double amount) {
        return amount / 8;
    }
}
