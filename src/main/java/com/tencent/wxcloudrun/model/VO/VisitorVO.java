package com.tencent.wxcloudrun.model.VO;

public class VisitorVO {

    private int id;
    private String topic;
    private String imgPath;
    private String title;

    // 构造函数
    public VisitorVO(int id, String topic, String imgPath, String title) {
        this.id = id;
        this.topic = topic;
        this.imgPath = imgPath;
        this.title = title;
    }

    // Getter 方法
    public int getId() {
        return id;
    }

    public String getTopic() {
        return topic;
    }

    public String getImgPath() {
        return imgPath;
    }

    public String getTitle() {
        return title;
    }

    // Setter 方法
    public void setId(int id) {
        this.id = id;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
