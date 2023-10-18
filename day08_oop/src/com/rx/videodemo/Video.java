package com.rx.videodemo;

public class Video {

    private int id;
    private String videoName;
    private double price;
    private double score;
    private String dirName;
    private String actName;
    private String wannaWatch;

    public Video(int id,String videoName, double price, double score, String dirName, String actName, String wannaWatch) {
        this.id=id;
        this.videoName = videoName;
        this.price = price;
        this.score = score;
        this.dirName = dirName;
        this.actName = actName;
        this.wannaWatch = wannaWatch;
    }

    public Video() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getDirName() {
        return dirName;
    }

    public void setDirName(String dirName) {
        this.dirName = dirName;
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    public String getWannaWatch() {
        return wannaWatch;
    }

    public void setWannaWatch(String wannaWatch) {
        this.wannaWatch = wannaWatch;
    }
}
