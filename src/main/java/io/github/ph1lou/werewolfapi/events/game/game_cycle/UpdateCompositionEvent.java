package io.github.ph1lou.werewolfapi.events.game.game_cycle;

import fr.ph1lou.gameapi.enums.UpdateCompositionReason;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;


public class UpdateCompositionEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final UpdateCompositionReason reason;
    private final String key;
    private final int modifier;
    private boolean cancel=true;

    public UpdateCompositionEvent(String key, UpdateCompositionReason reason, int modifier) {
        this.key=key;
        this.reason=reason;
        this.modifier=modifier;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public int getModifier() {
        return this.modifier;
    }

    @Override
    public boolean isCancelled() {
        return this.cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel=cancel;
    }

    public UpdateCompositionReason getReason() {
        return reason;
    }

    public String getKey() {
        return key;
    }
}