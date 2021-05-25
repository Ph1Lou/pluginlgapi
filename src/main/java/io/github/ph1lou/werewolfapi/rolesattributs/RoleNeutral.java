package io.github.ph1lou.werewolfapi.rolesattributs;

import io.github.ph1lou.werewolfapi.IPlayerWW;
import io.github.ph1lou.werewolfapi.WereWolfAPI;
import io.github.ph1lou.werewolfapi.enums.Aura;

public abstract class RoleNeutral extends RoleWW {

    public RoleNeutral(WereWolfAPI game, IPlayerWW playerWW, String key){
        super(game, playerWW,key);
    }

    @Override
    public boolean isNeutral() {
        return !super.isWereWolf();
    }

    @Override
    public Aura getDefaultAura() {
        return Aura.NEUTRAL;
    }

}