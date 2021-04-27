package com.practice.application.model;

import javax.persistence.*;

@Entity
public class Developer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="team_id_id", nullable=false)
    private Team team_id; // Reference to the team

    private String name;
    private String phone_number;

    public Developer(){}

    public Developer(String name, String phone_number){this.name = name; this.phone_number = phone_number;}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
