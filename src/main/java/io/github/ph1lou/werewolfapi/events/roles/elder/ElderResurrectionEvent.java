package io.github.ph1lou.werewolfapi.events.roles.elder;

import fr.ph1lou.gameapi.events.game.life_cycle.ResurrectionEvent;
import io.github.ph1lou.werewolfapi.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class ElderResurrectionEvent extends ResurrectionEvent {


    private static final HandlerList HANDLERS_LIST = new HandlerList();

    private boolean killerIsVillager;

    public ElderResurrectionEvent(IPlayerWW playerWW, boolean killerIsVillager) {
        super(playerWW);
        this.killerIsVillager = killerIsVillager;
    }


    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    public boolean isKillerAVillager() {
        return killerIsVillager;
    }

    public void setKillerAVillager(boolean killerIsVillager) {
        this.killerIsVillager = killerIsVillager;
    }

}