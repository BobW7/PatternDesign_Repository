package com.bob.combination4.state;

import com.bob.combination4.S0123_TransactionProcessor;

public class S0123_EjectCardState implements S0123_TerminalState {
    @Override
    public void handle(S0123_TransactionProcessor processor) {
        System.out.println("退卡成功");
    }
}
