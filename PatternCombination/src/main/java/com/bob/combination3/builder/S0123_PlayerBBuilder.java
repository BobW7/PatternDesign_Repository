package com.bob.combination3.builder;

import com.bob.combination3.S0123_Body;
import com.bob.combination3.S0123_Costume;
import com.bob.combination3.factories.S0123_SniperFactory;
import com.bob.combination3.factories.S0123_WeaponFactory;

public class S0123_PlayerBBuilder extends S0123_CharacterBuilder {
    @Override
    public void buildBody() {
        player.setName("B类士兵");
        S0123_Body body = new S0123_Body("B类士兵的身体");
        player.setBody(body);
    }

    @Override
    public void buildCostume() {
        S0123_Costume costume = new S0123_Costume("B类士兵的服装");
        player.setCostume(costume);
    }

    @Override
    void buildWeapon() {
        S0123_WeaponFactory sniperFactory = new S0123_SniperFactory();
        player.setWeapon(sniperFactory.createWeapon());
    }
}
