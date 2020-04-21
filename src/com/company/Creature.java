package com.company;

import java.util.Objects;

public class Creature {
    private int age;
    private double hp;
    boolean live;

    public Creature (int age, double hp, boolean live) {
        this.age = age;
        this.hp = hp;
        this.live = true;
    }

    public void getDeathScream () {
        System.out.println("See you in the HELL!!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp <= 0) {
            hp = 0;
            setLive(false);
            getDeathScream();
        }
        this.hp = hp;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Creature creature = (Creature) o;
        return age == creature.age &&
                Double.compare(creature.hp, hp) == 0 &&
                live == creature.live;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "age=" + age +
                ", hp=" + hp +
                ", live=" + live +
                '}';
    }
}
