package com.bob.combination3.weapon;

import com.bob.combination3.S0123_CharacterPart;

public abstract class S0123_Weapon implements S0123_CharacterPart {
    //武器类型
    public String weaponType;
    //外观
    public String outfit;
    //用法
    public String usage;
    //杀伤力
    public String lethality;

    public S0123_Weapon(String weaponType, String outfit, String usage, String lethality) {
        this.weaponType = weaponType;
        this.outfit = outfit;
        this.usage = usage;
        this.lethality = lethality;
    }
}
