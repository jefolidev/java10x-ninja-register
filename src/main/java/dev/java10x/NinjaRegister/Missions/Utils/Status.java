package dev.java10x.NinjaRegister.Missions.Utils;

import lombok.Getter;

@Getter
public enum Status {
    IN_PROGRESS("Mission in progess"),
    SUCCESS("Mission Success"),
    FAILED("Mission Failed"),
    SCHEDULED("Mission Scheduled");

    private final String description;

    Status(String description) {
        this.description = description;
    }
}
