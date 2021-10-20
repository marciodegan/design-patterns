package gameexample.models;

import gameexample.behaviors.BowAndArrowBehavior;

public class Knight extends Character {

    public Knight() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void display() {
        System.out.println("I´m a Knight");
    }
}
