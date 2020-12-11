package io.github.ph1lou.werewolfapi;


import io.github.ph1lou.werewolfapi.enums.StatePlayer;
import io.github.ph1lou.werewolfapi.rolesattributs.Roles;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

/**
 * @author Ph1Lou
 */

public interface PlayerWW {

    void setItemDeath(ItemStack[] items);

    List<? extends ItemStack> getItemDeath();


    void clearItemDeath();


    void setState(StatePlayer statePlayer) ;


    boolean isState(StatePlayer statePlayer);


    void addOneKill() ;


    int getNbKill();


    void addKLostHeart(int k);


    int getLostHeart() ;


    void setKit(boolean kit) ;


    boolean hasKit() ;


    void setRole(Roles role);


    Roles getRole();


    boolean isKey(String key);


    void setSpawn(Location spawn);


    Location getSpawn();


    void addKiller(PlayerWW playerWW);


    List<? extends PlayerWW> getKillers();


    void setDeathTime(Integer deathTime);


    int getDeathTime();


    void clearLostHeart() ;

    List<? extends LoverAPI> getLovers();

    void addLover(LoverAPI loverAPI);

    void removeLover(LoverAPI loverAPI);

    @Nullable
    PlayerWW getLastKiller();


    void setThief(boolean thief) ;


    boolean isThief();



    String getName() ;


    void setName(String name) ;


    @NotNull
    StatePlayer getState();

    int getDisconnectedTime();

    void setDisconnectedTime(int disconnectedTime);

    @NotNull
    UUID getUUID();
}

