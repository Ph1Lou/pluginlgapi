package io.github.ph1lou.werewolfapi.rolesattributs;


import fr.ph1lou.gameapi.rolesattributs.IDisplay;
import fr.ph1lou.gameapi.rolesattributs.IRole;
import io.github.ph1lou.werewolfapi.IPlayerWW;

public interface IRoleWW extends IRole<IPlayerWW>, IAura, ICamp {


    String getDeathRole();

    void setDeathRole(String role);

}
