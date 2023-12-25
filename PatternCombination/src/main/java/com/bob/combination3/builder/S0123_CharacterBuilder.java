package com.bob.combination3.builder;

import com.bob.combination3.S0123_Player;

public abstract class S0123_CharacterBuilder {
    public S0123_Player player = new S0123_Player();

    abstract void buildBody();

    abstract void buildCostume();

    abstract void buildWeapon();
}
