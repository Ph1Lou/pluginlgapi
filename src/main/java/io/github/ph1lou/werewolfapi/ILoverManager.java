package io.github.ph1lou.werewolfapi;

import java.util.List;

public interface ILoverManager {

    /**
     * Get all lovers
     * @return a List of lovers
     */
    List<? extends ILover> getLovers();

    /**
     * Remove a lover
     * @param ILover the lover to remove
     */
    void removeLover(ILover ILover);

    /**
     * Add a lover
     * @param ILover the lover to add
     */
    void addLover(ILover ILover);

    /**
     * Distributes the lovers in the game
     */
    void repartition();
}
