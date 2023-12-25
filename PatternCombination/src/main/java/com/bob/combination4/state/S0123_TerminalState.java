package com.bob.combination4.state;

import com.bob.combination4.S0123_TransactionProcessor;

public interface S0123_TerminalState {
    void handle(S0123_TransactionProcessor processor);
}
