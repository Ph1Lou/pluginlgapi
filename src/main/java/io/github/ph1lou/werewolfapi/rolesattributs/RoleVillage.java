package io.github.ph1lou.werewolfapi.rolesattributs;

import io.github.ph1lou.werewolfapi.IPlayerWW;
import io.github.ph1lou.werewolfapi.WereWolfAPI;
import io.github.ph1lou.werewolfapi.enums.Aura;

public abstract class RoleVillage extends RoleWW {

    public RoleVillage(WereWolfAPI game, IPlayerWW playerWW, String key){
        super(game, playerWW,key);
    }

    @Override
    public Aura getDefaultAura() {
        return Aura.LIGHT;
    }
}
