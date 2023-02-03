package com.khady.entity;

public class Teachway {
    private int id;
    private String teachway;

    public Teachway() {
    }

    public Teachway(int id, String teachway) {
        this.id = id;
        this.teachway = teachway;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeachway() {
        return teachway;
    }

    public void setTeachway(String teachway) {
        this.teachway = teachway;
    }

    @Override
    public String toString() {
        return "TeachWay{" +
                "id=" + id +
                ", teachway='" + teachway + '\'' +
                '}';
    }
}
