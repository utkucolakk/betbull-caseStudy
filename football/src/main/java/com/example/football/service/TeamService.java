package com.example.football.service;

import com.example.football.model.Team;
import com.example.football.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    public Optional<Team> getTeamById(Long id) {
        return teamRepository.findById(id);
    }

    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

    public Team updateTeam(Long id, Team team) {
        team.setId(id);
        return teamRepository.save(team);
    }

    public void deleteTeam(Long id) {
        teamRepository.deleteById(id);
    }
}
