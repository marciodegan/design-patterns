package gameexample.behaviors;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("I´m using the knife");
    }
}
