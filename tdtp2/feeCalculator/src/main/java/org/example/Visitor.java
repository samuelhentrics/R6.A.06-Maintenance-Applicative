package org.example;

public class Visitor {
    public int age; // years counter

    public Visitor (int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
