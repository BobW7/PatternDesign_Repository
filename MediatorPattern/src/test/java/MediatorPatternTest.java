import com.bob.*;
import org.junit.Test;

public class MediatorPatternTest {
    @Test
    public void test() {
        S0123_TradePlatform tradePlatform = new S0123_TradePlatform();

        S0123_User buyer = new S0123_Buyer(tradePlatform, "买家A");
        S0123_User seller = new S0123_Seller(tradePlatform, "卖家B");

        tradePlatform.registerUser(buyer);
        tradePlatform.registerUser(seller);

        buyer.sendMessage("我想购买你的闲置物品，具体价格是多少？");
        seller.sendMessage("价格可以商量，请问你有其他问题吗？");
    }
}
