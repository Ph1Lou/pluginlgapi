package io.github.ph1lou.werewolfapi.enums;

public enum TimerWereWolf {

    ROLE_DURATION("werewolf.menu.timers.role_duration"),
    WEREWOLF_LIST("werewolf.menu.timers.werewolf_list"),
    VOTE_BEGIN("werewolf.menu.timers.vote_begin"),
    LOVER_DURATION("werewolf.menu.timers.lover_duration"),
    MODEL_DURATION("werewolf.menu.timers.model_duration"),
    ANGEL_DURATION("werewolf.menu.timers.angel_duration"),
    CITIZEN_DURATION("werewolf.menu.timers.citizen_duration"),
    VOTE_DURATION("werewolf.menu.timers.vote_duration"),
    RIVAL_DURATION("werewolf.menu.timers.rival_duration"),
    POWER_DURATION("werewolf.menu.timers.power_duration"),
    FOX_SMELL_DURATION("werewolf.menu.timers.fox_smell_duration"),
    WEREWOLF_CHAT_DURATION("werewolf.menu.timers.werewolf_chat_duration"),
    SUCCUBUS_DURATION("werewolf.menu.timers.succubus_duration");

    private final String key;

    TimerWereWolf(String key) {
        this.key = key;
    }

    public String getKey() {
        return this.key;
    }
}
