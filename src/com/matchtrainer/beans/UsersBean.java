package com.matchtrainer.beans;

import com.matchtrainer.models.MatchTrainerService;
import com.matchtrainer.models.User;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class UsersBean implements Serializable {
    private MatchTrainerService service;
    private User user;

    public UsersBean(){
        service = new MatchTrainerService();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId(){
        return this.getUser().getId();
    }

    public void setId(int id){
        this.getUser().setId(id);
    }

    public int getProfileId(){
        return this.getUser().getProfileId();
    }

    public void setProfileId(int id){
        this.getUser().setProfileId(id);
    }

    public String getEmail(){
        return this.getUser().getEmail();
    }

    public void setEmail(String email){
        this.getUser().setEmail(email);
    }

    public String getPassword(){
        return this.getUser().getPassword();
    }

    public void setPassword(String password){
        this.getUser().setPassword(password);
    }

    public boolean isEnabled(){
        return this.getUser().isEnabled();
    }

    public void setEnabled(boolean enabled){
        this.getUser().setEnabled(enabled);
    }


    public String searchUser1(){
        return "success";
    }


    public String searchUser(){
        this.setUser(new User());
        return "success";
    }

    public User createUser(){
        return service.createUser(this.getUser());
    }

    public String doValidateUser(){
        if (service.findUserEmailPassword(this.getEmail(),this.getPassword()) == null)
        return "error";
        else
        return "success";
    }


}
