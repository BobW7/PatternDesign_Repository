package com.bob.handlers;

import com.bob.request.S0123_LeaveRequest;

public class S0123_ViceDean extends S0123_Handler{

    @Override
    public void handleRequest(S0123_LeaveRequest request) {
        if (request.getLeaveDuration() <= 72) {
            System.out.println("学院副书记批准了 " + request.getStudentName() + "的请假申请");
        } else {
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
