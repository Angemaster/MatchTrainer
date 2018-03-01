package com.matchtrainer.models;

public class CustomerScore {
    private int id;
    private int trainerId;
    private int starNumber;
    private String  commentary;

    public CustomerScore() {
    }

    public CustomerScore(int id, int trainerId, int starNumber, String commentary) {
        this.id = id;
        this.trainerId = trainerId;
        this.starNumber = starNumber;
        this.commentary = commentary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public int getStarNumber() {
        return starNumber;
    }

    public void setStarNumber(int starNumber) {
        this.starNumber = starNumber;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }


}
