package com.matchtrainer.beans;

import com.matchtrainer.models.MatchTrainerService;
import com.matchtrainer.models.User;

import java.io.Serializable;

public class UsersBean implements Serializable {
    private MatchTrainerService service;
    private User user;
    
    public UsersBean(){
        service = new MatchTrainerService();
    }
}
