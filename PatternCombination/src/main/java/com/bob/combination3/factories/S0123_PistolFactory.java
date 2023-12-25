package com.bob.combination3.factories;

import com.bob.combination3.weapon.S0123_Pistol;
import com.bob.combination3.weapon.S0123_Weapon;

public class S0123_PistolFactory implements S0123_WeaponFactory {
    @Override
    public S0123_Weapon createWeapon() {
        return new S0123_Pistol("fire", "扣动扳机射击", "600");
    }
}
