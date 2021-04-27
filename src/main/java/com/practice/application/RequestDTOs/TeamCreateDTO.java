package com.practice.application.RequestDTOs;


import java.util.List;

public class TeamCreateDTO {
    private TeamDTO teamDTO;
    private List<DeveloperDTO> developerDTO;

    public TeamCreateDTO(){}

    public TeamCreateDTO(TeamDTO teamDTO, List<DeveloperDTO> developerDTO) {
        this.teamDTO = teamDTO;
        this.developerDTO = developerDTO;
    }

    public TeamDTO getTeamDTO() {
        return teamDTO;
    }

    public void setTeamDTO(TeamDTO teamDTO) {
        this.teamDTO = teamDTO;
    }

    public List<DeveloperDTO> getDeveloperDTO() {
        return developerDTO;
    }

    public void setDeveloperDTO(List<DeveloperDTO> developerDTO) {
        this.developerDTO = developerDTO;
    }
}