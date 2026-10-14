package dev.java10x.NinjaRegister.Ninjas;

import dev.java10x.NinjaRegister.Missions.MissionsModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "ninja_user")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Getter
    private UUID id;

    @Setter
    @Getter
    private String name;

    @Setter
    @Getter
    private String email; 

    @Setter
    @Getter
    private int age;

    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "missions_id") // Foreing Key
    private MissionsModel currentMission;

    public NinjaModel(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
}
