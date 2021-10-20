package duckexample.models;

import duckexample.behaviors.flybehavior.FlyWithWings;
import duckexample.behaviors.quackbehavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("I´m real Mallard Duck");
    }
}
