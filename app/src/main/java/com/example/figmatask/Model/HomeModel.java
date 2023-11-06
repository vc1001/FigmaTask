package com.example.figmatask.Model;

public class HomeModel {

    private int homeimage;
    private String homename,homeflavour,homerating;

    public HomeModel(int homeimage, String homename, String homeflavour, String homerating) {
        this.homeimage = homeimage;
        this.homename = homename;
        this.homeflavour = homeflavour;
        this.homerating = homerating;
    }

    public int getHomeimage() {
        return homeimage;
    }

    public void setHomeimage(int homeimage) {
        this.homeimage = homeimage;
    }

    public String getHomename() {
        return homename;
    }

    public void setHomename(String homename) {
        this.homename = homename;
    }

    public String getHomeflavour() {
        return homeflavour;
    }

    public void setHomeflavour(String homeflavour) {
        this.homeflavour = homeflavour;
    }

    public String getHomerating() {
        return homerating;
    }

    public void setHomerating(String homerating) {
        this.homerating = homerating;
    }
}
















