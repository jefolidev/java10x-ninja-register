package dev.java10x.NinjaRegister;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "ninja_user")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;

    @Setter
    @Getter
    String name;

    @Setter
    @Getter
    String email;

    @Setter
    @Getter
    int age;

    public NinjaModel() {

    }

    public NinjaModel(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
}
