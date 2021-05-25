package io.github.ph1lou.werewolfapi;

import fr.ph1lou.gameapi.rolesattributs.ITransformed;
import io.github.ph1lou.werewolfapi.enums.Camp;
import io.github.ph1lou.werewolfapi.rolesattributs.IRoleWW;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@SuppressWarnings("unused")
public class DescriptionBuilder {

    private Supplier<String> description;
    private Supplier<String> power;
    private Supplier<String> items;
    private Supplier<String> effects;
    private Supplier<String> equipments;
    private Supplier<String> command;
    private final List<Supplier<String>> extraLines = new ArrayList<>();

    private final WereWolfAPI game;
    private final IRoleWW role;

    public DescriptionBuilder(WereWolfAPI game, IRoleWW role){
        this.game=game;
        this.role = role;
    }

    public DescriptionBuilder setDescription(Supplier<String> key){
        this.description= key;
        return this;
    }

    public DescriptionBuilder setPower(Supplier<String> key) {
        this.power = key;
        return this;
    }

    public DescriptionBuilder setCommand(Supplier<String> key) {
        this.command = key;
        return this;
    }

    public DescriptionBuilder setItems(Supplier<String> key) {
        this.items = key;
        return this;
    }

    public DescriptionBuilder addExtraLines(Supplier<String> key) {
        this.extraLines.add(key);
        return this;
    }

    public DescriptionBuilder setEffects(Supplier<String> key) {
        this.effects = key;
        return this;
    }

    public DescriptionBuilder setEquipments(Supplier<String> key) {
        this.equipments = key;
        return this;
    }

    public String build(){

        StringBuilder sb = new StringBuilder();
        Camp camp = Camp.valueOf(Camp.class,role.getCamp());

        sb.append(this.game.translate("werewolf.description.role", this.game.translate(this.role.getDeathRole()) +
                (!this.role.getDeathRole().equals(this.role.getKey()) ? this.game.translate("werewolf.role.thief.thief", this.game.translate(this.role.getKey())) : "") +
                (this.role.getInfected() ? this.game.translate("werewolf.end.infect") : "") +
                (this.role.isSolitary() ? this.game.translate("werewolf.end.solitary") : "")));

        sb.append(this.game.translate("werewolf.description.camp",
                camp.getChatColor()+this.game.translate(camp.getKey())));

        sb.append(this.role.getInfected()?
                this.game.translate("werewolf.description.effect",this.game.translate("werewolf.description.werewolf"))
                :"");

        sb.append(this.role instanceof ITransformed ?
                this.game.translate("werewolf.description.transformed",
                        this.game.translate(((ITransformed) this.role).getTransformed()?
                                "werewolf.description.yes"
                                : "werewolf.description.no"))
                : "");

        if(this.description!=null){
            sb.append(this.game.translate("werewolf.description.description", this.description.get()));
        }

        if(this.power!=null){
            sb.append(this.game.translate("werewolf.description.power",this.power.get()));
        }

        if(this.effects!=null){
            sb.append(this.game.translate("werewolf.description.effect",this.effects.get()));
        }

        if(this.items!=null){
            sb.append(this.game.translate("werewolf.description.item",this.items.get()));
        }

        if(this.equipments!=null){
            sb.append(this.game.translate("werewolf.description.equipment",this.equipments.get()));
        }

        if(this.command!=null){
            sb.append(this.game.translate("werewolf.description.command",this.command.get()));
        }

        this.extraLines.forEach(stringSupplier -> sb.append(stringSupplier.get()));

        return this.game.translate("werewolf.description._") +
                sb.toString() +
                this.game.translate("werewolf.description._");

    }
}
