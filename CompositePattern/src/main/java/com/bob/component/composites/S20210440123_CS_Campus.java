package com.bob.component.composites;

import com.bob.component.S20210440123_Component;

import java.util.ArrayList;
import java.util.List;

public class S20210440123_CS_Campus implements S20210440123_Component {

    private List<S20210440123_Component> components = new ArrayList<>();

    public S20210440123_CS_Campus() {
        components.add(new S20210440123_SoftWareEngineering());
        components.add(new S20210440123_ArtificialIntelligence());
    }

    @Override
    public void sendMessage() {
        String name = "计算机学院";
        System.out.println(name +"发信息给 -> ");
        for(S20210440123_Component component:components){
            component.sendMessage();
        }
    }
}
