package com.matchtrainer.models;

import java.util.Date;

public class Customer {
    private int id;
    private User user;
    private int districtId;
    private String firstName;
    private String lastName;
    private String photoName;
    private String photoUrl;
    private String gender;
    private int age;
    private Date registrationDate;

    public Customer() {
    }

    public Customer(int id, User user, int districtId, String firstName, String lastName, String photoName, String photoUrl, String gender, int age, Date registrationDate) {
        this.id = id;
        this.user = user;
        this.districtId = districtId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.photoName = photoName;
        this.photoUrl = photoUrl;
        this.gender = gender;
        this.age = age;
        this.registrationDate = registrationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId=districtId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
