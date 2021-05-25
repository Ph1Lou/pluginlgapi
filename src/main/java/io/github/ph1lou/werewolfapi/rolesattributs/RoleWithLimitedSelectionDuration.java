package io.github.ph1lou.werewolfapi.rolesattributs;

import fr.ph1lou.gameapi.enums.StatePlayer;
import fr.ph1lou.gameapi.rolesattributs.IPower;
import io.github.ph1lou.werewolfapi.IPlayerWW;
import io.github.ph1lou.werewolfapi.WereWolfAPI;
import io.github.ph1lou.werewolfapi.events.roles.SelectionEndEvent;
import org.bukkit.event.EventHandler;

public abstract class RoleWithLimitedSelectionDuration extends RoleVillage implements IPower {

    public RoleWithLimitedSelectionDuration(WereWolfAPI game, IPlayerWW playerWW, String key) {
        super(game, playerWW,key);
    }
    private boolean power=true;

    @EventHandler
    public void onSelectionEnd(SelectionEndEvent event) {

        if (!this.hasPower()) return;

        if(!this.getPlayer().isState(StatePlayer.ALIVE)){
            return;
        }

        this.setPower(false);

        this.getPlayer().sendMessageWithKey("werewolf.check.end_selection");
    }

    @Override
    public final void setPower(boolean power) {
        this.power=power;
    }

    @Override
    public final boolean hasPower() {
        return(this.power);
    }
}
