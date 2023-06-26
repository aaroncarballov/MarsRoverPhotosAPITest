package org.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RoverPOJO {
    private int id;
    private String name;
    private String landing_date;
    private String launch_date;
    private String status;

    public RoverPOJO(){}

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

    @JsonProperty("landing_date")
    public String getLanding_date() {
        return landing_date;
    }

    @JsonProperty("landing_date")
    public void setLanding_date(String landing_date) {
        this.landing_date = landing_date;
    }

    @JsonProperty("launch_date")
    public String getLaunch_date() {
        return launch_date;
    }

    @JsonProperty("launch_date")
    public void setLaunch_date(String launch_date) {
        this.launch_date = launch_date;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }
}
