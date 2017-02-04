package com.proguard.demo.bean;

/**
 * @author 张全
 */

public class Person {
    private String name;
    private int age;
    private Child child;

    public Person(){

    }
    public  Person(String name){
        this.name=name;
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

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", child=" + child +
                '}';
    }

    public class InnerClass{
        public void fun(){

        }
    }
}
