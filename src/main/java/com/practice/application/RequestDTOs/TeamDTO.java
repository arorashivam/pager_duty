package com.practice.application.RequestDTOs;

public class TeamDTO {
    private String name;

    public TeamDTO(String name) {
        this.name = name;
    }

    public TeamDTO() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
