package com.tencent.wxcloudrun.model.VO;

public class TeacherVO {
    private int id;
    private String name;
    private String avatar;
    private String title;

    // 无参构造函数
    public TeacherVO() {
    }

    // 带参构造函数
    public TeacherVO(int id, String name, String avatar, String title) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.title = title;
    }

    // Getter 和 Setter 方法
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        return "TeacherVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}