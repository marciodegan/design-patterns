package gameexample.behaviors;

public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("I´m using Bow and Arrow");
    }
}
