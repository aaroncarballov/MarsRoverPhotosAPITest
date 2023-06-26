package org.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CameraPOJO {
    private int id;
    private String name;
    private int rover_id;
    private String full_name;

    public CameraPOJO(){}

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("rover_id")
    public int getRover_id() {
        return rover_id;
    }

    @JsonProperty("rover_id")
    public void setRover_id(int rover_id) {
        this.rover_id = rover_id;
    }

    @JsonProperty("full_name")
    public String getFull_name() {
        return full_name;
    }

    @JsonProperty("full_name")
    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }
}
