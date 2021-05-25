package io.github.ph1lou.werewolfapi.rolesattributs;

import io.github.ph1lou.werewolfapi.enums.Camp;
import org.jetbrains.annotations.NotNull;

/**
 * methods to handling camp
 */
public interface ICamp {

    boolean isWereWolf();

    boolean getInfected();

    boolean isTransformedToNeutral();

    void setTransformedToNeutral(boolean neutral);

    boolean isNeutral();

    void setInfected();

    void setSolitary(boolean solitary);

    boolean isSolitary();
}
