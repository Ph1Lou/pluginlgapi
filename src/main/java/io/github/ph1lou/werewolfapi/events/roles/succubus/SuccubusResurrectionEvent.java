package io.github.ph1lou.werewolfapi.events.roles.succubus;

import fr.ph1lou.gameapi.events.game.life_cycle.ResurrectionEvent;
import io.github.ph1lou.werewolfapi.IPlayerWW;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class SuccubusResurrectionEvent extends ResurrectionEvent {

    private final IPlayerWW targetWW;
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public SuccubusResurrectionEvent(IPlayerWW playerWW, IPlayerWW targetWW) {
        super(playerWW);
        this.targetWW = targetWW;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    public IPlayerWW getTargetWW() {
        return targetWW;
    }
}