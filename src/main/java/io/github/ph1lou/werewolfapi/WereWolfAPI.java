package io.github.ph1lou.werewolfapi;

import fr.ph1lou.gameapi.GameAPI;
import fr.ph1lou.gameapi.IConfiguration;

import java.util.*;

/**
 * @author Ph1Lou
 */
public interface WereWolfAPI extends GameAPI<IPlayerWW> {

    /**
     * @return Collection the PlayerWW of the game
     */

    Collection<? extends IPlayerWW> getPlayerWW();

    /**
     * allow to get playerww with uuid
     * @param uuid uuid of the player
     * @return the instance of playerWW
     */

    Optional<IPlayerWW> getPlayerWW(UUID uuid);

    IVoteManager getVote();

    ILoverManager getLoversManager();

    @Override
    IConfigurationWereWolf getConfig();
}
