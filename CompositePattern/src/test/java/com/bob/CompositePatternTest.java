package com.bob;

import com.bob.component.composites.S20210440123_Composite;
import com.bob.component.leaves.S20210440123_Student;
import org.junit.Test;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class CompositePatternTest {
    private static void InitialComponents() {
        //构建组合结构
        S20210440123_Composite Master = new S20210440123_Composite("教务部");
        S20210440123_Composite CS_Campus = new S20210440123_Composite("计算机学院");
        S20210440123_Composite Machine_Campus = new S20210440123_Composite("机械工程学院");
        S20210440123_Composite SoftwareEngineering = new S20210440123_Composite("软件工程系");
        S20210440123_Composite ArtificialIntelligence = new S20210440123_Composite("人工智能系");
        S20210440123_Composite MachineEngineering = new S20210440123_Composite("机械工程系");
        S20210440123_Composite PowerEngineering = new S20210440123_Composite("能动系");
        S20210440123_Student ZhangSan = new S20210440123_Student("张三");
        S20210440123_Student LiSi = new S20210440123_Student("李四");
        S20210440123_Student WangWu = new S20210440123_Student("王五");
        S20210440123_Student LiuJun = new S20210440123_Student("刘俊");
        S20210440123_Student LiXiao = new S20210440123_Student("李晓");
        S20210440123_Student ZhaoHui = new S20210440123_Student("赵慧");
        S20210440123_Student WangFang = new S20210440123_Student("王芳");
        S20210440123_Student YangXiang = new S20210440123_Student("阳湘");
        S20210440123_Student TianTian = new S20210440123_Student("田甜");

        Master.addComponent(CS_Campus);
        Master.addComponent(Machine_Campus);

        CS_Campus.addComponent(SoftwareEngineering);
        CS_Campus.addComponent(ArtificialIntelligence);

        Machine_Campus.addComponent(MachineEngineering);
        Machine_Campus.addComponent(PowerEngineering);

        SoftwareEngineering.addComponent(ZhangSan);
        SoftwareEngineering.addComponent(LiSi);
        SoftwareEngineering.addComponent(WangWu);

        ArtificialIntelligence.addComponent(LiuJun);
        ArtificialIntelligence.addComponent(LiXiao);

        MachineEngineering.addComponent(ZhaoHui);
        MachineEngineering.addComponent(WangFang);

        PowerEngineering.addComponent(YangXiang);
        PowerEngineering.addComponent(TianTian);
    }

    @Test
    public void test() {
        String config = "D:\\IDEAProjectSource\\PatternDesign_Repository\\CompositePattern\\src\\main\\resources\\config.properties";

        try (InputStream input = Files.newInputStream(Paths.get(config))) {
            Properties properties = new Properties();
            properties.load(input);

            String className = properties.getProperty("class");
            String methodName = properties.getProperty("method");

            Class<?> clazz = Class.forName(className);
            Object object = clazz.getDeclaredConstructor().newInstance();
            Method method = clazz.getMethod(methodName);
            method.invoke(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
