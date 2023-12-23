import com.bob.command.S0123_ACCommand;
import com.bob.command.S0123_FanCommand;
import com.bob.command.S0123_LightCommand;
import com.bob.equipments.S0123_AC;
import com.bob.equipments.S0123_Fan;
import com.bob.equipments.S0123_Light;
import com.bob.invoker.S0123_Invoker;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
public class CommandPatternTest {
    @Test
    public void test() {
        //初始化设备列表
        List<S0123_Light> lights = getLights();
        List<S0123_Fan> fans = getFans();
        List<S0123_AC> acList = getAcs();

        //创建命令对象
        S0123_LightCommand lightCommand = new S0123_LightCommand(lights);
        S0123_FanCommand fanCommand = new S0123_FanCommand(fans);
        S0123_ACCommand acCommand = new S0123_ACCommand(acList);

        //设置触发器
        S0123_Invoker invoker = new S0123_Invoker();
        invoker.addCommand(lightCommand);
        invoker.addCommand(fanCommand);
        invoker.addCommand(acCommand);
        //执行开机命令
        invoker.executeCommands();

        invoker.addCommand(lightCommand);
        invoker.addCommand(fanCommand);
        invoker.addCommand(acCommand);
        //执行关机命令
        invoker.undoCommands();
    }

    private static List<S0123_AC> getAcs() {
        S0123_AC ac1 = new S0123_AC();
        S0123_AC ac2 = new S0123_AC();
        List<S0123_AC> acList = new ArrayList<>();
        acList.add(ac1);
        acList.add(ac2);
        return acList;
    }

    private static List<S0123_Fan> getFans() {
        S0123_Fan fan1 = new S0123_Fan();
        S0123_Fan fan2 = new S0123_Fan();
        List<S0123_Fan> fans = new ArrayList<>();
        fans.add(fan1);
        fans.add(fan2);
        return fans;
    }

    private static List<S0123_Light> getLights() {
        //创建设备对象
        S0123_Light light1 = new S0123_Light();
        S0123_Light light2 = new S0123_Light();
        S0123_Light light3 = new S0123_Light();
        List<S0123_Light> lights = new ArrayList<>();
        lights.add(light1);
        lights.add(light2);
        lights.add(light3);
        return lights;
    }
}
