package com.bob.component.composites;

import com.bob.component.S20210440123_Component;

import java.util.ArrayList;
import java.util.List;

public class S20210440123_Master implements S20210440123_Component {

    private final List<S20210440123_Component> components = new ArrayList<>();

    public S20210440123_Master() {
        components.add(new S20210440123_CS_Campus());
        components.add(new S20210440123_Machine_Campus());
    }

    @Override
    public void sendMessage() {
        String name = "教务部";
        System.out.println(name + "发信息给 -> ");
        for (S20210440123_Component component : components) {
            component.sendMessage();
        }
    }
}
