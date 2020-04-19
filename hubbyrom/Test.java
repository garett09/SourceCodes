package com.hubbyrom;

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        p1.walk(3.7);
        
        Person p2 = new Person();
        p2.setName("Pedro Sian");
        System.out.println(p2.getName());
    }

}
