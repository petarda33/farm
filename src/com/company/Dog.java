package com.company;

public class Dog extends Animal implements AttackerInterface {


    public Dog(int age) {
        super(age, 60, true, "dog", true, false, true, true);
    }

    public int getAttackerScore() {
        return 65;
    }

    @Override
    public void sayHello() {
        System.out.println("Vau-vau");
    }
}