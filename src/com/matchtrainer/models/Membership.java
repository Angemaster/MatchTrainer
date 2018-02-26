package com.matchtrainer.models;

import java.util.Date;

public class Membership {
    private int id;
    private int customerId;
    private int membershipTypeId;
    private int paymentTypeId;
    private Date startDate;
    private Date expirationDate;
    private double coachPrice;
    private boolean enabled;

    public Membership() {
    }

    public Membership(int id, int customerId, int membershipTypeId, int paymentTypeId, Date startDate, Date expirationDate, double coachPrice, boolean enabled) {
        this.id = id;
        this.customerId = customerId;
        this.membershipTypeId = membershipTypeId;
        this.paymentTypeId = paymentTypeId;
        this.startDate = startDate;
        this.expirationDate = expirationDate;
        this.coachPrice = coachPrice;
        this.enabled = enabled;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getMembershipTypeId() {
        return membershipTypeId;
    }

    public void setMembershipTypeId(int membershipTypeId) {
        this.membershipTypeId = membershipTypeId;
    }

    public int getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(int paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getCoachPrice() {
        return coachPrice;
    }

    public void setCoachPrice(double coachPrice) {
        this.coachPrice = coachPrice;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
