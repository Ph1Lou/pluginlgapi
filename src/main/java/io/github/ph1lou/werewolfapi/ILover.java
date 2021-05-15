package io.github.ph1lou.werewolfapi;

import java.util.List;

public interface ILover {

    /**
     * Get the list of lovers
     * @return a List of PlayerWW
     */
    List<? extends IPlayerWW> getLovers();

    /**
     * Return true if the lover key match the given one
     * @param key the given key
     * @return a boolean
     */
    boolean isKey(String key);

    /**
     * Get the key of the lover
     * @return a String
     */
    String getKey();

    /**
     * Return true if the lover is alive
     * @return a boolean
     */
    boolean isAlive();

    /**
     * When a player is swap in the lover
     * @param oldIPlayerWW the player removed
     * @param newIPlayerWW the player added
     * @return true if the swap succeed
     */
    boolean swap(IPlayerWW oldIPlayerWW, IPlayerWW newIPlayerWW);

    /**
     * method call each second
     */
    void second();
}
