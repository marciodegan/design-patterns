package gameexample.models;

import gameexample.behaviors.SwordBehavior;

public class King extends Character{

    public King(){
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void display() {
        System.out.println("I´m a King");
    }


}
