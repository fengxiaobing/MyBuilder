package com.example.mybuilder;

/**
 * Created by Administrator on 2017/12/9.
 */

public class PersonCommon {
    private String name;
    private int age;
    private double height;
    private double weight;

    public PersonCommon(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public PersonCommon(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public PersonCommon(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonCommon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
