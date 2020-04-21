package com.company;

public class Wolf extends Animal implements AttackerInterface{


    public Wolf(int age) {
        super(age, 300, true, "wolf", false, false, false, false);
    }

    @Override
    public void sayHello() {
        System.out.println("vauuuuu");
    }

    @Override
    public int getAttackerScore() {
        return 100;
    }
}
