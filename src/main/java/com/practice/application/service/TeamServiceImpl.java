package com.practice.application.service;

import com.practice.application.RequestDTOs.TeamCreateDTO;
import com.practice.application.model.Team;
import com.practice.application.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements ITeamService {

    private TeamRepository teamRepository;

    @Autowired
    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public void create(Team team) {
        teamRepository.save(team);
    }
}
