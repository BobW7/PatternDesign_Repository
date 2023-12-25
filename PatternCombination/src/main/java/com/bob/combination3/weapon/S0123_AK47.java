package com.bob.combination3.weapon;

public class S0123_AK47 extends S0123_Weapon{
    public S0123_AK47(String outfit, String usage, String lethality) {
        super("AK47冲锋枪", outfit, usage, lethality);
    }

    @Override
    public String getDescription() {
        return "AK47" + "：外观：" + outfit + "，用法：" + usage + "，杀伤力：" + lethality;
    }
}
