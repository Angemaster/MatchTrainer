package com.matchtrainer.models;

public class Page {
    private int id;
    private String name;
    private String url;
    private boolean enable;


    public Page(int id, String name, String url, boolean enable) {
        this.setId(id);
        this.setName(name);
        this.setUrl(url);
        this.setEnable(enable);
    }

    public Page() {

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
