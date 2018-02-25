package com.matchtrainer.beans;

import com.matchtrainer.models.MatchTrainerService;
import com.matchtrainer.models.Membership;

import java.util.Date;

public class MembershipsBean {
    private MatchTrainerService service;
    private Membership membership;

    public MembershipsBean(){
        service = new MatchTrainerService();
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public int getId(){
        return this.getMembership().getId();
    }

    public void setId(int id){
        this.getMembership().setId(id);
    }

    public int getCustomerId(){
        return this.getMembership().getCustomerId();
    }

    public void setCustomerId(int customerId){
        this.getMembership().setCustomerId(customerId);
    }

    public int getMembershipTypeId(){
        return this.getMembership().getMembershipTypeId();
    }

    public void setMembershipTypeId(int membershipTypeId){
        this.getMembership().setMembershipTypeId(membershipTypeId);
    }

    public int getPaymentTypeId(){
        return this.getMembership().getPaymentTypeId();
    }

    public void setPaymentTypeId(int paymentTypeId){
        this.getMembership().setPaymentTypeId(paymentTypeId);
    }

    public Date getStartDate(){
        return this.getMembership().getStartDate();
    }

    public void setStartDate(Date startDate){
        this.getMembership().setStartDate(startDate);
    }

    public Date getExpirationDate(){
        return this.getMembership().getExpirationDate();
    }

    public void setExpirationDate(Date expirationDate){
        this.getMembership().setExpirationDate(expirationDate);
    }

    public double getCoachPrice(){
        return this.getMembership().getCoachPrice();
    }

    public void setCoachPrice(double coachPrice){
        this.getMembership().setCoachPrice(coachPrice);
    }

    public boolean isEnabled(){
        return this.getMembership().isEnabled();
    }

    public void setEnabled(boolean enabled){
        this.getMembership().setEnabled(enabled);
    }

    public String createMembership(){

            service.createMembership(this.getMembership());
            return "success";



    }

}
