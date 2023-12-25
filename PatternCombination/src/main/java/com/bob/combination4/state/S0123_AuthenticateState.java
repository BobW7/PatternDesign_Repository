package com.bob.combination4.state;

import com.bob.combination4.strategy.S0123_AuthenticationStrategy;
import com.bob.combination4.S0123_TransactionProcessor;

public class S0123_AuthenticateState implements S0123_TerminalState {
    @Override
    public void handle(S0123_TransactionProcessor processor) {
        S0123_AuthenticationStrategy strategy = processor.getAuthenticationStrategy();
        if(strategy.authenticate()) {
            System.out.println("身份验证成功");
            // 状态转移为交易状态
            processor.setCurrentState(new S0123_TransactionState());
        } else {
            System.out.println("身份验证失败");
            // 状态转移为退卡状态
            processor.setCurrentState(new S0123_EjectCardState());
        }

    }
}
