package com.bob.combination1;

import com.bob.combination1.ObserverPart.S0123_Observer;
import com.bob.combination1.States.S0123_GoldLevel;
import com.bob.combination1.States.S0123_MemberLevel;
import com.bob.combination1.States.S0123_NormalLevel;
import com.bob.combination1.States.S0123_SilverLevel;

import java.util.Observer;

/**
 * 用户类
 */
public class S0123_User implements S0123_Observer {
    private String userName;
    private String userLevel;
    private double paidMoney;
    private double credit;

    public void buyBook(double amount) {
        paidMoney += amount;
        credit += getMemberLevel(userLevel).changeCredit(amount);
        System.out.println(userName + " 购买了 " + amount + " 元的书籍，累计消费 " + paidMoney + " 元，" + "当前积分 " + credit + " 分");
        updateLevel();
    }

    public void updateLevel() {
        if (credit >= 100) {
            userLevel = "Gold";
            System.out.println("由于积分达到标准 " + userName + " 的会员等级更新为 " + userLevel);
        } else if (credit >= 50) {
            userLevel = "Silver";
            System.out.println("由于积分达到标准 " + userName + " 的会员等级更新为 " + userLevel);
        } else {
            userLevel = "Normal";
        }
    }

    // 根据用户等级获取对应的会员等级对象
    public S0123_MemberLevel getMemberLevel(String userLevel) {
        switch (userLevel) {
            case "Normal":
                return new S0123_NormalLevel();
            case "Silver":
                return new S0123_SilverLevel();
            case "Gold":
                return new S0123_GoldLevel();
            default:
                throw new IllegalArgumentException("Invalid user level: " + userLevel);
        }
    }

    public S0123_User(String userName) {
        this.userName = userName;
        this.userLevel = "Normal";
        this.paidMoney = 0.0;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public double getPaidMoney() {
        return paidMoney;
    }

    public void setPaidMoney(double paidMoney) {
        this.paidMoney = paidMoney;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Override
    public void update(String message) {
        System.out.println(userName + " 收到通知: " + message);
    }
}
