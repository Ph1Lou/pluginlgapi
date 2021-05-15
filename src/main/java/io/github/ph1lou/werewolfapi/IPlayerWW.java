package io.github.ph1lou.werewolfapi;


import io.github.ph1lou.werewolfapi.enums.Sound;
import io.github.ph1lou.werewolfapi.enums.StatePlayer;
import io.github.ph1lou.werewolfapi.rolesattributs.IRole;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Ph1Lou
 */

public interface IPlayerWW {

    /**
     * increase playerWW max health by the specified value
     * @param heart the specified value
     */
    void addPlayerMaxHealth(int heart);

    /**
     * decrease playerWW max health by the specified value
     * @param heart the specified value
     */
    void removePlayerMaxHealth(int heart);

    /**
     * add the specified amount of heart to the playerWW
     * @param heart the specified amount of heart
     */
    void addPlayerHealth(int heart);

    /**
     * remove the specified amount of heart to the playerWW
     * @param heart the specified amount of heart
     */
    void removePlayerHealth(int heart);

    /**
     * Send a message to a playerWW with a String
     * @param message a String
     */
    @Deprecated
    void sendMessage(String message);

    /**
     * Send a message to a player with a langage key; %s will be replaced by
     * args
     * @param key the langage key
     * @param args the args that replace %s
     */
    void sendMessageWithKey(String key,Object ... args);

    /**
     * Send a message with a langage key and a sound to a player;
     * %s will be replaced by args
     * @param key the langage key
     * @param sound the sound played
     * @param args the args that replace %s
     */
    void sendMessageWithKey(String key, Sound sound, Object ... args);

    void sendMessage(TextComponent textComponent);

    void sendMessage(TextComponent textComponent, Sound sound);

    void addPotionEffect(PotionEffectType potion, int duration, int amplifier);

    void addPotionEffect(PotionEffectType potion);

    void removePotionEffect(PotionEffectType potion);

    List<? extends PotionEffectType> getPotionEffects();

    void teleport(Location location);

    void setItemDeath(ItemStack[] items);

    List<? extends ItemStack> getItemDeath();

    void clearItemDeath();

    void setState(StatePlayer statePlayer) ;

    boolean isState(StatePlayer statePlayer);

    void addOneKill() ;

    int getNbKill();

    UUID getMojangUUID();

    void setRole(IRole role);

    IRole getRole();

    boolean isKey(String key);

    void setSpawn(Location spawn);

    Location getSpawn();

    void addKiller(IPlayerWW playerWW);

    List<? extends IPlayerWW> getKillers();

    void setDeathTime(Integer deathTime);

    int getDeathTime();

    List<? extends ILover> getLovers();

    void addLover(ILover ILover);

    void removeLover(ILover ILover);

    Optional<IPlayerWW> getLastKiller();

    String getName() ;

    void setName(String name) ;

    StatePlayer getState();

    int getDisconnectedTime();

    void setDisconnectedTime(int disconnectedTime);

    UUID getUUID();

    void updateAfterReconnect(Player player);

    void setDisconnectedLocation(Location location);

    void addItem(ItemStack item);

    int getMaxHealth();

    @NotNull
    Location getLocation();
}

