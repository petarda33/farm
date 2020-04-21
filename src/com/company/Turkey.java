package com.company;

public class Turkey extends Animal implements AttackerInterface{


    public Turkey(int age) {
        super(age, 110, true, "turkey", true, true, false, false);
    }


    @Override
    public void sayHello() {
        System.out.println("turk-turk");
    }

    @Override
    public int getAttackerScore() {
        return 30;
    }
}
