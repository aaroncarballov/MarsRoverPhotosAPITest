package org.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhotoPOJO {
    private int id;
    private int sol;
    private CameraPOJO camera;
    private String img_src;
    private String earth_date;
    private RoverPOJO rover;

    public PhotoPOJO(){}

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("sol")
    public int getSol() {
        return sol;
    }

    @JsonProperty("sol")
    public void setSol(int sol) {
        this.sol = sol;
    }

    @JsonProperty("camera")
    public CameraPOJO getCamera() {
        return camera;
    }

    @JsonProperty("camera")
    public void setCamera(CameraPOJO camera) {
        this.camera = camera;
    }

    @JsonProperty("img_src")
    public String getImg_src() {
        return img_src;
    }

    @JsonProperty("img_src")
    public void setImg_src(String img_src) {
        this.img_src = img_src;
    }

    @JsonProperty("earth_date")
    public String getEarth_date() {
        return earth_date;
    }

    @JsonProperty("earth_date")
    public void setEarth_date(String earth_date) {
        this.earth_date = earth_date;
    }

    @JsonProperty("rover")
    public RoverPOJO getRover() {
        return rover;
    }

    @JsonProperty("rover")
    public void setRover(RoverPOJO rover) {
        this.rover = rover;
    }
}
