package com.bob.combination2;

import java.util.ArrayList;
import java.util.List;

// 具体的部门类
public class S0123_ConcreteDepartment implements S0123_Department {
    private String name;
    private List<S0123_MyUser> members;
    private S0123_MeetingList meetingList;

    public S0123_ConcreteDepartment(String name) {
        this.name = name;
        members = new ArrayList<>();
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println("部门 " + name + " 收到通知： " + message);
        for (S0123_MyUser user : members) {
            user.receiveNotification(message);
        }
    }

    @Override
    public void registerToMeetingList(S0123_MeetingList meetingList) {
        this.meetingList = meetingList;
        meetingList.addUser(this);
    }

    @Override
    public void addMember(S0123_MyUser user) {
        members.add(user);
    }

    @Override
    public void removeMember(S0123_MyUser user) {
        members.remove(user);
    }


}