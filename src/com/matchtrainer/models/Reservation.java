package com.matchtrainer.models;

import java.util.Date;

public class Reservation {
    private int customerId;
    private int trainerId;
    private int visitorId;
    private String trainingPurpose;
    private String traininGlevel;
    private String traininPlace;
    private Date meetingDate;
    private String address;
    private String hour;
    private String state;
    private String commentary;
    private boolean enabled;

    public Reservation() {
    }

    public Reservation(int customerId, int trainerId, int visitorId, String trainingPurpose, String traininGlevel, String traininPlace, Date meetingDate, String address, String hour, String state, String commentary, boolean enabled) {
        this.setCustomerId(customerId);
        this.setTrainerId(trainerId);
        this.setVisitorId(visitorId);
        this.setTrainingPurpose(trainingPurpose);
        this.setTraininGlevel(traininGlevel);
        this.setTraininPlace(traininPlace);
        this.setMeetingDate(meetingDate);
        this.setAddress(address);
        this.setHour(hour);
        this.setState(state);
        this.setCommentary(commentary);
        this.setEnabled(enabled);
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public int getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(int visitorId) {
        this.visitorId = visitorId;
    }

    public String getTrainingPurpose() {
        return trainingPurpose;
    }

    public void setTrainingPurpose(String trainingPurpose) {
        this.trainingPurpose = trainingPurpose;
    }

    public String getTraininGlevel() {
        return traininGlevel;
    }

    public void setTraininGlevel(String traininGlevel) {
        this.traininGlevel = traininGlevel;
    }

    public String getTraininPlace() {
        return traininPlace;
    }

    public void setTraininPlace(String traininPlace) {
        this.traininPlace = traininPlace;
    }

    public Date getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
