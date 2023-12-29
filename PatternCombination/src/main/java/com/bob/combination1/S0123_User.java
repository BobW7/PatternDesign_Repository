package com.bob.combination1;

import com.bob.combination1.ObserverPart.S0123_Observer;
import com.bob.combination1.States.S0123_GoldLevel;
import com.bob.combination1.States.S0123_MemberLevel;
import com.bob.combination1.States.S0123_NormalLevel;
import com.bob.combination1.States.S0123_SilverLevel;

/**
 * 用户类
 */
public class S0123_User implements S0123_Observer {
    private String userName;
    private S0123_MemberLevel userLevel;
    private double paidMoney;
    private double credit;

    public void buyBook(double amount) {
        paidMoney += amount;
        credit += userLevel.changeCredit(amount);
        System.out.println(userName + " 购买了 " + amount + " 元的书籍，累计消费 " + paidMoney + " 元，" + "当前积分 " + credit + " 分");
        updateLevel();
    }

    public void updateLevel() {
        if (credit >= 100) {
            userLevel = new S0123_GoldLevel();
            System.out.println("由于积分达到标准 " + userName + " 的会员等级更新为 " + "黄金会员");
        } else if (credit >= 50) {
            userLevel = new S0123_SilverLevel();
            System.out.println("由于积分达到标准 " + userName + " 的会员等级更新为 " + "白银会员");
        } else {
            userLevel = new S0123_NormalLevel();
        }
    }


    public S0123_User(String userName) {
        this.userName = userName;
        this.userLevel = new S0123_NormalLevel();
        this.paidMoney = 0.0;
    }

    public S0123_MemberLevel getUserLevel() {
        return userLevel;
    }

    public double getPaidMoney() {
        return paidMoney;
    }

    public double getCredit() {
        return credit;
    }

    public double checkout(double amount) {
        return userLevel.calcRealAmount(amount);
    }

    @Override
    public void update(String message) {
        System.out.println(userName + " 收到通知: " + message);
    }
}
