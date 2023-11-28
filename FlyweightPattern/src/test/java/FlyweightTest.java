import com.bob.S20210440123_StoreTemplate;
import com.bob.S20210440123_StoreTemplateFac;
import org.junit.Test;

public class FlyweightTest {
    @Test
    public void Test() {
        // 模拟天猫商城中的多个网店使用相同模板的情况
        S20210440123_StoreTemplate storeTemplate1 = S20210440123_StoreTemplateFac.getTemplate("style1");
        storeTemplate1.render("Content for Store 1");

        S20210440123_StoreTemplate storeTemplate2 = S20210440123_StoreTemplateFac.getTemplate("style1");
        storeTemplate2.render("Content for Store 2");
        // 这里会发现实际上获取的是同一个模板对象，而不是多个相同的对象
        // 但每个对象可以根据传入的内容进行不同的渲染
        boolean equals = storeTemplate1.equals(storeTemplate2);
        System.out.println(equals);

    }
}
