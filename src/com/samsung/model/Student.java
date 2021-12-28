package com.samsung.model;

public class Student extends Person{
    private String group;
    private int score;
    public Student(int age, String firstName, String secondName, String phone) {
        super(age, firstName, secondName, phone);
    }

    public Student(int age, String firstName, String secondName) {
        super(age, firstName, secondName);
    }
    public Student(Person p,String group, int score) {
        super(p.getAge(), p.getFirstName(), p.getSecondName());
        this.group = group;
        this.score = score;
    }


    public void setGroup(String group) {
        this.group = group;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getGroup() {
        return group;
    }

    public int getScore() {
        return score;
    }
}
