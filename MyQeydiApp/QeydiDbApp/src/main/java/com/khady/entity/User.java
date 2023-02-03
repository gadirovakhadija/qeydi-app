package com.khady.entity;

public class User {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String university;
    private int point;
    private String experience;
    private Teachway teachway;
    private Subject subject;
    private String email;
    private String code;
    private double cost;
    private String password;

    public User() {
    }

    public User(int id) {
        this.id = id;
    }

    public User(int id, String name, String surname, int age, String university, int point, String experience, Teachway teachway, Subject subject, String email, String code, double cost, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.university = university;
        this.point = point;
        this.experience = experience;
        this.teachway = teachway;
        this.subject = subject;
        this.email = email;
        this.code = code;
        this.cost = cost;
        this.password = password;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Teachway getTeachway() {
        return teachway;
    }

    public void setTeachway(Teachway teachway) {
        this.teachway = teachway;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", university='" + university + '\'' +
                ", point=" + point +
                ", experience='" + experience + '\'' +
                ", teachWay=" + teachway +
                ", subject=" + subject +
                ", email='" + email + '\'' +
                ", code='" + code + '\'' +
                ", cost=" + cost +
                ", password='" + password + '\'' +
                '}';
    }
}
