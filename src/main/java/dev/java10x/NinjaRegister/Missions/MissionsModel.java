package dev.java10x.NinjaRegister.Missions;

import dev.java10x.NinjaRegister.Missions.Utils.Dificulty;
import dev.java10x.NinjaRegister.Missions.Utils.Status;
import dev.java10x.NinjaRegister.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "missions")
public class MissionsModel {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Setter
    @Getter
    private String description;

    @Setter
    @Getter
    private Dificulty dificulty;

    @Setter
    @Getter
    private Status status;

    @Setter
    @Getter
    @OneToMany(mappedBy = "missions" )
    private List<NinjaModel> ninjas;
}
