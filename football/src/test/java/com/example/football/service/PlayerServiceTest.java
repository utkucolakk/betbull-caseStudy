package com.example.football.service;

import com.example.football.model.Player;
import com.example.football.repository.PlayerRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class PlayerServiceTest {

    @Mock
    private PlayerRepository playerRepository;

    @InjectMocks
    private PlayerService playerService;

    public PlayerServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllPlayers() {
        Player player1 = new Player();
        player1.setId(1L);
        player1.setName("Player 1");

        Player player2 = new Player();
        player2.setId(2L);
        player2.setName("Player 2");

        when(playerRepository.findAll()).thenReturn(Arrays.asList(player1, player2));

        List<Player> players = playerService.getAllPlayers();
        assertEquals(2, players.size());
    }
}
