package com.company;

public class Animal extends Creature{
    private String type;
    private boolean domestic;
    private boolean edible;
    private boolean forFun;
    private boolean forSecure;


    public Animal(int age, double hp, boolean live, String type, boolean domestic, boolean edible, boolean forFun, boolean forSecure) {
        super(age, hp, true);
        this.type = type;
        this.domestic = domestic;
        this.edible = edible;
        this.forFun = forFun;
        this.forSecure = forSecure;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isDomestic() {
        return domestic;
    }

    public void setDomestic(boolean domestic) {
        this.domestic = domestic;
    }

    public boolean isEdible() {
        return edible;
    }

    public void setEdible(boolean edible) {
        this.edible = edible;
    }

    public boolean isForFun() {
        return forFun;
    }

    public void setForFun(boolean forFun) {
        this.forFun = forFun;
    }

    public boolean isForSecure() {
        return forSecure;
    }

    public void setForSecure(boolean forSecure) {
        this.forSecure = forSecure;
    }

    public void  sayHello () {
        System.out.println("Hi, I am a " + getClass());
    }


}
