package Ch789;
import java.util.ArrayList;
/**
 * Created by KBrown on 7/15/14.
 * Class that tracks Monsters and keeps them in an Arraylist.
 * Iterate through the
 * list and make each monster take 10 points of
 * damage. After you have damaged all of the
 * monsters, report the name and current hit points
 * of all monsters.
 */
public class MonsterTracker {
    private ArrayList<Monster> monsters = new ArrayList<Monster>();
    private Orc orc = new Orc();
    private Troll troll = new Troll();

    private void setUp() {
        monsters.add(orc);
        monsters.add(troll);
    }

    private void start() {
        for(Monster m : monsters) {
            m.takeDamage(10);
        }

        for(Monster m : monsters) {
            System.out.println(m.name() + " " + m.currentHitpoints());
        }
    }

    public static void main (String[] args) {
        MonsterTracker tracker = new MonsterTracker();
        tracker.setUp();
        tracker.start();
    }
}