package com.matchtrainer.models;

public class PaymentType {
    private int id;
    private String name;


    public PaymentType(int id, String name) {
        this.setId(id);
        this.setName(name);
    }

    public PaymentType() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
