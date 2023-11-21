package com.bob.cache;

public class MarriageDecorator extends PrinceDecorator {
    private String marriageStatus;

    public MarriageDecorator(Prince prince, String marriageStatus) {
        super(prince);
        this.marriageStatus = marriageStatus;
    }

    @Override
    public String getDescription() {
        return prince.getDescription() + "，婚姻状况：" + marriageStatus;
    }
}
