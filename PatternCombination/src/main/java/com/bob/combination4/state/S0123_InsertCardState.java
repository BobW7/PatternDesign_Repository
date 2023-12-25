package com.bob.combination4.state;

import com.bob.combination4.S0123_TransactionProcessor;

public class S0123_InsertCardState implements S0123_TerminalState {
    @Override
    public void handle(S0123_TransactionProcessor processor) {
        System.out.println("请插入银行卡");
        // 状态转移为身份验证状态
        processor.setCurrentState(new S0123_AuthenticateState());
    }
}
