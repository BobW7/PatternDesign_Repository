package com.bob.handlers;

import com.bob.request.S0123_LeaveRequest;

public abstract class S0123_Handler {
    public S0123_Handler successor;

    public void setSuccessor(S0123_Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(S0123_LeaveRequest request);
}
