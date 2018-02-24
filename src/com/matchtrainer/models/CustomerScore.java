package com.matchtrainer.models;

public class CustomerScore {
    private int id;
    private int trainerId;
    private int starnumber;
    private String  commentary;

    public CustomerScore(int id, int trainerId, int starnumber, String commentary) {
        this.setId(id);
        this.setTrainerId(trainerId);
        this.setStarnumber(starnumber);
        this.setCommentary(commentary);
    }

    public CustomerScore() {

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

    public int getStarnumber() {
        return starnumber;
    }

    public void setStarnumber(int starnumber) {
        this.starnumber = starnumber;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }
}
