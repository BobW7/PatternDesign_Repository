import com.bob.S0123_Channel;
import com.bob.S0123_RemoteControl;
import com.bob.S0123_Television;
import com.bob.factory.S0123_AbstractFactory;
import com.bob.factory.S0123_LGFactory;
import com.bob.factory.S0123_SamsungFactory;
import com.bob.factory.S0123_SonyFactory;
import org.junit.Test;

public class IteratorPatternTest {
    @Test
    public void test() {
        // 使用工厂方法创建电视机和遥控器对象
        S0123_AbstractFactory samsungFactory = new S0123_SamsungFactory();
        S0123_Television samsungTV = samsungFactory.createTelevision();

        S0123_AbstractFactory sonyFactory = new S0123_SonyFactory();
        S0123_Television sonyTV = sonyFactory.createTelevision();

        S0123_AbstractFactory lgFactory = new S0123_LGFactory();
        S0123_Television lgTV = lgFactory.createTelevision();

        // 添加频道
        insertChannels(samsungTV, sonyTV, lgTV);

        // 创建遥控器
        S0123_RemoteControl samsungRemoteControl = samsungFactory.createRemoteControl(samsungTV);
        S0123_RemoteControl sonyRemoteControl = sonyFactory.createRemoteControl(sonyTV);
        S0123_RemoteControl lgRemoteControl = lgFactory.createRemoteControl(lgTV);

        // 使用遥控器操作电视机
        samsungRemoteControl.turnOn();
        samsungRemoteControl.nextChannel();
        samsungRemoteControl.nextChannel();
        samsungRemoteControl.turnOff();

        sonyRemoteControl.turnOn();
        sonyRemoteControl.nextChannel();
        sonyRemoteControl.prevChannel();
        sonyRemoteControl.turnOff();

        lgRemoteControl.turnOn();
        lgRemoteControl.nextChannel();
        lgRemoteControl.nextChannel();
        lgRemoteControl.prevChannel();
        lgRemoteControl.turnOff();
    }

    private static void insertChannels(S0123_Television samsungTV, S0123_Television sonyTV, S0123_Television lgTV) {
        samsungTV.addChannel(new S0123_Channel("CCTV-1"));
        samsungTV.addChannel(new S0123_Channel("CCTV-2"));
        samsungTV.addChannel(new S0123_Channel("CCTV-3"));

        sonyTV.addChannel(new S0123_Channel("BBC"));
        sonyTV.addChannel(new S0123_Channel("CNN"));
        sonyTV.addChannel(new S0123_Channel("FOX"));

        lgTV.addChannel(new S0123_Channel("Discovery"));
        lgTV.addChannel(new S0123_Channel("National Geographic"));
        lgTV.addChannel(new S0123_Channel("Animal Planet"));
    }
}
