package com.bob.combination2;

// 具体的员工类
public class S0123_Employee implements S0123_MyUser {
    private String name;
    private S0123_MeetingList meetingList;

    public S0123_Employee(String name) {
        this.name = name;
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println("职工 " + name + " 收到通知： " + message);
    }

    @Override
    public void registerToMeetingList(S0123_MeetingList meetingList) {
        this.meetingList = meetingList;
        meetingList.addUser(this);
    }
}