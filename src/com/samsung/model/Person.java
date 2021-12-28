package com.samsung.model;

public class Person {
    private int age;
    private String firstName;
    private String secondName;
    private String phone;

    public Person(int age, String firstName, String secondName, String phone) {
        this(age,firstName,secondName);
        this.phone = phone;
    }

    public Person(int age, String firstName, String secondName) {
        this.age = age;
        this.firstName = firstName;
        this.secondName = secondName;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPhone() {
        return phone;
    }
}
