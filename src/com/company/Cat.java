package com.company;

public class Cat extends Animal {
    public Cat(int age) {
        super(age, 100, true, "cat", true, false, true, false);


    }

    @Override
    public void sayHello() {
        System.out.println("maiuuuuu");
    }
}
