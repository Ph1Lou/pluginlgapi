package io.github.ph1lou.werewolfapi.events;

import io.github.ph1lou.werewolfapi.WereWolfAPI;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class StartEvent extends Event {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final WereWolfAPI wereWolfAPI;


    public StartEvent(WereWolfAPI wereWolfAPI) {
        this.wereWolfAPI=wereWolfAPI;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public WereWolfAPI getWereWolfAPI() {
        return wereWolfAPI;
    }
}
