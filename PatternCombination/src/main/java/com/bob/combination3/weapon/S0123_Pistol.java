package com.bob.combination3.weapon;

public class S0123_Pistol extends S0123_Weapon {
    public S0123_Pistol(String outfit, String usage, String lethality) {
        super("手枪", outfit, usage, lethality);
    }

    @Override
    public String getDescription() {
        return weaponType + "：外观：" + outfit + "，用法：" + usage + "，杀伤力：" + lethality;
    }
}
