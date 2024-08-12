package com.example.football.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String currency; // Para birimi

    @OneToMany(mappedBy = "team")
    private List<Player> players;
}
