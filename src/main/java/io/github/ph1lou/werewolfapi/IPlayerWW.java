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
     * Send a message to the playerWW with a String
     * @param message a String
     */
    @Deprecated
    void sendMessage(String message);

    /**
     * Send a message to the playerWW with a langage key; %s will be replaced by
     * args
     * @param key the langage key
     * @param args the args that replace %s
     */
    void sendMessageWithKey(String key,Object ... args);

    /**
     * Send a message with a langage key and a sound to the playerWW;
     * %s will be replaced by args
     * @param key the langage key
     * @param sound the sound played
     * @param args the args that replace %s
     */
    void sendMessageWithKey(String key, Sound sound, Object ... args);

    /**
     * Send a message to the playerWW using the bungee chat TextComponent
     * @param textComponent the TextComponent send to the playerWW
     */
    void sendMessage(TextComponent textComponent);

    /**
     * Send a message using the bungee chat TextComponent and a
     * sound to the playerWW
     * @param textComponent the TextComponent send to the playerWW
     * @param sound the sound played
     */
    void sendMessage(TextComponent textComponent, Sound sound);

    /**
     * Add a potion effect to the playerWW with the specified duration and amplifier
     * @param potion the PotionEffectType to add
     * @param duration the duration of the potion effect
     * @param amplifier the amplifier of the potion effect
     */
    void addPotionEffect(PotionEffectType potion, int duration, int amplifier);

    /**
     * Add a potion effect to the playerWW with an infinite duration and an
     * amplifier of 0
     * @param potion the PotionEffectType to add
     */
    void addPotionEffect(PotionEffectType potion);

    /**
     * Remove a potion effect to the playerWW with a PotionEffectType
     * @param potion the PotionEffectType to remove
     */
    void removePotionEffect(PotionEffectType potion);

    /**
     * Get all actives potion effect of the playerWW
     * @return a List of PotionEffectType
     */
    List<? extends PotionEffectType> getPotionEffects();

    /**
     * Teleport the playerWW to the specified location
     * @param location the specified location
     */
    void teleport(Location location);

    /**
     * set the list of items of the playerWW when he died
     * @param items the new list of items death
     */
    void setItemDeath(ItemStack[] items);

    /**
     * Get the list of items of the playerWW when he died
     * @return the list of items death
     */
    List<? extends ItemStack> getItemDeath();

    /**
     * Clear the list of items death
     */
    void clearItemDeath();

    /**
     * Set the state of the playerWW
     * @param statePlayer the new StatePlayer
     */
    void setState(StatePlayer statePlayer) ;

    /**
     * return true if the specified StatePlayer match the current StatePlayer
     * @param statePlayer the specified playerWW
     * @return a boolean
     */
    boolean isState(StatePlayer statePlayer);

    /**
     * Add one kill to the playerWW amount of kills
     */
    void addOneKill() ;

    /**
     * Get the number of kills made by the playerWW
     * @return an int
     */
    int getNbKill();

    /**
     * Get the Mojang UUID of the playerWW
     * @return an UUID
     */
    UUID getMojangUUID();

    /**
     * Set the role of the playerWW
     * @param role the new role
     */
    void setRole(IRole role);

    /**
     * Get the current role of the playerWW
     * @return the role instance
     */
    IRole getRole();

    /**
     * return true if the playerWW role key is equals to the specified key
     * @param key the specified key
     * @return a boolean
     */
    boolean isKey(String key);

    /**
     * Set the spawn of the playerWW to the given Location
     * @param spawn the given Location
     */
    void setSpawn(Location spawn);

    /**
     * Get the spawn Location of the playerWW
     * @return a Location
     */
    Location getSpawn();

    /**
     * Add a playerWW killer to the current playerWW
     * @param playerWW the killer to add
     */
    void addKiller(IPlayerWW playerWW);

    /**
     * Get the list of playerWW who killed the current playerWW
     * @return a List of IPlayerWW
     */
    List<? extends IPlayerWW> getKillers();

    /**
     * Set the playerWW death time
     * @param deathTime the new deathTime
     */
    void setDeathTime(Integer deathTime);

    /**
     * Get the playerWW death time
     * @return an int
     */
    int getDeathTime();

    /**
     * Get the lovers of the playerWW
     * @return a List of ILover
     */
    List<? extends ILover> getLovers();

    /**
     * Add a lover to the playerWW
     * @param ILover the lover to add
     */
    void addLover(ILover ILover);

    /**
     * Remove a lover to the playerWW
     * @param ILover the lover to remove
     */
    void removeLover(ILover ILover);

    /**
     * Get the Optional last killer of the player
     * @return an Optional IPlayerWW
     */
    Optional<IPlayerWW> getLastKiller();

    /**
     * Get the name of the playerWW
     * @return a String
     */
    String getName() ;

    /**
     * Set the name of the playerWW
     * @param name the new name
     */
    void setName(String name) ;

    /**
     * Get the playerWW state
     * @return a StatePlayer
     */
    StatePlayer getState();

    /**
     * Get the disconnected time of the playerWW
     * @return an int
     */
    int getDisconnectedTime();

    /**
     * Set the playerWW disconnected time to the new value
     * @param disconnectedTime the new value
     */
    void setDisconnectedTime(int disconnectedTime);

    /**
     * Get the UUID of the playerWW
     * @return an UUID
     */
    UUID getUUID();

    /**
     * Update the specified player to the playerWW after reconnect
     * @param player the specified player
     */
    void updateAfterReconnect(Player player);

    /**
     * Set the disconnected Location of the playerWW
     * @param location the disconnected Location
     */
    void setDisconnectedLocation(Location location);

    /**
     * Add an item to the playerWW
     * @param item the item to give
     */
    void addItem(ItemStack item);

    /**
     * Get the max health of the playerWW
     * @return an int
     */
    int getMaxHealth();

    /**
     * Get the location of the playerWW
     * @return the location of the playerWW
     */
    @NotNull
    Location getLocation();
}

