package Ch789;

/**
 * Created by KBrown on 7/15/14.
 *
 */
public class Troll implements Monster{
    public String name = "Troll";
    public int hitpoints = 40;

    public void takeDamage(int amount) {
        amount = amount/2;
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
