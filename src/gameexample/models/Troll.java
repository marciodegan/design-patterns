package gameexample.models;

import gameexample.behaviors.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void display() {
        System.out.println("I´m a troll");
    }
}
