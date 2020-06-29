package io.github.ph1lou.werewolfapi.events;

import org.bukkit.event.HandlerList;

import java.util.UUID;

public class SeerEvent extends SelectionEvent {


    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public SeerEvent(UUID playerUUID, UUID targetUUID){
        super(playerUUID,targetUUID);

    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

}
