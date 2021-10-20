package gameexample.models;

import gameexample.behaviors.KnifeBehavior;

public class Queen extends Character {

    public Queen(){
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void display() {
        System.out.println("I´m a queen");
    }



}
