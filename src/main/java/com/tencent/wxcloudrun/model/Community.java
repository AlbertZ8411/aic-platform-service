package com.tencent.wxcloudrun.model;




public class Community {
    private int id;
    private String imageSrc;
    private String title;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public Community(int id, String imageSrc, String title, String description) {
        this.id = id;
        this.imageSrc = imageSrc;
        this.title = title;
        this.description = description;
    }
}
