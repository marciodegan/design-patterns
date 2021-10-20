package gameexample;

import gameexample.behaviors.BowAndArrowBehavior;
import gameexample.models.King;
import gameexample.models.Knight;
import gameexample.models.Queen;
import gameexample.models.Troll;

public class GameSimulator {
    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.display();
        queen.fight();

        System.out.println("======");
        King king = new King();
        king.display();
        king.fight();

        System.out.println("======");

        Knight knight = new Knight();
        knight.display();
        knight.fight();

        System.out.println("======");

        Troll troll = new Troll();
        troll.display();
        troll.fight();
        System.out.println("=> setting new weapon");
        troll.setWeaponBehavior(new BowAndArrowBehavior());
        troll.fight();

    }
}
