package com.hubbyrom;

public class Person {

    private int age;
    private String name, gender;
    private double height;

    Person() {
        age = 19;
        gender = "Male";
        height = 5.10;
        name = "Adrian Garett Sian";
        System.out.println("Person object was created and initialized ");
    }
    public String getName (){ //getter
        return this.name;
        
    }
    public void setName(String newName){ //setter
        this.name= newName;
    }
    void sleep(double duration) {
        System.out.println("This person sleeps " + duration + " hours a day.");

    }

    void walk(double distance) {
        System.out.println(name + " can walk " + distance + " kilometers per day.");
    }
}
