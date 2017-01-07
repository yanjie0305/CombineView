package com.example.timeview;

/**
 * Created by ${郭艳杰} on 2017/1/7.
 */

public class Info {
    public String title;
    public String time;
    public String des;

    public Info(String title, String time, String des) {
        this.title = title;
        this.time = time;
        this.des = des;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
