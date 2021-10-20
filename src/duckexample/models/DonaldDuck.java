package duckexample.models;

import duckexample.behaviors.flybehavior.FlyNoWay;
import duckexample.behaviors.quackbehavior.Squeak;

public class DonaldDuck extends Duck{

    public DonaldDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I´m Donald The Duck");
    }
}
