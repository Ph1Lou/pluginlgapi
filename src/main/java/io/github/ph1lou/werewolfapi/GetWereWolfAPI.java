package io.github.ph1lou.werewolfapi;

import fr.minuskube.inv.InventoryManager;
import fr.ph1lou.gameapi.ILanguageManager;
import fr.ph1lou.gameapi.registers.IRegisterManager;

/**
 * @author Ph1Lou
 */

@SuppressWarnings("unused")

public interface GetWereWolfAPI {
    WereWolfAPI getWereWolfAPI();
    IRegisterManager getRegisterManager();
    ILanguageManager getLangManager();
    InventoryManager getInvManager();
}