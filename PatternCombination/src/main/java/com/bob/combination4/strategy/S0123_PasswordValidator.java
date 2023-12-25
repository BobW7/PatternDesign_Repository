package com.bob.combination4.strategy;

public class S0123_PasswordValidator implements S0123_AuthenticationStrategy {
    @Override
    public boolean authenticate() {
        System.out.println("进行密码验证");
        return true;
    }
}
