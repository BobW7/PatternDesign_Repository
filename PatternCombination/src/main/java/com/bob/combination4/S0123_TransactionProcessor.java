package com.bob.combination4;

import com.bob.combination4.state.S0123_EjectCardState;
import com.bob.combination4.state.S0123_InsertCardState;
import com.bob.combination4.state.S0123_TerminalState;
import com.bob.combination4.strategy.S0123_AuthenticationStrategy;

/**
 * 状态模式中的上下文Context，关联了状态和策略
 */
public class S0123_TransactionProcessor {
    private S0123_TerminalState currentState;
    private S0123_AuthenticationStrategy authenticationStrategy;

    public S0123_TransactionProcessor() {
        currentState = new S0123_InsertCardState();
    }

    public S0123_TerminalState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(S0123_TerminalState currentState) {
        this.currentState = currentState;
    }

    public S0123_AuthenticationStrategy getAuthenticationStrategy() {
        return authenticationStrategy;
    }

    public void setAuthenticationStrategy(S0123_AuthenticationStrategy authenticationStrategy) {
        this.authenticationStrategy = authenticationStrategy;
    }

    /**
     * 处理流程(状态转移)
     */
    public void process() {
        currentState.handle(this);
        // 若当前状态不是退卡状态，则一直处理
        while (!(currentState instanceof S0123_EjectCardState)) {
            currentState.handle(this);
        }
        // 最后处理一次退卡状态
        currentState.handle(this);
        // 重置状态
        currentState = new S0123_InsertCardState();
    }
}
