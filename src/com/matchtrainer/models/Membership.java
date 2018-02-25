package com.matchtrainer.models;

import java.util.Date;

public class Membership {
    private int id;
    private int customer_id;
    private int membershiptype_id;
    private int paymenttype_id;
    private Date startdate;
    private Date expirationdate;
    private double coachprice;
    private boolean enabled;

    public Membership() {
    }

    public Membership(int id, int customer_id, int membershiptype_id, int paymenttype_id, Date startdate, Date expirationdate, double coachprice, boolean enabled) {
        this.id = id;
        this.customer_id = customer_id;
        this.membershiptype_id = membershiptype_id;
        this.paymenttype_id = paymenttype_id;
        this.startdate = startdate;
        this.expirationdate = expirationdate;
        this.coachprice = coachprice;
        this.enabled = enabled;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getMembershiptype_id() {
        return membershiptype_id;
    }

    public void setMembershiptype_id(int membershiptype_id) {
        this.membershiptype_id = membershiptype_id;
    }

    public int getPaymenttype_id() {
        return paymenttype_id;
    }

    public void setPaymenttype_id(int paymenttype_id) {
        this.paymenttype_id = paymenttype_id;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(Date expirationdate) {
        this.expirationdate = expirationdate;
    }

    public double getCoachprice() {
        return coachprice;
    }

    public void setCoachprice(double coachprice) {
        this.coachprice = coachprice;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
