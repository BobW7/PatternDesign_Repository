import com.bob.compositeFlyweight.S20210440123_CompoundStoreTemplate;
import com.bob.compositeFlyweight.S20210440123_CompoundStoreTemplateFactory;
import org.junit.Test;

public class compositeFlyweightTest {
    @Test
    public void Test() {
        // 模拟天猫商城中的网店，一部分内容相同但logo不同的情况
        S20210440123_CompoundStoreTemplate storeTemplate1 =
                S20210440123_CompoundStoreTemplateFactory.getTemplate("BrandLogo");
        storeTemplate1.render("Style1");

        S20210440123_CompoundStoreTemplate storeTemplate2 =
                S20210440123_CompoundStoreTemplateFactory.getTemplate("BrandLogo");
        storeTemplate2.render("Style2");

        S20210440123_CompoundStoreTemplate storeTemplate3 =
                S20210440123_CompoundStoreTemplateFactory.getTemplate("BrandLogo");
        storeTemplate3.render("Style3");

        System.out.println(storeTemplate3.equals(storeTemplate2));
        System.out.println(storeTemplate3.equals(storeTemplate1));
        // 这里会发现实际上获取的是同一个模板对象，而不是多个相同的对象
        // 但每个对象可以根据传入的内容（这里是样式style）进行不同的渲染

    }
}
