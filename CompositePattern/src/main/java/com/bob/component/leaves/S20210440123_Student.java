package com.bob.component.leaves;

import com.bob.component.S20210440123_Component;

public class S20210440123_Student implements S20210440123_Component {
    private String name;

    public S20210440123_Student(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage() {
        System.out.println(name);
    }
}
