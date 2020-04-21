package com.company;

public class Main {

    public static void main(String[] args) {
        Creature[] creatures = new Creature[100];
        creatures[0] = getRandomCreature();
        if(creatures[0].getClass().equals("Cat")) {
            Cat c = (Cat)creatures[0];
        }

        for (int i = 0; i < creatures.length; i++) {
            creatures[i] = getRandomCreature();
        }
    }
    public static Creature getRandomCreature() {
       int rnd = (int) Math.random() *100;
       if (rnd < 60) {
           return new Chicken(2);
       } else if (rnd < 65) {
           return new Turkey(3);
       } else if (rnd < 70) {
           return new Cat(4);
       } else if (rnd < 80) {
           return new Dog(5);
       } else {
           return new Wolf(6);
       }
    }

    public static void attackAnimal(Wolf attacker, Animal poorAnimal) {
        while (poorAnimal.isLive() || attacker.isLive()) {
            poorAnimal.setHp((int) (poorAnimal.getHp() - attacker.getAttackerScore()));
            if (poorAnimal.isLive()) {
                //adott obj egy adott osztályra vagy interface-re castolható-e
                if (poorAnimal instanceof AttackerInterface) {
                    AttackerInterface ai = (AttackerInterface) poorAnimal;
                    attacker.setHp((int) (attacker.getHp() - ai.getAttackerScore()));
                } else {
                    poorAnimal.setHp(0);
                }
            }
        }
    }
}
