package com.bob.combination3;

public class S0123_Costume implements S0123_CharacterPart{
    public String costumeType;

    public S0123_Costume(String costumeType) {
        this.costumeType = costumeType;
    }

    @Override
    public String getDescription() {
        return costumeType;
    }
}
