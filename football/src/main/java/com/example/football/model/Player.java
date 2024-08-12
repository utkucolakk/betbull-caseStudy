package com.example.football.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private int experienceMonths; // Tecrübe (ay cinsinden)

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
}
