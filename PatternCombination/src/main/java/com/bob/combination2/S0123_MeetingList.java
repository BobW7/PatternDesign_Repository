package com.bob.combination2;
import java.util.ArrayList;
import java.util.List;

public class S0123_MeetingList {
    private final List<S0123_MyUser> userList;

    public S0123_MeetingList() {
        userList = new ArrayList<>();
    }

    public void addUser(S0123_MyUser user) {
        userList.add(user);
    }

    public void removeUser(S0123_MyUser user) {
        userList.remove(user);
    }

    public void sendNotification(String message) {
        for (S0123_MyUser user : userList) {
            user.receiveNotification(message);
        }
        userList.clear();
    }
}
