package io.github.ph1lou.werewolfapi.statistics;

import io.github.ph1lou.werewolfapi.ILover;
import io.github.ph1lou.werewolfapi.IPlayerWW;
import io.github.ph1lou.werewolfapi.enums.LoverType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

public class PlayerReview implements IPlayerReview {

    private final UUID uuid;
    private final String role;
    private final int deathTime;
    private final List<UUID> killers;
    private final int nbKill;
    private final boolean infected;
    private final boolean solitary;
    private final String name;
    private UUID amnesiacLover = null;
    private final List<UUID> lovers = new ArrayList<>();
    private UUID cursedLover = null;

    public PlayerReview(IPlayerWW playerWW) {

        this.uuid = playerWW.getMojangUUID();
        this.role = playerWW.getRole().getDeathRole();
        for (ILover ILover : playerWW.getLovers()) {

            List<IPlayerWW> lovers = new ArrayList<>(ILover.getLovers());
            lovers.remove(playerWW);

            if (!lovers.isEmpty()) {

                if (ILover.isKey(LoverType.AMNESIAC_LOVER.getKey())) {
                    this.amnesiacLover = lovers.get(0).getMojangUUID();
                } else if (ILover.isKey(LoverType.CURSED_LOVER.getKey())) {
                    this.cursedLover = lovers.get(0).getMojangUUID();
                } else this.lovers.addAll(lovers.stream().map(io.github.ph1lou.werewolfapi.IPlayerWW::getMojangUUID).collect(Collectors.toList()));
            }
        }

        this.deathTime = playerWW.getDeathTime();
        this.killers = playerWW.getKillers().stream().filter(Objects::nonNull).map(io.github.ph1lou.werewolfapi.IPlayerWW::getMojangUUID).collect(Collectors.toList());
        this.nbKill = playerWW.getNbKill();
        this.solitary = playerWW.getRole().isSolitary();
        this.infected = playerWW.getRole().getInfected();
        this.name = playerWW.getName();
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return role;
    }

    public UUID getAmnesiacLover() {
        return amnesiacLover;
    }

    public List<UUID> getLovers() {
        return lovers;
    }

    public UUID getCursedLover() {
        return cursedLover;
    }

    public int getDeathTime() {
        return deathTime;
    }

    public List<UUID> getKillers() {
        return killers;
    }

    public int getNbKill() {
        return nbKill;
    }

    public boolean isInfected() {
        return infected;
    }

    public boolean isSolitary() {
        return solitary;
    }
}
