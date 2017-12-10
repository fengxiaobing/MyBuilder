package com.example.mybuilder;

import android.widget.Button;

/**
 * Created by Administrator on 2017/12/9.
 */

public class PersonBuilder {
    private String name;
    private int age;
    private double height;
    private double weight;

    private PersonBuilder(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.height = builder.height;
        this.weight = builder.weight;
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



    //在普通类的基础上新加一个内部类Builder
    static class Builder{
        private String name;
        private int age;
        private double height;
        private double weight;
         Builder name(String name){
            this.name = name;
            return this;
        }
         Builder age(int age){
            this.age = age;
            return this;
        }
         Builder height(double height){
            this.height = height;
            return this;
        }
         Builder weight(double weight){
            this.weight = weight;
            return this;
        }
         PersonBuilder Build(){
            return new PersonBuilder(this);
        }
    }
}
