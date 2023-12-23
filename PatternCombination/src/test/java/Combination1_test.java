import com.bob.combination1.ObserverPart.S0123_BookStore;
import com.bob.combination1.States.S0123_MemberLevel;
import com.bob.combination1.S0123_User;
import org.junit.Test;

public class Combination1_test {
    @Test
    public void test() {
        // 创建网上书店
        S0123_BookStore bookStore = new S0123_BookStore();

        // 创建用户
        S0123_User user1 = new S0123_User("User1");
        S0123_User user2 = new S0123_User("User2");


        // 添加观察者（店铺会员）
        bookStore.addObserver(user1);
        bookStore.addObserver(user2);

        // 发送活动通知
        bookStore.sendNotification("双十一来了！书本打折！");

        // 用户购买图书
        user1.buyBook(100);
        user1.buyBook(100);
        user1.buyBook(100);
        user1.buyBook(100);
        user1.buyBook(100);
        user1.buyBook(100);
        user2.buyBook(20000);


        // 计算实际金额和积分
        S0123_MemberLevel memberLevel1 = user1.getMemberLevel(user1.getUserLevel());
        S0123_MemberLevel memberLevel2 = user2.getMemberLevel(user2.getUserLevel());

        double realAmount1 = memberLevel1.calcRealAmount(user1.getPaidMoney());
        double realAmount2 = memberLevel2.calcRealAmount(user2.getPaidMoney());


        System.out.println("User1 - 真实消费: " + realAmount1 + ", 积分: " + user1.getCredit());
        System.out.println("User2 - 真实消费: " + realAmount2 + ", 积分: " + user2.getCredit());
    }

}
