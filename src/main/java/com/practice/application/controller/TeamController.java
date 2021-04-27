package com.practice.application.controller;

import com.practice.application.RequestDTOs.DeveloperDTO;
import com.practice.application.RequestDTOs.TeamCreateDTO;
import com.practice.application.model.Developer;
import com.practice.application.model.Team;
import com.practice.application.repository.DeveloperRepository;
import com.practice.application.service.ITeamService;
import com.practice.application.service.TeamServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TeamController {

    private ITeamService teamService;
    private DeveloperRepository developerRepository;

    @Autowired
    public TeamController(TeamServiceImpl teamService, DeveloperRepository developerRepository) {
        this.teamService = teamService;
        this.developerRepository = developerRepository;
    }

    // Isolation and propogation level
    // TODO : handle exceptions, separation of concern
    @PostMapping("/team")
    public void create(@RequestBody TeamCreateDTO teamCreateDTO) {
        Team team = new Team();
        team.setName(teamCreateDTO.getTeamDTO().getName());
        this.teamService.create(team);

        List<DeveloperDTO> developerDTOList = teamCreateDTO.getDeveloperDTO();
        List<Developer> developers = new ArrayList<>();
        for (DeveloperDTO developerDTO : developerDTOList) {
            developers.add(new Developer(developerDTO.getName(), developerDTO.getPhone_number()));
        }
        this.developerRepository.saveAll(developers);
    }

}
