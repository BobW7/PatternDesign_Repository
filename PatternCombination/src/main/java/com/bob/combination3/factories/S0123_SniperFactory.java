package com.bob.combination3.factories;

import com.bob.combination3.weapon.S0123_Sniper;
import com.bob.combination3.weapon.S0123_Weapon;

public class S0123_SniperFactory implements S0123_WeaponFactory {
    @Override
    public S0123_Weapon createWeapon() {
        return new S0123_Sniper("fire", "扣动扳机单点狙击", "1000");
    }
}
