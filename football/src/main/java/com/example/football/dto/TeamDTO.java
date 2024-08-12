package com.example.football.dto;

public class TeamDTO {
    private Long id;
    private String name;
    private String city;

    public TeamDTO() {
    }

    public TeamDTO(Long id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
