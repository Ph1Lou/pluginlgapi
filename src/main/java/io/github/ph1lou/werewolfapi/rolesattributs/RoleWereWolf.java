package io.github.ph1lou.werewolfapi.rolesattributs;

import io.github.ph1lou.werewolfapi.IPlayerWW;
import io.github.ph1lou.werewolfapi.WereWolfAPI;
import io.github.ph1lou.werewolfapi.enums.Aura;

public abstract class RoleWereWolf extends RoleWW {


    public RoleWereWolf(WereWolfAPI game, IPlayerWW playerWW, String key){
        super(game, playerWW,key);
    }


    @Override
    public boolean isWereWolf() {
        return true;
    }

    @Override
    public Aura getDefaultAura() {
        return Aura.DARK;
    }

}
