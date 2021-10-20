package duckexample.models;

import duckexample.behaviors.flybehavior.FlyNoWay;
import duckexample.behaviors.quackbehavior.Quack;

public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I´m a model duck");
    }
}
