package com.example.football.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;

    @ManyToOne
    @JoinColumn(name = "team_from_id")
    private Team teamFrom; // Transfer edilen takım

    @ManyToOne
    @JoinColumn(name = "team_to_id")
    private Team teamTo; // Transferin yapıldığı takım

    private LocalDate transferDate; // Transfer tarihi
    private double transferFee; // Transfer ücreti
}
