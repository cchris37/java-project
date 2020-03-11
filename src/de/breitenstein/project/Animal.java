package de.breitenstein.project;

public class Animal{

    private String name;
    private int age;

    public void sleep() {
        System.out.println("Schlafen...");

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
