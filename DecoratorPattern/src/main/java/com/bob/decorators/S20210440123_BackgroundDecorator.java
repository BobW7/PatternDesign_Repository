package com.bob.decorators;

import com.bob.S20210440123_Prince;

public class S20210440123_BackgroundDecorator extends S20210440123_PrinceDecorator{
    private final String character;
    public S20210440123_BackgroundDecorator(S20210440123_Prince prince, String character) {
        super(prince);
        this.character = character;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"，背景:"+character;
    }
}
