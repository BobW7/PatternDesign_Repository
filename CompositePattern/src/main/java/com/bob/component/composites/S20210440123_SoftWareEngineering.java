package com.bob.component.composites;

import com.bob.component.S20210440123_Component;
import com.bob.component.leaves.S20210440123_Student;

import java.util.ArrayList;
import java.util.List;

public class S20210440123_SoftWareEngineering implements S20210440123_Component {

    private List<S20210440123_Component> components = new ArrayList<>();

    public S20210440123_SoftWareEngineering() {
        components.add(new S20210440123_Student("张三"));
        components.add(new S20210440123_Student("李四"));
        components.add(new S20210440123_Student("王五"));
    }

    @Override
    public void sendMessage() {
        String name = "软件工程系";
        System.out.println(name +"发信息给 -> ");
        for(S20210440123_Component component:components){
            component.sendMessage();
        }
    }
}
