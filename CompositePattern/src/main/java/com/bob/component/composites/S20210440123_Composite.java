package com.bob.component.composites;

import com.bob.component.S20210440123_Component;

import java.util.ArrayList;
import java.util.List;

public class S20210440123_Composite implements S20210440123_Component {
    private String name;

    public S20210440123_Composite(String name) {
        this.name = name;
    }

    private List<S20210440123_Component> components = new ArrayList<>();

    public void addComponent(S20210440123_Component component){
        components.add(component);
    }
    public void removeComponent(S20210440123_Component component){
        components.remove(component);
    }

    @Override
    public void sendMessage() {
        System.out.println(name+"发信息给 -> ");
        for(S20210440123_Component component:components){
            component.sendMessage();
        }
    }
}
