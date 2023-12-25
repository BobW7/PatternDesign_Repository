package com.bob.combination3.factories;

import com.bob.combination3.weapon.S0123_AK47;
import com.bob.combination3.weapon.S0123_Weapon;

public class S0123_AK47Factory implements S0123_WeaponFactory {
    @Override
    public S0123_Weapon createWeapon() {
        return new S0123_AK47("fire", "扣动扳机连射", "400");
    }
}
