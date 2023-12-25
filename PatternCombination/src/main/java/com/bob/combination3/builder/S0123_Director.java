package com.bob.combination3.builder;

import com.bob.combination3.S0123_Player;

public class S0123_Director {
    private S0123_CharacterBuilder builder;

    public S0123_Director(S0123_CharacterBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(S0123_CharacterBuilder builder) {
        this.builder = builder;
    }

    public S0123_Player construct() {
        builder.buildBody();
        builder.buildCostume();
        builder.buildWeapon();
        return builder.player;
    }
}
