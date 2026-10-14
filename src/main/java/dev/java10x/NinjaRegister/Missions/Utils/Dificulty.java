package dev.java10x.NinjaRegister.Missions.Utils;

import lombok.Getter;

@Getter
public enum Dificulty {
    S("God Dificulty"),
    A("Kage Dificulty"),
    B("Anbu Dificulty"),
    C("Rounnin Dificulty"),
    D("Shounnin Dificulty"),
    E("Gennin Dificulty");

    private final String description;

    Dificulty(String description) {
        this.description = description;
    }

}
