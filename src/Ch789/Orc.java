package Ch789;

/**
 * Created by KBrown on 7/15/14.
 * Orc class implements Monster interface
 */
public class Orc implements Monster {
    public String name = "Orc";
    public int hitpoints = 20;

    public void takeDamage(int amount) {
        if(hitpoints > amount) {
            hitpoints = hitpoints - amount;
        }
        else hitpoints = 0;
    }

    public String name() {
        return name;
    }

    public int currentHitpoints() {
        return hitpoints;
    }
}