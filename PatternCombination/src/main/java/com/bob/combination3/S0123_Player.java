package com.bob.combination3;

import com.bob.combination3.states.S0123_DeadState;
import com.bob.combination3.states.S0123_NormalState;
import com.bob.combination3.states.S0123_PauseState;
import com.bob.combination3.states.S0123_State;
import com.bob.combination3.weapon.S0123_Weapon;

public class S0123_Player {
    private String name;
    private S0123_CharacterPart weapon;
    private S0123_CharacterPart body;
    private S0123_CharacterPart costume;
    private S0123_State currentState = new S0123_NormalState();

    public void restart() {
        currentState = new S0123_NormalState();
    }

    public void gotHit() {
        currentState = new S0123_DeadState();
    }

    public void pauseGame() {
        currentState = new S0123_PauseState();
    }

    public void resumeGame() {
        currentState = new S0123_NormalState();
    }

    public void action() {
        currentState.performAction();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(S0123_Weapon weapon) {
        this.weapon = weapon;
    }

    public void setBody(S0123_Body body) {
        this.body = body;
    }

    public void setCostume(S0123_Costume costume) {
        this.costume = costume;
    }

    public void show() {
        System.out.println("角色：" + name);
        System.out.println("身体：" + body.getDescription());
        System.out.println("服装：" + costume.getDescription());
        System.out.println("武器：" + weapon.getDescription());
        System.out.println("====================================");
    }
}
