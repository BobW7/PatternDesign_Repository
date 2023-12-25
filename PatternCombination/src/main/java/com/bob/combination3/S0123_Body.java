package com.bob.combination3;

public class S0123_Body implements S0123_CharacterPart{
    public String bodyType;

    public S0123_Body(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String getDescription() {
        return bodyType;
    }
}
