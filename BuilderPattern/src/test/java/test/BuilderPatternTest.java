package test;

import com.ConcreteBuilders.S20210440123_HuaweiPadBuilder;
import com.ConcreteBuilders.S20210440123_RedmiPadBuilder;
import com.ConcreteBuilders.S20210440123_iPadBuilder;
import com.S20210440123_Director;
import com.S20210440123_Pad;
import org.junit.Test;

public class BuilderPatternTest {
    @Test
    public void Test() {
        //创建引导者
        S20210440123_Director director = new S20210440123_Director();
        //设置iPad建造者
        director.SetPadBuilder(new S20210440123_iPadBuilder());
        S20210440123_Pad iPad = director.Construct(true);
        System.out.println(iPad);
        //设置RedmiPad建造者
        director.SetPadBuilder(new S20210440123_RedmiPadBuilder());
        S20210440123_Pad RedmiPad = director.Construct(false);
        System.out.println(RedmiPad);
        //设置HuaweiPad建造者
        director.SetPadBuilder(new S20210440123_HuaweiPadBuilder());
        S20210440123_Pad HuaweiPad = director.Construct(true);
        System.out.println(HuaweiPad);
    }
}
