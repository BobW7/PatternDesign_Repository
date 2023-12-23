package com.bob.request;

public class S0123_LeaveRequest {
    public String studentName;
    public double leaveDuration;

    public S0123_LeaveRequest(String studentName, double leaveDuration) {
        this.studentName = studentName;
        this.leaveDuration = leaveDuration;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getLeaveDuration() {
        return leaveDuration;
    }
}
