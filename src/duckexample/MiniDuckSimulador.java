package duckexample;

import duckexample.behaviors.flybehavior.FlyRocketPowered;
import duckexample.behaviors.quackbehavior.Quack;
import duckexample.models.DonaldDuck;
import duckexample.models.Duck;
import duckexample.models.MallardDuck;
import duckexample.models.ModelDuck;

public class MiniDuckSimulador {

    public static void main (String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("======");

        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.performFly();
        System.out.println("=> setting new flyBehavior");
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        System.out.println("======");

        DonaldDuck donaldDuck = new DonaldDuck();
        donaldDuck.display();
        donaldDuck.performQuack();
        donaldDuck.performFly();
        System.out.println("=> setting new quackBehavior");
        donaldDuck.setQuackBehavior(new Quack());
        donaldDuck.performQuack();
    }
}
