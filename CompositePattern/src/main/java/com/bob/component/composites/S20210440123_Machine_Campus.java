package com.bob.component.composites;

import com.bob.component.S20210440123_Component;

import java.util.ArrayList;
import java.util.List;

public class S20210440123_Machine_Campus implements S20210440123_Component {

    private List<S20210440123_Component> components = new ArrayList<>();

    public S20210440123_Machine_Campus() {
        components.add(new S20210440123_MachineEngineering());
        components.add(new S20210440123_PowerEngineering());
    }

    @Override
    public void sendMessage() {
        String name = "机械学院";
        System.out.println(name +"发信息给 -> ");
        for(S20210440123_Component component:components){
            component.sendMessage();
        }
    }
}
