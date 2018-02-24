package com.matchtrainer.models;

public class User {
    private int id;
    private int profileId;
    private String email;
    private String password;
    private boolean enabled;

    public User() {
    }

    public User(int id, int profileId, String email, String password, boolean enabled) {
        this.setId(id);
        this.setProfileId(profileId);
        this.setEmail(email);
        this.setPassword(password);
        this.setEnabled(enabled);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
