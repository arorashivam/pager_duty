package com.practice.application.service;

import com.practice.application.RequestDTOs.TeamCreateDTO;
import com.practice.application.model.Team;

public interface ITeamService {
    public void create(Team team);
}
