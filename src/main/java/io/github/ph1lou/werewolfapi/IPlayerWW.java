package io.github.ph1lou.werewolfapi;


import fr.ph1lou.gameapi.IPlayer;
import io.github.ph1lou.werewolfapi.rolesattributs.IRoleWW;

import java.util.List;

/**
 * @author Ph1Lou
 */

public interface IPlayerWW extends IPlayer<IPlayerWW> {

    void setRole(IRoleWW role);

    IRoleWW getRole();

    List<? extends ILover> getLovers();

    void addLover(ILover ILover);

    void removeLover(ILover ILover);
}

