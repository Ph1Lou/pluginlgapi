package io.github.ph1lou.werewolfapi;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface IStuffManager {

    /**
     * return the extra loots looted when a playerWW die
     * @return a list of ItemStack
     */
    List<ItemStack> getDeathLoot();

    /**
     * Get the Start Loot inventory
     * @return an Inventory
     */
    Inventory getStartLoot();

    /**
     * clear out the current death loot list
     */
    void clearDeathLoot();

    /**
     * clear out the current inventory of start loot
     */
    void clearStartLoot();

    /**
     * add the specified ItemStack to the current death loot list
     * @param i
     */
    void addDeathLoot(ItemStack i);
    void loadStuffChill();
    void loadAllStuffMeetUP();
    void loadAllStuffDefault();

    /**
     * load roles stuff and stuff start and death from the specified file
     * @param configName the specified file
     */
    void load(String configName);

    /**
     * save  roles stuff and stuff start and death in the specified file
     * @param configName the specified file
     */
    void save(String configName);

    /**
     * get the stuff of a role depending on the role key
     * @return a map of role key as key and the stuff of the role as value
     */
    Map<String, List<ItemStack>> getStuffRoles();

    /**
     * get the stuff inventory of a player in stuff edition mode
     * @return a map of UUID as key and Inventory as value
     */
    Map<UUID, Inventory> getTempStuff();

}
