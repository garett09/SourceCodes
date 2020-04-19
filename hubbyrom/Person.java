package com.hubbyrom;
import java.util.Scanner;
public class Person {

    private int age,age1;
    private String name, gender;
    private double height;

    Person() {
        Scanner input = new Scanner (System.in);
         Scanner in = new Scanner (System.in);//other scanner for another input
      //  System.out.println("How old are you?");
        age = input.nextInt();
        age1 = in.nextInt();//hindi need pero nandito lang dapat.
        gender = "Male";
        height = 5.10;
        name = "Adrian Garett Sian";
        System.out.println("Person object was created and initialized ");
        System.out.println("This person is " + this.age + " years old.");
    }
    public String getName (){ //getter
        return this.name;
        
    }
    public int getAge(){ //this gets the age of the this.age
        return this.age;
    }
    public void setName(String newName){ //setter. this sets for a new name in the name method
        this.name= newName;
    }
    void sleep(double duration) {
        System.out.println("This person sleeps " + duration + " hours a day.");

    }

    void walk(double distance) {
        System.out.println("He" + " can walk " + distance + " kilometers per day.");
    }
}
