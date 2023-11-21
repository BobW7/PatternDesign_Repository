package com.bob.cache;

public class CharacterDecorator extends PrinceDecorator {
    private String character;

    public CharacterDecorator(Prince prince, String character) {
        super(prince);
        this.character = character;
    }

    @Override
    public String getDescription() {
        return prince.getDescription() + "，人品：" + character;
    }
}