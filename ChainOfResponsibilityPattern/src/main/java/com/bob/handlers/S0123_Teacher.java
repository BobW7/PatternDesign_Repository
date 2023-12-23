package com.bob.handlers;

import com.bob.request.S0123_LeaveRequest;

public class S0123_Teacher extends S0123_Handler{

    @Override
    public void handleRequest(S0123_LeaveRequest request) {
        if (request.getLeaveDuration() <= 0.25) {
            System.out.println("任课老师批准了 " + request.getStudentName() + "的请假申请");
        } else {
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
