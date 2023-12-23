package com.bob.handlers;

import com.bob.request.S0123_LeaveRequest;

public class S0123_Dean extends S0123_Handler{

    @Override
    public void handleRequest(S0123_LeaveRequest request) {
        if (request.getLeaveDuration() <= 168) {
            System.out.println("学院书记批准了 " + request.getStudentName() + "的请假申请");
        } else {
            System.out.println("学院书记拒绝了 " + request.getStudentName() + "的请假申请, 请假时间超过7天需要办理休学手续");
        }
    }
}
