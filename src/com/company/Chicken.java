package com.company;

public class Chicken extends Animal {
    public Chicken(int age) {
        super(3, 65, true, "chicken", true, true, false, false);


    }

    @Override
    public void sayHello() {
        System.out.println("kot-kot");
    }
}
