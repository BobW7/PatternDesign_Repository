package com.bob.combination3.weapon;

public class S0123_Sniper extends S0123_Weapon {
    public S0123_Sniper(String outfit, String usage, String lethality) {
        super("狙击枪", outfit, usage, lethality);
    }

    @Override
    public String getDescription() {
        return weaponType + "：外观：" + outfit + "，用法：" + usage + "，杀伤力：" + lethality;
    }
}
