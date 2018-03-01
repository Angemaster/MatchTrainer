package com.matchtrainer.beans;

import com.matchtrainer.models.CustomerScore;
import com.matchtrainer.models.MatchTrainerService;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class CustomerScoreBean implements Serializable {
    private MatchTrainerService service;
    private CustomerScore customerScore;
    public CustomerScoreBean(){
        service = new MatchTrainerService();
    }

    public CustomerScore getCustomerScore() {
        return customerScore;
    }

    public void setCustomerScore(CustomerScore customerScore) {
        this.customerScore = customerScore;
    }

    public int getId(){
        return this.getCustomerScore().getId();
    }
    public void setId(int id){
        this.getCustomerScore().setId(id);
    }

    public int getTrainerId(){
        return this.getCustomerScore().getTrainerId();
    }
    public void setTrainerId(int trainerId){
        this.getCustomerScore().setTrainerId(trainerId);

    } public int getStarNumber(){
        return this.getCustomerScore().getStarNumber();
    }
    public void setStarNumber(int starNumber){
        this.getCustomerScore().setStarNumber(starNumber);

    }
    public String getCommentary(){
        return this.getCustomerScore().getCommentary();
    }

    public void setcommentary(String commentary) {
        this.getCustomerScore().setCommentary(commentary);
    }

    public String newCustomeScore(){
        this.setCustomerScore(new CustomerScore());
        return "success";
    }

    public String createCustomerScore(){
            service.createCustomerScore(this.getCustomerScore());
            return "success";
    }

}
