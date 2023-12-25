package com.bob.combination3.builder;

import com.bob.combination3.S0123_Body;
import com.bob.combination3.S0123_Costume;
import com.bob.combination3.factories.S0123_AK47Factory;
import com.bob.combination3.factories.S0123_WeaponFactory;

public class S0123_PlayerABuilder extends S0123_CharacterBuilder {
    @Override
    public void buildBody() {
        player.setName("A类士兵");
        S0123_Body body = new S0123_Body("A类士兵的身体");
        player.setBody(body);
    }

    @Override
    public void buildCostume() {
        S0123_Costume costume = new S0123_Costume("A类士兵的服装");
        player.setCostume(costume);
    }

    @Override
    void buildWeapon() {
        S0123_WeaponFactory ak47Factory = new S0123_AK47Factory();
        player.setWeapon(ak47Factory.createWeapon());
    }
}
